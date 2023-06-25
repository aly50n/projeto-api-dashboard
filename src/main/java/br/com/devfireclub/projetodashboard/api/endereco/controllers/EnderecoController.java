package br.com.devfireclub.projetodashboard.api.endereco.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.devfireclub.projetodashboard.api.endereco.dtos.EnderecoRequest;
import br.com.devfireclub.projetodashboard.api.endereco.dtos.EnderecoResponse;
import br.com.devfireclub.projetodashboard.api.endereco.services.EnderecoService;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoController {
    
    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public List<EnderecoResponse> findAll(){
        return enderecoService.findAll();
    }

    @GetMapping("/{id}")
    public EnderecoResponse findById(@PathVariable Long id){
        return enderecoService.findById(id);
    }

    @GetMapping("/rua/{rua}")
    public EnderecoResponse findByRua(@PathVariable String rua){
        return enderecoService.findEnderecoByRua(rua);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public EnderecoResponse create(@RequestBody EnderecoRequest enderecoRequest){
        return enderecoService.create(enderecoRequest);
    }

    @PutMapping("/update/{id}")
     @ResponseStatus(code = HttpStatus.OK)
    public EnderecoResponse update(@PathVariable Long id, @RequestBody EnderecoResponse enderecoResponse){
        return enderecoService.update(id,enderecoResponse);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        enderecoService.delete(id);
    }

}
