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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.CriarNinja(ninja);
    }

    // Mostrar Ninja (Read)
    @GetMapping("/listar")
    public List<NinjaModel> MostrarNinja() {
        return ninjaService.ListarNinjas();
    }

    // Mostrar Ninja por ID (Read)
    @GetMapping("/listar/{ID}")
    public NinjaModel listarNinjaPorID(@PathVariable Long ID) {
        return ninjaService.ListarNInjasPorId(ID);
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
