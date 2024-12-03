package com.example.ApiOperadoras.Controller;

import com.example.ApiOperadoras.Model.ServicoAdicional;
import com.example.ApiOperadoras.Service.ServicoAdicionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("API/ServicoAdicional")
public class ServicoAdicionalController {

    @Autowired
    ServicoAdicionalService servicoAdicionalService;

    @PostMapping("/Post")
    public ResponseEntity<ServicoAdicional> salvarServicoAdicional(@RequestBody ServicoAdicional servicoAdicional) {
        return new ResponseEntity<>(servicoAdicionalService.salvarServicoAdicional(servicoAdicional), HttpStatus.CREATED);
    }

    @PutMapping("/Put")
    public ResponseEntity<ServicoAdicional> atualizarServicoAdicional(@RequestBody ServicoAdicional servicoAdicional) {
        return new ResponseEntity<>(servicoAdicionalService.atualizarServicoAdicional(servicoAdicional), HttpStatus.OK);
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<ServicoAdicional> deletarServicoAdicional(@PathVariable Integer id) {
        try {
            servicoAdicionalService.deletarServicoAdicional(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/Get/{id}")
    public ResponseEntity<ServicoAdicional> buscarServicoAdicional(@PathVariable Integer id) {
        return new ResponseEntity<>(servicoAdicionalService.buscarServicoAdicional(id), HttpStatus.OK);
    }

    @GetMapping("/GetAll")
    public ResponseEntity<List<ServicoAdicional>> buscarTodosServicosAdicionais() {
        return new ResponseEntity<>(servicoAdicionalService.buscarTodosServicosAdicionais(), HttpStatus.OK);
    }
}
