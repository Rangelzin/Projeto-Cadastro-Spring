package dev.rangel.Projeto_Cadastro_Spring.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota!";
    }

    // Adicionar Ninjas (Create)
    @PostMapping("/criar")
    public String CriarNinja() {
        return "Ninja Criado";
    }

    // Mostrar Ninja (Read)
    @GetMapping("/listar")
    public List<NinjaModel> MostrarNinja() {
        return ninjaService.ListarNinjas();
    }

    // Mostrar Ninja por ID (Read)
    @GetMapping("/todosID")
    public String MostrarNinjaPorID() {
        return "Mostrar Ninja Por ID";
    }

    // Alterar dados do Ninja (Uptade)
    @PutMapping("/alterar")
    public String alterarNinjaPorID() {
        return "Alterar Ninja Por ID";
    }

    // Deletar Ninja (Delete)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID() {
        return "Deletar Ninja Por ID";
    }
}
