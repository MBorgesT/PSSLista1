package com.mycompany.exercicio1;

public class IBMCensurador extends AbstractCensurador {

    protected String censurar(String texto) {
        return texto.replaceAll("IBM", "***");
    }

}
