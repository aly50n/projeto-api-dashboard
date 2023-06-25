package br.com.devfireclub.projetodashboard.api.projeto.mappers;

import org.springframework.stereotype.Component;
import br.com.devfireclub.projetodashboard.api.projeto.dtos.ProjetoRequest;
import br.com.devfireclub.projetodashboard.api.projeto.dtos.ProjetoResponse;
import br.com.devfireclub.projetodashboard.core.models.Projeto;

@Component
public class ProjetoMapper {
    public Projeto toModel(ProjetoRequest projetoRequest){
        return Projeto.builder()
                        .tituloProjeto(projetoRequest.getTituloProjeto())
                        .areaProjeto(projetoRequest.getAreaProjeto())
                        .palavraChave1(projetoRequest.getPalavraChave1())
                        .palavraChave2(projetoRequest.getPalavraChave2())
                        .palavraChave3(projetoRequest.getPalavraChave3())
                        .resumo(projetoRequest.getResumo())
                        .url(projetoRequest.getUrl())
                        .idProfessorResponsavel(projetoRequest.getIdProfessorResponsavel())
                        .idAlunoParticipante(projetoRequest.getIdAlunoParticipante())
                        .build();
    }

    public ProjetoResponse toResponse(Projeto projeto){
        return ProjetoResponse.builder()
                            .id(projeto.getId())
                            .tituloProjeto(projeto.getTituloProjeto())
                            .areaProjeto(projeto.getAreaProjeto())
                            .palavraChave1(projeto.getPalavraChave1())
                            .palavraChave2(projeto.getPalavraChave2())
                            .palavraChave3(projeto.getPalavraChave3())
                            .resumo(projeto.getResumo())
                            .url(projeto.getUrl())
                            .idProfessorResponsavel(projeto.getIdProfessorResponsavel())
                            .idAlunoParticipante(projeto.getIdAlunoParticipante())
                            .build();
    }

    public Projeto toUpdate(ProjetoResponse projetoUpdate){
        return Projeto.builder()
                    .id(projetoUpdate.getId())
                    .tituloProjeto(projetoUpdate.getTituloProjeto())
                    .areaProjeto(projetoUpdate.getAreaProjeto())
                    .palavraChave1(projetoUpdate.getPalavraChave1())
                    .palavraChave2(projetoUpdate.getPalavraChave2())
                    .palavraChave3(projetoUpdate.getPalavraChave3())
                    .resumo(projetoUpdate.getResumo())
                    .url(projetoUpdate.getUrl())
                    .idProfessorResponsavel(projetoUpdate.getIdProfessorResponsavel())
                    .idAlunoParticipante(projetoUpdate.getIdAlunoParticipante())
                    .build();
    }
}
