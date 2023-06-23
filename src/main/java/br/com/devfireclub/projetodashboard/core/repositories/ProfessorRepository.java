package br.com.devfireclub.projetodashboard.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.devfireclub.projetodashboard.core.exceptions.ProfessorNotFoundException;
import br.com.devfireclub.projetodashboard.core.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    default Professor findByIdOrElseThrow(Long id){
        return findById(id)
                        .orElseThrow(ProfessorNotFoundException::new);
    }

    default Professor findByMatricula(String matricula){
        return findAll()
                        .stream()
                        .filter(professor -> professor.getMatricula().equals(matricula))
                        .findFirst()
                        .orElseThrow(ProfessorNotFoundException::new);
    };
}
