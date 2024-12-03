package com.example.ApiOperadoras.Service;

import com.example.ApiOperadoras.Model.ServicoAdicional;
import com.example.ApiOperadoras.Repository.ServicoAdicionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoAdicionalService {

    @Autowired
    ServicoAdicionalRepository servicoAdicionalRepository;

    public ServicoAdicional salvarServicoAdicional (ServicoAdicional servicoAdicional) {
        return servicoAdicionalRepository.save(servicoAdicional);
    }

    public ServicoAdicional atualizarServicoAdicional (ServicoAdicional servicoAdicional) {
        return servicoAdicionalRepository.save(servicoAdicional);
    }

    public void deletarServicoAdicional (Integer id) {
        servicoAdicionalRepository.findById(id);
        servicoAdicionalRepository.deleteById(id);
    }

    public ServicoAdicional buscarServicoAdicional (Integer id) {
        if (servicoAdicionalRepository.findById(id).isPresent()) {
            return servicoAdicionalRepository.findById(id).get();
        }
        throw new RuntimeException("Serviço Adicional não encontrado");
    }

    public List<ServicoAdicional> buscarTodosServicosAdicionais () {
        return servicoAdicionalRepository.findAll();
    }
}
