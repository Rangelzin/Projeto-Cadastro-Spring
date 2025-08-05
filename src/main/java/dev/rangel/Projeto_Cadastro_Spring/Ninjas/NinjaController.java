package dev.rangel.Projeto_Cadastro_Spring.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

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
    @GetMapping("/todos")
    public String MostrarNinja() {
        return "Mostrar Todos os Ninjas ";
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
