package br.com.devfireclub.projetodashboard.api.professor.controllers;

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

import br.com.devfireclub.projetodashboard.api.professor.dtos.ProfessorRequest;
import br.com.devfireclub.projetodashboard.api.professor.dtos.ProfessorResponse;
import br.com.devfireclub.projetodashboard.api.professor.services.ProfessorService;

@RestController
@RequestMapping("/api/professor")
public class ProfessorController {
    
    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public List<ProfessorResponse> findAll(){
        return professorService.findAll();
    }
    
    @GetMapping("/{id}")
    public ProfessorResponse findById(@PathVariable Long id){
        return professorService.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ProfessorResponse create(@RequestBody ProfessorRequest professorRequest){
        return professorService.create(professorRequest);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public ProfessorResponse update(@PathVariable Long id, @RequestBody ProfessorResponse professorResponse){
        return professorService.update(id,professorResponse);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        professorService.delete(id);
    }

}
