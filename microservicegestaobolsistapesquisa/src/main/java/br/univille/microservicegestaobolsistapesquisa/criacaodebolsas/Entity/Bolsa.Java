package br.univille;

public class Bolsa {
    private UUID id;
    private UUID idALuno;
    private UUID idProjeto;
    private UUID idCurso;
    private Int duracao;
    private String descricao;
    private Boolean statusBolsa;

    public Bolsa() {}

    public Bolsa(Long id, Long idALuno, Long idProjeto, Long idCurso, Int duracao, String descricao, Boolean statusBolsa) {
        this.id = id;
        this.idALuno = idALuno;
        this.idProjeto = idProjeto;
        this.idCurso = idCurso;
        this.duracao = duracao;
        this.descricao = descricao;
        this.statusBolsa = statusBolsa;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Long idAluno) {
        this.idAluno = idAluno;
    }

    public Long getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(Long idProjeto) {
        this.idProjeto = idProjeto;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
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

