package br.com.devfireclub.projetodashboard.api.aluno.services;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import br.com.devfireclub.projetodashboard.api.aluno.dtos.AlunoRequest;
import br.com.devfireclub.projetodashboard.api.aluno.dtos.AlunoResponse;
import br.com.devfireclub.projetodashboard.api.aluno.mappers.AlunoMapper;
import br.com.devfireclub.projetodashboard.core.repositories.AlunoRepository;

@Service
public class AlunoService {
    
    @Autowired
    AlunoRepository alunoRepository;
    
    @Autowired
    AlunoMapper alunoMapper;

    public List<AlunoResponse> findAll(){
        return alunoRepository.findAll()
                            .stream()
                            .map(alunoMapper::toResponse)
                            .toList();
    }

    public AlunoResponse findById(Long id){
        var aluno = alunoRepository.findByIdOrElseThrow(id);
        return alunoMapper.toResponse(aluno);
    }

    public AlunoResponse create(AlunoRequest alunoRequest){
        var alunoToCreate = alunoMapper.toModel(alunoRequest);
        var createdAluno = alunoRepository.save(alunoToCreate);
        return alunoMapper.toResponse(createdAluno);
    }

    public AlunoResponse update(Long id, AlunoResponse alunoResponse){
        var alunoToUpdate = alunoMapper.toUpdate(alunoResponse);
        var updatedAluno = alunoRepository.save(alunoToUpdate);
        return alunoMapper.toResponse(updatedAluno);
    }
    public void delete(Long id) {
        alunoRepository.deleteById(id);
    }

}
    

