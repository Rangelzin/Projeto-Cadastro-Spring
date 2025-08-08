package dev.rangel.Projeto_Cadastro_Spring.Missoes;

import dev.rangel.Projeto_Cadastro_Spring.Ninjas.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesService missoesService;
    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota em missoes!";
    }

    // Adicionar Missoes (Create)
    @PostMapping("/adcionar")
    public MissoesDTO CriarMissao(@RequestBody MissoesDTO missao) {
        return missoesService.CriarMissao(missao);
    }

    // Mostrar Missoes (Read)
    @GetMapping("/todas")
    public List<MissoesDTO> MostrarMissao() {
        return missoesService.ListarMissoes();
    }

    // Mostrar Missoes por ID (Read)
    @GetMapping("/todas/{ID}")
    public MissoesDTO MostrarMissaoPorID(@PathVariable Long ID) {
        return missoesService.ListarMissoesPorId(ID);
    }

    // Alterar dados de Missoes (Uptade)
    @PutMapping("/alterar/{ID}")
    public MissoesDTO alterarMissaoPorID(@PathVariable Long ID,@RequestBody MissoesDTO missaoAtualizada) {
        return missoesService.AtualizarMissao(ID,missaoAtualizada);
    }

    // Deletar Missoes (Delete)
    @DeleteMapping("/deletar/{ID}")
    public void deletarMissaoPorID(@PathVariable Long ID) {
        missoesService.DeletarMissaoPorId(ID);
    }
}
