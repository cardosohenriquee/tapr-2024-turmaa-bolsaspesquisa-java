package br.univille.microservicegestaobolsistapesquisa.gestaobolsa.model;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "statusBolsa", autoCreateContainer = true)
public class StatusBolsa {
    @Id
    @PartitionKey
    @GeneratedValue
    private String id;
    private Boolean status;

    public StatusBolsa() {}

    public StatusBolsa(Boolean status) {
        this.status = status;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}