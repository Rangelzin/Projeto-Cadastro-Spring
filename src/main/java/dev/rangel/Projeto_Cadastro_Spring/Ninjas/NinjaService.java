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

    // Listar todos os Ninjas
    public List<NinjaModel> ListarNinjas() {
        return NinjaRepository.findAll();
    }

    // Listar Ninjas por ID
    public NinjaModel ListarNInjasPorId(Long id) {
        Optional<NinjaModel> ninja = NinjaRepository.findById(id);
        return ninja.orElse(null);
    }

}
