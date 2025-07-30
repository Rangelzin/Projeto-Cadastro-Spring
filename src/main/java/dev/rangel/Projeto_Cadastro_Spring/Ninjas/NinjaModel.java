package dev.rangel.Projeto_Cadastro_Spring.Ninjas;

import dev.rangel.Projeto_Cadastro_Spring.Missoes.MissoesModel;
import jakarta.persistence.*;

// Entity transforma uma classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // @ManyToOne - Um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign Key
    private MissoesModel missoes;

    // Construtores
    public NinjaModel() {
    }
    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    // Getters
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public int getIdade() {
        return idade;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
