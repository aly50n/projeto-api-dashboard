package br.com.devfireclub.projetodashboard.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.devfireclub.projetodashboard.core.exceptions.ProjetoNotFoundException;
import br.com.devfireclub.projetodashboard.core.models.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
    default Projeto findByIdOrElseThrow(Long id){
        return findById(id)
                        .orElseThrow(ProjetoNotFoundException::new);
    }
}
