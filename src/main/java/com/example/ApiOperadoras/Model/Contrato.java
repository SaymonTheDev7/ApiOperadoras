package com.example.ApiOperadoras.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String termo;
    private String dataInicio;
    private String dataFim;

    @OneToOne
    private Plano idPlano;

}
