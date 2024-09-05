package com.betrybe.electronics;

import java.util.*;
import java.util.List;
import java.util.Collection;

public class Estudante {

    private String matricula;
    private String nome;
    private String curso;

    // Construtor vazio
    public Estudante(String matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }
    public Estudante(){}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}

public class CodeExample {
    public static Collection<Estudante> obterEntrada() {
        return Set.of(
                new Estudante("2001", "Lucas", "Computação"),
                new Estudante("2002", "Julia", "Direito"),
                new Estudante("2003", "Cristian", "Computação"),
                new Estudante("2004", "Fulana", "Pedagogia"));
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
