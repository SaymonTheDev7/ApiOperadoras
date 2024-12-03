package com.example.ApiOperadoras.Service;

import com.example.ApiOperadoras.Model.Plano;
import com.example.ApiOperadoras.Repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanoService {

    @Autowired
    PlanoRepository planoRepository;

    public Plano salvarPlano (Plano plano) {
        return planoRepository.save(plano);
    }

    public Plano atualizarPlano (Plano plano) {
        return planoRepository.save(plano);
    }

    public void deletarPlano (Integer id) {
        planoRepository.findById(id);
        planoRepository.deleteById(id);
    }

    public Plano buscarPlano (Integer id) {
        if (planoRepository.findById(id).isPresent()) {
            return planoRepository.findById(id).get();
        }
        throw new RuntimeException("Plano não encontrado");
    }

    public List<Plano> buscarTodosPlanos () {
        return planoRepository.findAll();
    }
}
