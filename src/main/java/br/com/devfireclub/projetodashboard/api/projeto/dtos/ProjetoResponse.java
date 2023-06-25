package br.com.devfireclub.projetodashboard.api.projeto.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjetoResponse {
    
    private Long id;

    private String tituloProjeto;

    private String areaProjeto;

    private String palavraChave1;

    private String palavraChave2;

    private String palavraChave3;

    private String resumo;

    private String url;

    private Long idProfessorResponsavel;
    
    private Long idAlunoParticipante;
}
