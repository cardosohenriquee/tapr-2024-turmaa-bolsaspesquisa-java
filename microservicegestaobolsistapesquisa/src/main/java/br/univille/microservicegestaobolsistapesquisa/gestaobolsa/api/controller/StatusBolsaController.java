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

import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.model.StatusBolsa;
import br.univille.microservicegestaobolsistapesquisa.gestaobolsa.service.StatusBolsaService;

@RestController
@RequestMapping("/api/v1/statusbolsa")
public class StatusBolsaController {

    @Autowired
    private StatusBolsaService statusBolsaService;

    @GetMapping
    public ResponseEntity<List<StatusBolsa>> getAll() {
        return ResponseEntity.ok(statusBolsaService.getAll());
    }

    @PostMapping
    public ResponseEntity<StatusBolsa> create(@RequestBody StatusBolsa statusBolsa) {
        return ResponseEntity.ok(statusBolsaService.save(statusBolsa));
    }

    @GetMapping("/{id}")
    public ResponseEntity<StatusBolsa> find(@PathVariable String id) {
        return statusBolsaService.find(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<StatusBolsa> update(@PathVariable String id, @RequestBody StatusBolsa statusBolsa) {
        return ResponseEntity.ok(statusBolsaService.update(id, statusBolsa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        statusBolsaService.remover(id);
        return ResponseEntity.noContent().build();
    }
}
