package com.example.ApiOperadoras.Controller;

import com.example.ApiOperadoras.Model.Plano;
import com.example.ApiOperadoras.Service.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("API/Plano")
public class PlanoController {

    @Autowired
    PlanoService planoService;

    @PostMapping("/Post")
    public ResponseEntity<Plano> salvarPlano(@RequestBody Plano plano) {
        return new ResponseEntity<>(planoService.salvarPlano(plano), HttpStatus.CREATED);
    }

    @PutMapping("/Put")
    public ResponseEntity<Plano> atualizarPlano(@RequestBody Plano plano) {
        return new ResponseEntity<>(planoService.atualizarPlano(plano), HttpStatus.OK);
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Plano> deletarPlano(@PathVariable Integer id) {
        try {
            planoService.deletarPlano(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/Get/{id}")
    public ResponseEntity<Plano> buscarPlano(@PathVariable Integer id) {
        return new ResponseEntity<>(planoService.buscarPlano(id), HttpStatus.OK);
    }

    @GetMapping("/GetAll")
    public ResponseEntity<List<Plano>> buscarTodosPlanos() {
        return new ResponseEntity<>(planoService.buscarTodosPlanos(), HttpStatus.OK);
    }
}
