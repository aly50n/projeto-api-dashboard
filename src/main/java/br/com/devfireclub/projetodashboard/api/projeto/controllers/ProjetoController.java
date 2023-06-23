package br.com.devfireclub.projetodashboard.api.projeto.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.devfireclub.projetodashboard.api.projeto.dtos.ProjetoRequest;
import br.com.devfireclub.projetodashboard.api.projeto.dtos.ProjetoResponse;
import br.com.devfireclub.projetodashboard.api.projeto.services.ProjetoService;

@RestController
@RequestMapping("/api/projeto")
public class ProjetoController {
    
    @Autowired
    private ProjetoService projetoService;

    @GetMapping
    public List<ProjetoResponse> findAll(){
        return projetoService.findAll();
    }

    @GetMapping("/{id}")
    public ProjetoResponse findById(@PathVariable Long id){
        return projetoService.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ProjetoResponse create(@RequestBody ProjetoRequest projetoRequest){
        return projetoService.create(projetoRequest);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public ProjetoResponse update(@PathVariable Long id, @RequestBody ProjetoResponse projetoResponse){
        return projetoService.update(id,projetoResponse);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        projetoService.delete(id);
    }



}
