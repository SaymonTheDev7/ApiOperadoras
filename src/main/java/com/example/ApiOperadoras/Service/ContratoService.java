package com.example.ApiOperadoras.Service;

import com.example.ApiOperadoras.Model.Contrato;
import com.example.ApiOperadoras.Repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratoService {

    @Autowired
    ContratoRepository contratoRepository;

    public Contrato salvarContrato (Contrato contrato) {
        return contratoRepository.save(contrato);
    }

    public Contrato atualizarContrato (Contrato contrato) {
        return contratoRepository.save(contrato);
    }

    public void deletarContrato (Integer id) {
        contratoRepository.findById(id);
        contratoRepository.deleteById(id);
    }

    public Contrato buscarContrato (Integer id) {
        if (contratoRepository.findById(id).isPresent()) {
            return contratoRepository.findById(id).get();
        }
        throw new RuntimeException("Contrato não encontrado");
    }

    public List<Contrato> buscarTodosContratos () {
        return contratoRepository.findAll();
    }
}
