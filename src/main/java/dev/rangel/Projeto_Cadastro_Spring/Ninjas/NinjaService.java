package dev.rangel.Projeto_Cadastro_Spring.Ninjas;

import org.springframework.stereotype.Service;
import java.util.List;

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
}
