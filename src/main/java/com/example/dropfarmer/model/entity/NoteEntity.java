package com.example.dropfarmer.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "notes")
public class NoteEntity extends BaseEntity {
    @Column(nullable = false)
    private String textContent;

    @ManyToOne
    private FarmingProcessEntity farmingProcessEntity;

    public NoteEntity() {
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public FarmingProcessEntity getFarmingProcess() {
        return farmingProcessEntity;
    }

    public void setFarmingProcess(FarmingProcessEntity farmingProcessEntity) {
        this.farmingProcessEntity = farmingProcessEntity;
    }
}
