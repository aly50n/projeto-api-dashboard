package br.com.devfireclub.projetodashboard.api.projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devfireclub.projetodashboard.api.projeto.dtos.ProjetoRequest;
import br.com.devfireclub.projetodashboard.api.projeto.dtos.ProjetoResponse;
import br.com.devfireclub.projetodashboard.api.projeto.mappers.ProjetoMapper;
import br.com.devfireclub.projetodashboard.core.repositories.ProjetoRepository;

@Service
public class ProjetoService {
    
    @Autowired
    private ProjetoRepository projetoRepository;

    @Autowired
    private ProjetoMapper projetoMapper;

    public List<ProjetoResponse> findAll(){
        return projetoRepository.findAll()
                            .stream()
                            .map(projetoMapper::toResponse)
                            .toList();
    }

    public ProjetoResponse findById(Long id){
        var projeto = projetoRepository.findByIdOrElseThrow(id);
        return projetoMapper.toResponse(projeto);
    }

    public ProjetoResponse findProjetoByTituloProjeto(String tituloProjeto){
        var projeto = projetoRepository.findByTituloProjeto(tituloProjeto);
        return projetoMapper.toResponse(projeto);
    }

    public ProjetoResponse create(ProjetoRequest projetoRequest){
        var projetoToCreate = projetoMapper.toModel(projetoRequest);
        var createdProjeto = projetoRepository.save(projetoToCreate);
        return projetoMapper.toResponse(createdProjeto);
    }

    public ProjetoResponse update(Long id, ProjetoResponse projetoResponse){
        var projetoToUpdate = projetoMapper.toUpdate(projetoResponse);
        var updatedProjeto = projetoRepository.save(projetoToUpdate);
        return projetoMapper.toResponse(updatedProjeto);
    }

    public void delete(Long id) {
        projetoRepository.deleteById(id);
    }

}
