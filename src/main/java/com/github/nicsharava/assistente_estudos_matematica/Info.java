package com.github.nicsharava.assistente_estudos_matematica;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    private int n;
    private int p;
    private String Tipo;
    private int resposta;
}
