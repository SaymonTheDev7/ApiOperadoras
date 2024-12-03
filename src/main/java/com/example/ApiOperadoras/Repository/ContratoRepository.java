package com.example.ApiOperadoras.Repository;

import com.example.ApiOperadoras.Model.Contrato;
import com.example.ApiOperadoras.Model.Plano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Integer> {
    @Query("SELECT p FROM Plano p WHERE p.id = :id")
    Plano findPlanoPorContrato(Integer id);
}
