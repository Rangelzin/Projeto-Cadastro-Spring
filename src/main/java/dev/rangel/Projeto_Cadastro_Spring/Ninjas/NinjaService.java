package dev.rangel.Projeto_Cadastro_Spring.Ninjas;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private NinjaRepository NinjaRepository;
    private NinjaMapper NinjaMapper;

    public NinjaService(NinjaMapper ninjaMapper, NinjaRepository ninjaRepository) {
        this.NinjaMapper = ninjaMapper;
        this.NinjaRepository = ninjaRepository;
    }

    // Rotas - Endpoints

    public NinjaDTO CriarNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninja = NinjaMapper.map(ninjaDTO);
        ninja = NinjaRepository.save(ninja);
        return NinjaMapper.map(ninja);
    }

    public List<NinjaDTO> ListarNinjas() {
       List<NinjaModel> ninjas = NinjaRepository.findAll();
       return ninjas.stream()
               .map(NinjaMapper::map)
               .collect(Collectors.toList());
    }

    public NinjaDTO ListarNInjasPorId(Long id) {
        Optional<NinjaModel> ninja = NinjaRepository.findById(id);
        return ninja.map(NinjaMapper::map).orElse(null);
    }

    public void DeletarNinjaPorId(Long id) {
        NinjaRepository.deleteById(id);
    }

    public NinjaDTO atualizarNinja(Long id,NinjaDTO ninjaAtualizado) {
        Optional<NinjaModel> ninjaExistente = NinjaRepository.findById(id);
        if (ninjaExistente.isPresent()) {
            NinjaModel ninjaAtua2 = NinjaMapper.map(ninjaAtualizado);
            ninjaAtua2.setId(id);
            NinjaModel ninjaSalvo = NinjaRepository.save(ninjaAtua2);
            return NinjaMapper.map(ninjaSalvo);
        }
        return null;
    }
}
