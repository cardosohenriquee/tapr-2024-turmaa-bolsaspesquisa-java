package br.univille.microservicegestaobolsistapesquisa.gestaobolsa.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.model.Curso;
import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.repository.CursoRepository;
import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService{

    @Autowired
    private CursoRepository repository;

    @Override
    public List<Curso> getAll() {
        var retorno = repository.findAll();
        List<Curso> listaCursos = new ArrayList<Curso>();
        retorno.forEach(listaCursos::add);
        return listaCursos;
    }

    @Override
    public Curso save(Curso curso) {
        return repository.save(curso);
    }

    @Override
    public Optional<Curso> find(String id) {
        return Optional.ofNullable(repository.findById(id)).orElseThrow();
    }

    @Override
    public Curso update(String id, Curso curso) {
        var buscaCurso = find(id);
        if(buscaCurso.isPresent()){
            var cursoAntigo = buscaCurso.get(); 
            cursoAntigo.setNome(curso.getNome());
            save(cursoAntigo);
            return cursoAntigo;
        }
        return null;
    }

    @Override
    public void remover(String id) {
        repository.deleteById(id);
    }
    
    
}
