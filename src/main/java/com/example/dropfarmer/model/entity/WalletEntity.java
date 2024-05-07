package com.example.dropfarmer.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "wallets")
public class WalletEntity extends BaseEntity {
    @Column(nullable = false)
    private String publicKey;
    @Column
    private String walletName;



    public WalletEntity() {
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getWalletName() {
        return walletName;
    }

    public void setWalletName(String walletName) {
        this.walletName = walletName;
    }


}
