package com.example.ApiOperadoras.Controller;

import com.example.ApiOperadoras.Model.Cliente;
import com.example.ApiOperadoras.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("API/Cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping("/Post")
    public ResponseEntity<Cliente> salvarCliente ( @RequestBody Cliente cliente) {
        return new ResponseEntity<>(clienteService.salvarCliente(cliente), HttpStatus.CREATED);
    }

    
}
