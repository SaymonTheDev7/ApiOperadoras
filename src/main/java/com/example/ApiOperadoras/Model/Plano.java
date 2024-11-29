package com.example.ApiOperadoras.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Plano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String operadora;
    private String nome;
    private String beneficios;
    private Double quantidadeDados;
    private Double quantidadeDadosBonus;
    private Double valor;

}
