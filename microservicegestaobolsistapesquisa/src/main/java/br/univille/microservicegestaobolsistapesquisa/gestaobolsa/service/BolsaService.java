package br.univille.microservicegestaobolsistapesquisa.gestaobolsa.service;

import java.util.List;
import java.util.Optional;

import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.model.Bolsa;

public interface BolsaService {

    List<Bolsa> getAll();
    Bolsa save(Bolsa bolsa);
    Optional<Bolsa> find(String id);
    Bolsa update(String id, Bolsa bolsa);
    void remover(String id);
    
}