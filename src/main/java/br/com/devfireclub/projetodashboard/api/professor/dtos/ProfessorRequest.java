package br.com.devfireclub.projetodashboard.api.professor.dtos;

import br.com.devfireclub.projetodashboard.core.models.Endereco;
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

    private Endereco endereco;
    
}
