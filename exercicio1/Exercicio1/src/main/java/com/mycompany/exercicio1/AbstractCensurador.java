package com.mycompany.exercicio1;

import java.util.Objects;

public abstract class AbstractCensurador implements ICensurador {

    protected ICensurador proximo;

    public void setProximo(ICensurador proximo) {
        this.proximo = proximo;
    }
    
    public String processar(String texto) {
        texto = censurar(texto);
        if (!Objects.isNull(proximo)) {
            texto = proximo.processar(texto);
        }
        return texto;
    }

    protected abstract String censurar(String texto);

}
