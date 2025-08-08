package dev.rangel.Projeto_Cadastro_Spring.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.rangel.Projeto_Cadastro_Spring.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor // Construtores
@AllArgsConstructor // Construtores
@Data // Getters e Setters
@ToString
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_missao")
    private String nome_missao;

    @Column(name = "dificuldade_missao")
    private String dificuldade;

    // @OneToMany - uma missão pode ter vários Ninjas
    @OneToMany(mappedBy = "missoes")
    @JsonIgnore
    private List<NinjaModel> ninja;


}

