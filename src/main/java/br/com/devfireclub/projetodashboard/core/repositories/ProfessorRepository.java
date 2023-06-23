package br.com.devfireclub.projetodashboard.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.devfireclub.projetodashboard.core.exceptions.ProfessorNotFoundException;
import br.com.devfireclub.projetodashboard.core.models.Aluno;

public interface ProfessorRepository extends JpaRepository<Aluno, Long> {
    default Aluno findByIdOrElseThrow(Long id){
        return findById(id)
                        .orElseThrow(ProfessorNotFoundException::new);
    }
}
