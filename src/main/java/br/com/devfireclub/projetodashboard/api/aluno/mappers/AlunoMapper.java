package br.com.devfireclub.projetodashboard.api.aluno.mappers;

import org.springframework.stereotype.Component;
import br.com.devfireclub.projetodashboard.api.aluno.dtos.AlunoRequest;
import br.com.devfireclub.projetodashboard.api.aluno.dtos.AlunoResponse;
import br.com.devfireclub.projetodashboard.core.models.Aluno;

@Component
public class AlunoMapper {
    
    public Aluno toModel(AlunoRequest alunoRequest){
        return Aluno.builder()
                    .cpf(alunoRequest.getCpf())
                    .nome(alunoRequest.getNome())
                    .curso(alunoRequest.getCurso())
                    .idEndereco(alunoRequest.getIdEndereco())
                    .build();
    }

    public AlunoResponse toResponse(Aluno aluno){
        return AlunoResponse.builder().id(aluno.getId())
                            .cpf(aluno.getCpf())
                            .nome(aluno.getNome())
                            .matricula(aluno.getMatricula())
                            .curso(aluno.getCurso())
                            .idEndereco(aluno.getIdEndereco())
                            .build();
    }

    public Aluno toUpdate(AlunoResponse alunoUpdate){
        return Aluno.builder().id(alunoUpdate.getId())
                            .cpf(alunoUpdate.getCpf())
                            .nome(alunoUpdate.getNome())
                            .matricula(alunoUpdate.getMatricula())
                            .curso(alunoUpdate.getCurso())
                            .idEndereco(alunoUpdate.getIdEndereco())
                            .build();
    }
}
