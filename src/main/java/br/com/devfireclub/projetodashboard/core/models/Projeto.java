package br.com.devfireclub.projetodashboard.core.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "gerenciamento_de_projetos")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Projeto {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="titulo_projeto", nullable = false)
    private String tituloProjeto;

    @Column(name="area_projeto", nullable = false)
    private String areaProjeto;

    @Column(name="palavraChave1")
    private String palavraChave1;

    @Column(name="palavraChave2")
    private String palavraChave2;

    @Column(name="palavraChave3")
    private String palavraChave3;

    @Column(name="resumo")
    private String resumo;

    @Column(name="url")
    private String url;

    @Column(name="id_professor_responsavel", nullable = false)
    private Long idProfessorResponsavel;

    @Column(name="id_aluno_participante", nullable = false)
    private Long idAlunoParticipante;

}
