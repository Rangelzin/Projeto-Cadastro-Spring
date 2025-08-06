package dev.rangel.Projeto_Cadastro_Spring.Ninjas;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository NinjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        NinjaRepository = ninjaRepository;
    }

    // Criar um novo Ninja
    public NinjaModel CriarNinja(NinjaModel ninja) {
        return NinjaRepository.save(ninja);
    }

    // Listar todos os Ninjas
    public List<NinjaModel> ListarNinjas() {
        return NinjaRepository.findAll();
    }

    // Listar Ninjas por ID
    public NinjaModel ListarNInjasPorId(Long id) {
        Optional<NinjaModel> ninja = NinjaRepository.findById(id);
        return ninja.orElse(null);
    }

    // Deletar um Ninja - tem que ser metodo void
    public void DeletarNinjaPorId(Long id) {
        NinjaRepository.deleteById(id);
    }

    // Atualizar um Ninja
    public NinjaModel atualizarNinja(Long id,NinjaModel ninjaAtualizado) {
        if (NinjaRepository.existsById(id)) {
            ninjaAtualizado.setId(id);
            return NinjaRepository.save(ninjaAtualizado);
        }
        return null;
    }
}
