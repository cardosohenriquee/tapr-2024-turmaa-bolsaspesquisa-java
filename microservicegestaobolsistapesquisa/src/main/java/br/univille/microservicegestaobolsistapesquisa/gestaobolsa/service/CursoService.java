package br.univille.microservicegestaobolsistapesquisa.gestaobolsa.service;

import java.util.List;
import java.util.Optional;

import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.model.Curso;

public interface CursoService {

    List<Curso> getAll();
    Curso save(Curso curso);
    Optional<Curso> find(String id);
    Curso update(String id, Curso curso);
    void remover(String id);
}