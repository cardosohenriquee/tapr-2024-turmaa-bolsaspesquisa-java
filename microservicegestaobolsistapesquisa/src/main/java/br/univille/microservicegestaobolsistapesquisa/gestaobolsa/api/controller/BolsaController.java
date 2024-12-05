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

import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.model.Bolsa;
import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.service.BolsaService;

@RestController
@RequestMapping("/api/v1/bolsas")
public class BolsaController {

    @Autowired
    private BolsaService bolsaService;

    @GetMapping
    public ResponseEntity<List<Bolsa>> getAll() {
        return ResponseEntity.ok(bolsaService.getAll());
    }

    @PostMapping
    public ResponseEntity<Bolsa> create(@RequestBody Bolsa bolsa) {
        return ResponseEntity.ok(bolsaService.save(bolsa));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bolsa> find(@PathVariable String id) {
        return bolsaService.find(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bolsa> update(@PathVariable String id, @RequestBody Bolsa bolsa) {
        return ResponseEntity.ok(bolsaService.update(id, bolsa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        bolsaService.remover(id);
        return ResponseEntity.noContent().build();
    }
}
