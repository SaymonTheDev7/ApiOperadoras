package com.example.ApiOperadoras.Controller;
import com.example.ApiOperadoras.Model.Contrato;
import com.example.ApiOperadoras.Service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("API/Contrato")
public class ContratoController {

    @Autowired
    ContratoService contratoService;

    @PostMapping("/Post")
    public ResponseEntity<Contrato> salvarContrato(@RequestBody Contrato contrato) {
        return new ResponseEntity<>(contratoService.salvarContrato(contrato), HttpStatus.CREATED);
    }

    @PostMapping("/Put")
    public ResponseEntity<Contrato> atualizarContrato(@RequestBody Contrato contrato) {
        return new ResponseEntity<>(contratoService.atualizarContrato(contrato), HttpStatus.OK);
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Contrato> deletarContrato(@PathVariable Integer id) {
        try {
            contratoService.deletarContrato(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/Get/{id}")
    public ResponseEntity<Contrato> buscarContrato(@PathVariable Integer id) {
        return new ResponseEntity<>(contratoService.buscarContrato(id), HttpStatus.OK);
    }

    @GetMapping("/GetAll")
    public ResponseEntity<List<Contrato>> buscarTodosContratos() {
        return new ResponseEntity<>(contratoService.buscarTodosContratos(), HttpStatus.OK);
    }
}
