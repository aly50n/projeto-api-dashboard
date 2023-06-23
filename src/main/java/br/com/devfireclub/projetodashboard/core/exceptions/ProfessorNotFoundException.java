package br.com.devfireclub.projetodashboard.core.exceptions;

import jakarta.persistence.EntityNotFoundException;

public class ProfessorNotFoundException extends EntityNotFoundException {
    
    public ProfessorNotFoundException() {
        super("O professor não foi encontrado!");
    }
    
    public ProfessorNotFoundException(String message) {
        super(message);
    }

}
