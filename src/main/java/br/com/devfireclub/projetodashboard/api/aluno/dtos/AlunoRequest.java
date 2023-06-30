package br.com.devfireclub.projetodashboard.api.aluno.dtos;

import br.com.devfireclub.projetodashboard.core.models.Endereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlunoRequest {

    private String cpf;

    private String nome;
    
    private String curso;

    private Endereco endereco;
}
