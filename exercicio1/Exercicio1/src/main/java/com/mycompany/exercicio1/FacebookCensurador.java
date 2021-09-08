package com.mycompany.exercicio1;

public class FacebookCensurador extends AbstractCensurador {

    protected String censurar(String texto) {
        return texto.replaceAll("Facebook", "********");
    }

}
