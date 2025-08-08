package dev.rangel.Projeto_Cadastro_Spring.Missoes;

import dev.rangel.Projeto_Cadastro_Spring.Ninjas.NinjaMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MissoesService {
    private MissoesRepository MissoesRepository;
    private MissoesMapper MissoesMapper;

    public MissoesService(MissoesRepository missoesRepository, MissoesMapper missoesMapper) {
        this.MissoesRepository = missoesRepository;
        this.MissoesMapper = missoesMapper;
    }

    // Rotas - Endpoints

    public MissoesDTO CriarMissao(MissoesDTO MissoesDTO) {
        MissoesModel missao = MissoesMapper.map(MissoesDTO);
        missao = MissoesRepository.save(missao);
        return MissoesMapper.map(missao);
    }

    public List<MissoesDTO> ListarMissoes() {
        List<MissoesModel> missoes = MissoesRepository.findAll();
        return missoes.stream()
                .map(MissoesMapper::map)
                .collect(Collectors.toList());
    }

    public MissoesDTO ListarMissoesPorId(Long id) {
        Optional<MissoesModel> missoes = MissoesRepository.findById(id);
        return missoes.map(MissoesMapper::map).orElse(null);
    }

    public void DeletarMissaoPorId(Long id){
        MissoesRepository.deleteById(id);
    }

    public MissoesDTO AtualizarMissao(Long id,MissoesDTO MissoesAtualizada ) {
        Optional<MissoesModel> missaoExistente = MissoesRepository.findById(id);
        if (missaoExistente.isPresent()) {
            MissoesModel missaoAtua2 = MissoesMapper.map(MissoesAtualizada);
            missaoAtua2.setId(id);
            MissoesModel missaoSalva = MissoesRepository.save(missaoAtua2);
            return MissoesMapper.map(missaoSalva);
        }

        return null;
    }
}
