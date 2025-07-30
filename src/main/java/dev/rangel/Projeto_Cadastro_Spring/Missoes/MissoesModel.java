package dev.rangel.Projeto_Cadastro_Spring.Missoes;

import dev.rangel.Projeto_Cadastro_Spring.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor // Construtores
@AllArgsConstructor // Construtores
@Data // Getters e Setters
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_missao;
    private String dificuldade;

    // @OneToMany - uma missão pode ter vários Ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;


}

