package br.univille.microservicegestaobolsistapesquisa.gestaobolsa.model;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "curso", autoCreateContainer = true)
public class Curso {
    @Id
    @PartitionKey
    @GeneratedValue
    private String id;
    private String nome;


    public Curso() {}

    public Curso (String id, String nome) {
        this.id = id;
        this.nome = nome;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}