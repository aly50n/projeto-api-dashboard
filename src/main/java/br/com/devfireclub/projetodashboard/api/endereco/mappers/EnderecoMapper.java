package br.com.devfireclub.projetodashboard.api.endereco.mappers;

import org.springframework.stereotype.Component;

import br.com.devfireclub.projetodashboard.api.endereco.dtos.EnderecoRequest;
import br.com.devfireclub.projetodashboard.api.endereco.dtos.EnderecoResponse;
import br.com.devfireclub.projetodashboard.core.models.Endereco;

@Component
public class EnderecoMapper {
    
    public EnderecoResponse toResponse(Endereco endereco){
        return EnderecoResponse.builder()
                .id(endereco.getId())
                .rua(endereco.getRua())
                .numero(endereco.getNumero())
                .cep(endereco.getCep())
                .cidade(endereco.getCidade())
                .estado(endereco.getEstado())
                .pais(endereco.getPais())
                .build();
    }
    
    public Endereco toModel(EnderecoRequest enderecoRequest){
        return Endereco.builder()
                .rua(enderecoRequest.getRua())
                .numero(enderecoRequest.getNumero())
                .cep(enderecoRequest.getCep())
                .cidade(enderecoRequest.getCidade())
                .estado(enderecoRequest.getEstado())
                .pais(enderecoRequest.getPais())
                .build();
    }

    public Endereco toUpdate(EnderecoResponse enderecoUpdate){
        return Endereco.builder()
                .id(enderecoUpdate.getId())
                .rua(enderecoUpdate.getRua())
                .numero(enderecoUpdate.getNumero())
                .cep(enderecoUpdate.getCep())
                .cidade(enderecoUpdate.getCidade())
                .estado(enderecoUpdate.getEstado())
                .pais(enderecoUpdate.getPais())
                .build();
    }

}
