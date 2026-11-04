package com.seduc2.escola.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String cadeira;
    private String mesas;
    private String alunos;

    public Sala(int id, String nome, String cadeira, String mesas, String alunos) {
        this.id = id;
        this.nome = nome;
        this.cadeira = cadeira;
        this.mesas = mesas;
        this.alunos = alunos;
    }

    public Sala() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }

    public String getMesas() {
        return mesas;
    }

    public void setMesas(String mesas) {
        this.mesas = mesas;
    }

    public String getAlunos() {
        return alunos;
    }

    public void setAlunos(String alunos) {
        this.alunos = alunos;
    }



    public Sala(String nome, String cadeira, String mesas, String alunos) {
        this.nome = nome;
        this.cadeira = cadeira;
        this.mesas = mesas;
        this.alunos = alunos;
    }


}
