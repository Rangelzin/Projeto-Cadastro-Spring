package dev.rangel.Projeto_Cadastro_Spring.Missoes;

import org.springframework.stereotype.Component;

@Component
public class MissoesMapper {
    public MissoesModel map(MissoesDTO missoesDTO) {
        MissoesModel missoesModel = new MissoesModel();
        missoesModel.setId(missoesDTO.getId());
        missoesModel.setNome_missao(missoesDTO.getNome_missao());
        missoesModel.setDificuldade(missoesDTO.getDificuldade());
        missoesModel.setNinja(missoesDTO.getNinja());

        return missoesModel;
    }

    public MissoesDTO map(MissoesModel missoesModel) {
        MissoesDTO missoesDTO = new MissoesDTO();
        missoesDTO.setId(missoesModel.getId());
        missoesDTO.setNome_missao(missoesModel.getNome_missao());
        missoesDTO.setDificuldade(missoesModel.getDificuldade());
        missoesDTO.setNinja(missoesModel.getNinja());

        return missoesDTO;
    }

}
