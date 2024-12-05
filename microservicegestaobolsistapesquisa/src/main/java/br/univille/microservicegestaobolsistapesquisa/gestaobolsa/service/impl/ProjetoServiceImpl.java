package br.univille.microservicegestaobolsistapesquisa.gestaobolsa.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.model.Projeto;
import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.repository.ProjetoRepository;
import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.service.ProjetoService;

@Service
public class ProjetoServiceImpl implements ProjetoService{

    @Autowired
    private ProjetoRepository repository;

    @Override
    public List<Projeto> getAll() {
         var retorno = repository.findAll();
        List<Projeto> listaProjeto = new ArrayList<Projeto>();
        retorno.forEach(listaProjeto::add);
        return listaProjeto;
    }

    @Override
    public Projeto save(Projeto projeto) {
        return repository.save(projeto);
    }

    @Override
    public Optional<Projeto> find(String id) {
        return Optional.ofNullable(repository.findById(id).orElseThrow());
    }

    @Override
    public Projeto update(String id, Projeto projeto) {
        var buscaProjeto = find(id);
        if(buscaProjeto.isPresent()){
            var projetoAntigo = buscaProjeto.get(); 
            projetoAntigo.setNome(projeto.getNome());
            save(projeto);
            return projetoAntigo;
        }
        return null;
    
    }

    @Override
    public void remover(String id) {
        repository.deleteById(id);
    }
    
}
