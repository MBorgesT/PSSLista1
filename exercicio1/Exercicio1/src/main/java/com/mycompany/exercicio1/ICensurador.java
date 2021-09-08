package com.mycompany.exercicio1;

public interface ICensurador {

    public void setProximo(ICensurador proximo);
    
    public String processar(String texto);

}
