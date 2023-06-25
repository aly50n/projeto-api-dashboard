package br.com.devfireclub.projetodashboard.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.devfireclub.projetodashboard.core.exceptions.EnderecoNotFoundException;
import br.com.devfireclub.projetodashboard.core.models.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
    
    default Endereco findByIdOrElseThrow(Long id){
        return findById(id)
                        .orElseThrow(EnderecoNotFoundException::new);
    }

    default Endereco findByRua(String rua){
        return findAll()
                        .stream()
                        .filter(endereco -> endereco.getRua().equals(rua))
                        .findFirst()
                        .orElseThrow(EnderecoNotFoundException::new);
    };
}
