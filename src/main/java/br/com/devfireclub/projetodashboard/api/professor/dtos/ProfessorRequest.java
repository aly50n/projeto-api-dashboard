package br.com.devfireclub.projetodashboard.api.professor.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfessorRequest {

    private String nome;

    private String curso;

    private Long idEndereco;
    
}
