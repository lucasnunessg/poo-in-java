package com.betrybe.electronics;

import java.util.Arrays;
import java.util.List;

public class ListArray {
    public static void main(String[] args) {
        List<String> estudantes = Arrays.asList("João", "Lucas", "Juão");
        System.out.println(estudantes.contains("Lucas"));
    }
}
