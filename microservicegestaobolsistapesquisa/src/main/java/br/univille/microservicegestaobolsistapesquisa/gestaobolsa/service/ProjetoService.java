package br.univille.microservicegestaobolsistapesquisa.gestaobolsa.service;

import java.util.List;
import java.util.Optional;

import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.model.Projeto;

public interface ProjetoService {
    List<Projeto> getAll();
    Projeto save(Projeto projeto);
    Optional<Projeto> find(String id);
    Projeto update(String id, Projeto projeto);
    void remover(String id);
}
