package br.univille.microservicegestaobolsistapesquisa.gestaobolsa.service;

import java.util.List;
import java.util.Optional;

import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.model.StatusBolsa;

public interface StatusBolsaService {
    List<StatusBolsa> getAll();
    StatusBolsa save(StatusBolsa statusBolsa);
    Optional<StatusBolsa> find(String id);
    StatusBolsa update(String id, StatusBolsa statusBolsa);
    void remover(String id);
}