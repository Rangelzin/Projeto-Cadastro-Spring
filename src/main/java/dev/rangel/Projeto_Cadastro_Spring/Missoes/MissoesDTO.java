package dev.rangel.Projeto_Cadastro_Spring.Missoes;

import dev.rangel.Projeto_Cadastro_Spring.Ninjas.NinjaModel;
import java.util.List;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MissoesDTO {

    private Long id;
    private String nome_missao;
    private String dificuldade;
    private List<NinjaModel> ninja;

}
