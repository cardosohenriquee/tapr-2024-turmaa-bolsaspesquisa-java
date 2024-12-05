package br.univille.microservicegestaobolsistapesquisa.gestaobolsa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.model.Projeto;

@Repository
public interface ProjetoRepository extends CrudRepository<Projeto, String> {
    
}
