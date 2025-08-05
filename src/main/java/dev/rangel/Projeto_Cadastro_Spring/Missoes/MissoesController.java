package dev.rangel.Projeto_Cadastro_Spring.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota em missoes!";
    }

    // Adicionar Missoes (Create)
    @PostMapping("/adcionar")
    public String CriarMissao() {
        return "Missão Criada";
    }

    // Mostrar Missoes (Read)
    @GetMapping("/todos")
    public String MostrarMissao() {
        return "Mostrar Todos as Missões ";
    }

    // Mostrar Missoes por ID (Read)
    @GetMapping("/todosID")
    public String MostrarMissaoPorID() {
        return "Mostrar Missao Por ID";
    }

    // Alterar dados do Missoes (Uptade)
    @PutMapping("/alterar")
    public String alterarMissaoPorID() {
        return "Alterar Missao Por ID";
    }

    // Deletar Missoes (Delete)
    @DeleteMapping("/deletarID")
    public String deletarMissaoPorID() {
        return "Deletar Missao Por ID";
    }
}
