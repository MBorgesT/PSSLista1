package com.mycompany.exercicio1;

public class AppleCensurador extends AbstractCensurador {

    protected String censurar(String texto) {
        return texto.replaceAll("Apple", "*****");
    }

}
