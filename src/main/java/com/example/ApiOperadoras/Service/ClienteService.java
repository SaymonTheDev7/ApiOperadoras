package com.example.ApiOperadoras.Service;

import com.example.ApiOperadoras.Model.Cliente;
import com.example.ApiOperadoras.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente salvarCliente (Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente atualizarCliente (Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente atualizarEmail (Integer id, String email) {
        clienteRepository.findById(id);
        return clienteRepository.atualizarEmail(id, email);
    }

    public void deletarCliente (Integer id) {
        clienteRepository.findById(id);
        clienteRepository.deleteById(id);
    }

    public Optional<Cliente> buscarCliente (Integer id) {
        if (clienteRepository.findById(id).isPresent()) {
            return clienteRepository.findById(id);
        }
        throw new RuntimeException("Cliente não encontrado");
    }

    public List<Cliente> buscarTodosClientes () {
        return clienteRepository.findAll();
    }
}
