package br.com.devfireclub.projetodashboard.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.devfireclub.projetodashboard.core.models.Aluno;
import br.com.devfireclub.projetodashboard.core.exceptions.AlunoNotFoundException;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    default Aluno findByIdOrElseThrow(Long id){
        return findById(id)
                        .orElseThrow(AlunoNotFoundException::new);
    }

    default Aluno findByMatricula(String matricula){
        return findAll()
                        .stream()
                        .filter(aluno -> aluno.getMatricula().equals(matricula))
                        .findFirst()
                        .orElseThrow(AlunoNotFoundException::new);
    };
}
