package br.com.devfireclub.projetodashboard.core.exceptions;

import jakarta.persistence.EntityNotFoundException;

public class ProjetoNotFoundException extends EntityNotFoundException {
    
    public ProjetoNotFoundException() {
        super("O projeto não foi encontrado!");
    }
    
    public ProjetoNotFoundException(String message) {
        super(message);
    }
    
}
