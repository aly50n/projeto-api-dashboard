package br.com.devfireclub.projetodashboard.core.exceptions;

import jakarta.persistence.EntityNotFoundException;

public class AlunoNotFoundException extends EntityNotFoundException {
    
    public AlunoNotFoundException() {
        super("O aluno não foi encontrado!");
    }
    
    public AlunoNotFoundException(String message) {
        super(message);
    }

}
