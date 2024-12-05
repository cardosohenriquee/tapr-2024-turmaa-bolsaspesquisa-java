package br.univille.microservicegestaobolsistapesquisa.gestaobolsa.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.model.StatusBolsa;
import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.repository.StatusBolsaRepository;
import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.service.StatusBolsaService;

@Service
public class StatusBolsaServiceImpl implements StatusBolsaService {

    @Autowired
    private StatusBolsaRepository repository;

    @Override
    public List<StatusBolsa> getAll() {
        var retorno = repository.findAll();
        List<StatusBolsa> listaStatus = new ArrayList<StatusBolsa>();
        retorno.forEach(listaStatus::add);
        return listaStatus;
    }

    @Override
    public StatusBolsa save(StatusBolsa statusBolsa) {
        return repository.save(statusBolsa);
    }

    @Override
    public Optional<StatusBolsa> find(String id) {
        return Optional.ofNullable(repository.findById(id)).orElseThrow();
        
    }

    @Override
    public void remover(String id) {
        repository.deleteById(id);
    }

    @Override
    public StatusBolsa update(String id, StatusBolsa statusBolsa) {
        var buscaStatusBolsa = find(id);
        if(buscaStatusBolsa.isPresent()){
            var statusBolsaAntigo = buscaStatusBolsa.get(); 
            statusBolsaAntigo.setStatus(statusBolsa.getStatus());
            save(statusBolsa);
            return statusBolsaAntigo;
        }
        return null;

    }
}