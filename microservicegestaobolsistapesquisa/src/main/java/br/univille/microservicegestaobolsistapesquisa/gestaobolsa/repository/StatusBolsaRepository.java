package br.univille.microservicegestaobolsistapesquisa.gestaobolsa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.model.StatusBolsa;

@Repository
public interface StatusBolsaRepository extends CrudRepository<StatusBolsa, String> {
    
}
