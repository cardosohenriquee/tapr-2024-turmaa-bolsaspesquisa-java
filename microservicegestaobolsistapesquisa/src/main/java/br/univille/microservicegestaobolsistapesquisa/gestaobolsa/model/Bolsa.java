package br.univille.microservicegestaobolsistapesquisa.gestaobolsa.model;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "bolsa", autoCreateContainer = true)
public class Bolsa {
    @Id
    @PartitionKey
    @GeneratedValue
    private String id;
    private String idALuno;
    private String idProjeto;
    private String idCurso;
    private Integer duracao;
    private String descricao;
    private Boolean statusBolsa;

    public Bolsa() {}

    public Bolsa(String id, String idALuno, String idProjeto, String idCurso, Integer duracao, String descricao, Boolean statusBolsa) {
        this.id = id;
        this.idALuno = idALuno;
        this.idProjeto = idProjeto;
        this.idCurso = idCurso;
        this.duracao = duracao;
        this.descricao = descricao;
        this.statusBolsa = statusBolsa;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdAluno() {
        return idALuno;
    }

    public void setIdAluno(String idAluno) {
        this.idALuno = idAluno;
    }

    public String getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(String idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
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