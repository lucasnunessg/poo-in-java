package com.betrybe.electronics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(7);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println(numeros); //ordenada por inserção
        Collections.sort(numeros); //colocando em ordem numerica
        System.out.println(numeros);

    }


}
