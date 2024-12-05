package br.univille.microservicegestaobolsistapesquisa.gestaobolsa.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.model.Projeto;
import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.service.ProjetoService;

@RestController
@RequestMapping("/api/v1/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @GetMapping
    public ResponseEntity<List<Projeto>> getAll() {
        return ResponseEntity.ok(projetoService.getAll());
    }

    @PostMapping
    public ResponseEntity<Projeto> create(@RequestBody Projeto projeto) {
        return ResponseEntity.ok(projetoService.save(projeto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Projeto> find(@PathVariable String id) {
        return projetoService.find(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Projeto> update(@PathVariable String id, @RequestBody Projeto projeto) {
        return ResponseEntity.ok(projetoService.update(id, projeto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        projetoService.remover(id);
        return ResponseEntity.noContent().build();
    }
}
