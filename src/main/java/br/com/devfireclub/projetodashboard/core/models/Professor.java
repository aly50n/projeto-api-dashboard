package br.com.devfireclub.projetodashboard.core.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "gerenciamento_de_professores")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Professor implements Serializable{

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nome")
    private String nome;

    @EqualsAndHashCode.Include
    @Column(name = "matricula")
    private String matricula;
    
    @Column(name = "curso")
    private String curso;

    @Column(name = "id_endereco")
    private Long idEndereco;
    
    @PrePersist
    private void generateMatricula() {
        this.matricula = UUID.randomUUID().toString();
    }
    

}
