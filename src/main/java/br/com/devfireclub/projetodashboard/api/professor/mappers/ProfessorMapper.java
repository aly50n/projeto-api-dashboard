package br.com.devfireclub.projetodashboard.api.professor.mappers;

import org.springframework.stereotype.Component;

import br.com.devfireclub.projetodashboard.api.professor.dtos.ProfessorRequest;
import br.com.devfireclub.projetodashboard.api.professor.dtos.ProfessorResponse;
import br.com.devfireclub.projetodashboard.core.models.Professor;

@Component
public class ProfessorMapper {
    public Professor toModel(ProfessorRequest professorRequest){
        return Professor.builder()
                    .nome(professorRequest.getNome())
                    .curso(professorRequest.getCurso())
                    .idEndereco(professorRequest.getIdEndereco())
                    .build();
    }

    public ProfessorResponse toResponse(Professor professor){
        return ProfessorResponse.builder().id(professor.getId())
                            .nome(professor.getNome())
                            .matricula(professor.getMatricula())
                            .curso(professor.getCurso())
                            .idEndereco(professor.getIdEndereco())
                            .build();
    }

    public Professor toUpdate(ProfessorResponse professorUpdate){
        return Professor.builder().id(professorUpdate.getId())
                            .nome(professorUpdate.getNome())
                            .matricula(professorUpdate.getMatricula())
                            .curso(professorUpdate.getCurso())
                            .idEndereco(professorUpdate.getIdEndereco())
                            .build();
    }
}
