package com.example.listapessoas;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private String nome;
    private String idade;
    boolean possuiPet;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public boolean isPossuiPet() {
        return possuiPet;
    }

    public void setPossuiPet(boolean possuiPet) {
        this.possuiPet = possuiPet;
    }

    public Pessoa(String nome, String idade, boolean possuiPet) {
        this.nome = nome;
        this.idade = idade;
        this.possuiPet = possuiPet;
    }
}
