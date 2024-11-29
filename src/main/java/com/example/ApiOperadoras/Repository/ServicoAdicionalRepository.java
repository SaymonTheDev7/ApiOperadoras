package com.example.ApiOperadoras.Repository;

import com.example.ApiOperadoras.Model.ServicoAdicional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoAdicionalRepository extends JpaRepository<ServicoAdicional, Integer> {
}
