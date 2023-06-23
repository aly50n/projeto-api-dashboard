package br.com.devfireclub.projetodashboard.api.professor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devfireclub.projetodashboard.api.professor.dtos.ProfessorRequest;
import br.com.devfireclub.projetodashboard.api.professor.dtos.ProfessorResponse;
import br.com.devfireclub.projetodashboard.api.professor.mappers.ProfessorMapper;
import br.com.devfireclub.projetodashboard.core.repositories.ProfessorRepository;

@Service
public class ProfessorService {
    
    @Autowired
    private ProfessorRepository professorRepository;
    
    @Autowired
    private ProfessorMapper professorMapper;

    public List<ProfessorResponse> findAll(){
        return professorRepository.findAll()
                            .stream()
                            .map(professorMapper::toResponse)
                            .toList();
    }

    public ProfessorResponse findById(Long id){
        var professor = professorRepository.findByIdOrElseThrow(id);
        return professorMapper.toResponse(professor);
    }

    public ProfessorResponse create(ProfessorRequest professorRequest){
        var professorToCreate = professorMapper.toModel(professorRequest);
        var createdProfessor = professorRepository.save(professorToCreate);
        return professorMapper.toResponse(createdProfessor);
    }

    public ProfessorResponse update(Long id, ProfessorResponse professorResponse){
        var professorToUpdate = professorMapper.toUpdate(professorResponse);
        var updatedProfessor = professorRepository.save(professorToUpdate);
        return professorMapper.toResponse(updatedProfessor);
    }

    public void delete(Long id) {
        professorRepository.deleteById(id);
    }




}
