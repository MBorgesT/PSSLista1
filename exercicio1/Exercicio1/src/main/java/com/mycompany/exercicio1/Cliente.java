package com.mycompany.exercicio1;

import java.util.Objects;

public class Cliente {

    private ICensurador primeiroCensurador;
    
    public void setPrimeiroCensurador(ICensurador censurador) {
        this.primeiroCensurador = censurador;
    }

    public String censurar(String texto) {
        if (Objects.isNull(primeiroCensurador)) {
            return texto;
        }
        return primeiroCensurador.processar(texto);
    }

}
