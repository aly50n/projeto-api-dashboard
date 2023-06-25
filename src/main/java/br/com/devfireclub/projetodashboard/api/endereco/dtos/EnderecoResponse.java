package br.com.devfireclub.projetodashboard.api.endereco.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoResponse {
    
    private Long id;
    
    private String rua;

    private String numero;

    private String cep;

    private String cidade;

    private String estado;

    private String pais;
}
