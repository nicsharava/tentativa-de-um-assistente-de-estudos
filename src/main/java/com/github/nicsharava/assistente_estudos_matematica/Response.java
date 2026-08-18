package com.github.nicsharava.assistente_estudos_matematica;

import lombok.*;

@Data
public class Response {
    private int calculoFinal;
    private boolean estaCerto;

    public Response(int calculoFinal, boolean estaCerto) {
        this.calculoFinal = calculoFinal;
        this.estaCerto = estaCerto;
    }
}
