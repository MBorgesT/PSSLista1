package com.mycompany.exercicio1;

public class MicrosoftCensurador extends AbstractCensurador {

    protected String censurar(String texto) {
        return texto.replaceAll("Microsoft", "*********");
    }

}
