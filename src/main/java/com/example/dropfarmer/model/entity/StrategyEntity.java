package com.example.dropfarmer.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "strategies_url")
public class StrategyEntity extends BaseEntity {
    @Column(nullable = false)
    private String url;

    @ManyToOne
    private AirdropEntity airdrop;

    public StrategyEntity() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
