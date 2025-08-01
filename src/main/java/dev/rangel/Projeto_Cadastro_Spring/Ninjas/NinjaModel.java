package dev.rangel.Projeto_Cadastro_Spring.Ninjas;

import dev.rangel.Projeto_Cadastro_Spring.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity transforma uma classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor // Construtores
@AllArgsConstructor // Construtores
@Data // Getters e Setters
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true,name = "email")
    private String email;

    @Column(name = "idade")
    private int idade;

    @Column(name = "img_url")
    private String imgUrl;

    // @ManyToOne - Um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign Key
    private MissoesModel missoes;

}
