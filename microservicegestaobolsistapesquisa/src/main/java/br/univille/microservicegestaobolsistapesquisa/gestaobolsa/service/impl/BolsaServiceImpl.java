package br.univille.microservicegestaobolsistapesquisa.gestaobolsa.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.model.Bolsa;
import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.repository.BolsaRepository;
import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.service.BolsaService;

@Service
public class BolsaServiceImpl implements BolsaService{

    @Autowired
    private BolsaRepository repository;

    @Override
    public List<Bolsa> getAll() {
        var retorno = repository.findAll();
        List<Bolsa> listaBolsas = new ArrayList<Bolsa>();
        retorno.forEach(listaBolsas::add);
        return listaBolsas;
    }

    @Override
    public Bolsa save(Bolsa bolsa) {
        return repository.save(bolsa);
    }

    @Override
    public Optional<Bolsa> find(String id) {
        return Optional.ofNullable(repository.findById(id)).orElseThrow();
    }

    @Override
    public Bolsa update(String id, Bolsa bolsa) {
        Optional<Bolsa> existingBolsa = repository.findById(id);
        if (existingBolsa.isPresent()) {

            Bolsa updatedBolsa = existingBolsa.get();
            updatedBolsa.setIdAluno(bolsa.getIdAluno());
            updatedBolsa.setIdProjeto(bolsa.getIdProjeto());
            updatedBolsa.setIdCurso(bolsa.getIdCurso());
            updatedBolsa.setDuracao(bolsa.getDuracao());
            updatedBolsa.setDescricao(bolsa.getDescricao());
            updatedBolsa.setStatusBolsa(bolsa.getStatusBolsa());

            return repository.save(updatedBolsa);
        } else {
            throw new RuntimeException("Bolsa com ID " + id + " não encontrada.");
        }
    }

    @Override
    public void remover(String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Bolsa com ID " + id + " não encontrada.");
        }
    }
    
}
