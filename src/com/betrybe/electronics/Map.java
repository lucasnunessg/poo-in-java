package com.betrybe.electronics;

import java.util.HashMap;

public class Map {
    HashMap<String, String> estudantes = new HashMap<String, String>();

    public Map() {
        estudantes.put("x1234", "Lucas");
        estudantes.put("x5678", "Julia");
        estudantes.put("x9876", "Eloisa");
    }

    public String AddMap() {
        String valorAnterior = estudantes.put("x1234", "Lucass");
        return valorAnterior;
    }

    public String AddMapp() {
        String valorrAnterior = estudantes.put("x9876", "Cristian");
        return valorrAnterior;
    }

    public String addNewMap() {
        String vAnterior = estudantes.put("x9876", "Fulaninho");
        return vAnterior;
    }

    public static void main(String[] args) {
        Map map = new Map();
        String valorAnterior = map.AddMap();
        String valorrAnterior = map.AddMapp();
        String vAnterior = map.addNewMap();
        System.out.println("Não sei o que deve aparecer aqui " + vAnterior);
        System.out.println("Valor anterior: " + valorAnterior);
        System.out.println("Valor do map: " + map.estudantes);
        System.out.println("Aqui deve printar Eloisa: " + valorrAnterior);
        System.out.println("Aqui deve printar com Cristian: " + map.estudantes);
    }

}
