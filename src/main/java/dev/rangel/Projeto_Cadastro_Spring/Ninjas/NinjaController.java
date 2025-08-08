package dev.rangel.Projeto_Cadastro_Spring.Ninjas;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Adicionar Ninjas (Create)
    @PostMapping("/criar")
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja) {
        NinjaDTO novoNinja = ninjaService.CriarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja: " + novoNinja.getNome() + ",   criado com sucesso!");
    }

    // Mostrar Ninja (Read)
    @GetMapping("/listar")
    public ResponseEntity<List<NinjaDTO>> MostrarNinja() {
        List<NinjaDTO> ninjas = ninjaService.ListarNinjas();
        return ResponseEntity.ok(ninjas);
    }

    // Mostrar Ninja por ID (Read)
    @GetMapping("/listar/{ID}")
    public ResponseEntity<?> listarNinjaPorID(@PathVariable Long ID) {
        NinjaDTO ninjaId = ninjaService.ListarNInjasPorId(ID);
        if ( ninjaId != null ) {
            return ResponseEntity.ok(ninjaId);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O ninja com ID: " + ID + " não existe!");
        }
    }

    // Alterar dados do Ninja (Uptade)
    @PutMapping("/alterar/{ID}")
    public ResponseEntity<?> alterarNinjaPorID(@PathVariable Long ID,@RequestBody NinjaDTO ninjaAtualizar) {
        NinjaDTO ninjaId = ninjaService.ListarNInjasPorId(ID);

        if (ninjaId != null) {
            ninjaService.atualizarNinja(ID,ninjaAtualizar);
            return ResponseEntity.ok(ninjaId);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O ninja com ID: " + ID + " não existe!");
        }

    }

    // Deletar Ninja (Delete)
    @DeleteMapping("/deletar/{ID}")
    public ResponseEntity<String> deletarNinjaPorID(@PathVariable Long ID) {
       if ( ninjaService.ListarNInjasPorId(ID) != null ) {
           ninjaService.DeletarNinjaPorId(ID);
           return ResponseEntity.ok("Ninja do ID: " + ID + ", deletado com sucesso!");
       } else {
           return ResponseEntity.status(HttpStatus.NOT_FOUND)
                   .body("O ninja com ID: " + ID + " não existe!");
       }
    }
}
