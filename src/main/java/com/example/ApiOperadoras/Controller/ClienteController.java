package com.example.ApiOperadoras.Controller;

import com.example.ApiOperadoras.Model.Cliente;
import com.example.ApiOperadoras.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("API/Cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping("/Post")
    public ResponseEntity<Cliente> salvarCliente ( @RequestBody Cliente cliente) {
        return new ResponseEntity<>(clienteService.salvarCliente(cliente), HttpStatus.CREATED);
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Cliente> deletarCliente ( @PathVariable Integer id) {
        try {
            clienteService.deletarCliente(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping("/Put/{id}")
    public ResponseEntity<Cliente> atualizarCliente ( @PathVariable Integer id, @RequestBody Cliente cliente) {
        try {
            return new ResponseEntity<>(clienteService.atualizarCliente(cliente), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PatchMapping("/Patch/{id}")
    public ResponseEntity<Cliente> atualizarEmail ( @PathVariable Integer id, @RequestBody String email) {
        try {
            return new ResponseEntity<>(clienteService.atualizarEmail(id, email), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
