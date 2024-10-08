package br.univille.microservicegestaobolsistapesquisa.criacaodebolsas.entity;

import java.util.UUID;

public class Bolsa {
    private UUID id;
    private UUID idALuno;
    private UUID idProjeto;
    private UUID idCurso;
    private Int duracao;
    private String descricao;
    private Boolean statusBolsa;

    public Bolsa() {}

    public Bolsa(UUID id, UUID idALuno, UUID idProjeto, UUID idCurso, Int duracao, String descricao, Boolean statusBolsa) {
        this.id = id;
        this.idALuno = idALuno;
        this.idProjeto = idProjeto;
        this.idCurso = idCurso;
        this.duracao = duracao;
        this.descricao = descricao;
        this.statusBolsa = statusBolsa;
        
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(UUID idAluno) {
        this.idAluno = idAluno;
    }

    public UUID getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(UUID idProjeto) {
        this.idProjeto = idProjeto;
    }

    public UUID getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(UUID idCurso) {
        this.idCurso = idCurso;
    }

    public Int getDuracao() {
        return duracao;
    }

    public void setDuracao(Int duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getStatusBolsa() {
        return statusBolsa;
    }

    public void setStatusBolsa(Boolean statusBolsa) {
        this.statusBolsa = statusBolsa;
    }
}

