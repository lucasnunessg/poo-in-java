package com.betrybe.electronics;

import java.util.*;
import java.util.List;

public class Estudante {

    private String matricula;
    private String nome;
    private String curso;

    // Construtor vazio
    public Estudante() {
    }

    // Construtor completo
    public Estudante(String matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

// Classe CodeExamples movida para fora da classe Estudante
class CodeExamples {
    public static Collection<Estudante> obterEntrada() {
        return Set.of(
                new Estudante("2001", "Maria", "Computação"),
                new Estudante("2002", "Joao", "Computação"),
                new Estudante("2003", "José", "Pedagogia"),
                new Estudante("2004", "Lucas", "Computação"),
                new Estudante("2005", "Julia", "Engenharia"),
                new Estudante("2006", "Fulano", "Computação"));
    }

    public static void main(String[] args) {
        Collection<Estudante> entrada = obterEntrada();
        List<String> matriculas = entrada.stream()
                .filter(e -> "Computação".equals(e.getCurso()))
                .sorted(Comparator.comparing(Estudante::getNome))
                .map(Estudante::getMatricula)
                .toList();
        System.out.println(matriculas);
    }
}
