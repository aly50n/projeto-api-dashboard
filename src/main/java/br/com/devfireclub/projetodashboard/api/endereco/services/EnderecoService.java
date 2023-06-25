package br.com.devfireclub.projetodashboard.api.endereco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devfireclub.projetodashboard.api.endereco.dtos.EnderecoRequest;
import br.com.devfireclub.projetodashboard.api.endereco.dtos.EnderecoResponse;
import br.com.devfireclub.projetodashboard.api.endereco.mappers.EnderecoMapper;
import br.com.devfireclub.projetodashboard.core.repositories.EnderecoRepository;

@Service
public class EnderecoService {
    
    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private EnderecoMapper enderecoMapper;

    public List<EnderecoResponse> findAll(){
        return enderecoRepository.findAll()
                            .stream()
                            .map(enderecoMapper::toResponse)
                            .toList();
    }

    public EnderecoResponse findById(Long id){
        var endereco = enderecoRepository.findByIdOrElseThrow(id);
        return enderecoMapper.toResponse(endereco);
    }

    public EnderecoResponse findEnderecoByRua(String rua){
        var endereco = enderecoRepository.findByRua(rua);
        return enderecoMapper.toResponse(endereco);
    }

    public EnderecoResponse create(EnderecoRequest enderecoRequest){
        var enderecoToCreate = enderecoMapper.toModel(enderecoRequest);
        var createdEndereco = enderecoRepository.save(enderecoToCreate);
        return enderecoMapper.toResponse(createdEndereco);
    }

    public EnderecoResponse update(Long id, EnderecoResponse enderecoResponse){
        var enderecoToUpdate = enderecoMapper.toUpdate(enderecoResponse);
        var updatedEndereco = enderecoRepository.save(enderecoToUpdate);
        return enderecoMapper.toResponse(updatedEndereco);
    }

    public void delete(Long id) {
        enderecoRepository.deleteById(id);
    }

    

}
