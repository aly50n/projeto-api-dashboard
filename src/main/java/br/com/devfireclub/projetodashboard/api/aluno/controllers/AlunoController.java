package br.com.devfireclub.projetodashboard.api.aluno.controllers;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.devfireclub.projetodashboard.api.aluno.dtos.AlunoRequest;
import br.com.devfireclub.projetodashboard.api.aluno.dtos.AlunoResponse;
import br.com.devfireclub.projetodashboard.api.aluno.services.AlunoService;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<AlunoResponse> findAll(){
        return alunoService.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public AlunoResponse create(@RequestBody AlunoRequest alunoRequest){
        return alunoService.create(alunoRequest);
    }

}
