package br.univille.microservicegestaobolsistapesquisa.criacaodebolsas.entity;

import java.util.UUID;

public class Curso {
    private UUID id;
    private String nome;

}

public Curso() {}

public Curso (UUID id, String nome) {
    this.id = id;
    this.nome = nome;

}

public UUID getId() {
    return id;
}

public void setId(UUID id) {
    this.id = id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}