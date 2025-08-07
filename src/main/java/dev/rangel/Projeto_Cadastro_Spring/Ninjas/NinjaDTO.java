package dev.rangel.Projeto_Cadastro_Spring.Ninjas;

import dev.rangel.Projeto_Cadastro_Spring.Missoes.MissoesModel;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

    private Long id;
    private String nome;
    private String email;
    private int idade;
    private String imgUrl;
    private String rank;
    private MissoesModel missoes;
}
