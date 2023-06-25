package br.com.devfireclub.projetodashboard.core.exceptions;

import jakarta.persistence.EntityNotFoundException;

public class EnderecoNotFoundException extends EntityNotFoundException{
    public EnderecoNotFoundException() {
        super("O endereco não foi encontrado!");
    }
    
    public EnderecoNotFoundException(String message) {
        super(message);
    }
}
