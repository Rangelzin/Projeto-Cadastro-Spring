package dev.rangel.Projeto_Cadastro_Spring.Missoes;

import dev.rangel.Projeto_Cadastro_Spring.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_missao;
    private String dificuldade;

    // @OneToMany - uma missão pode ter vários Ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;

    // Construtores
    public MissoesModel() {
    }
    public MissoesModel(Long id, String nome_missao, String dificuldade) {
        this.id = id;
        this.nome_missao = nome_missao;
        this.dificuldade = dificuldade;
    }

    // Getters
    public Long getId() {
        return id;
    }
    public String getNome_missao() {
        return nome_missao;
    }
    public String getDificuldade() {
        return dificuldade;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setNome_missao(String nome_missao) {
        this.nome_missao = nome_missao;
    }
    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}

