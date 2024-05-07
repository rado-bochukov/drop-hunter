package com.example.dropfarmer.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "farming_process")
public class FarmingProcessEntity extends BaseEntity {
    @ManyToMany
    private List<WalletEntity> walletNameAddress;
    @Column
    private BigDecimal cost;
    @Column
    private BigDecimal reward;

    @OneToMany(mappedBy = "farmingProcessEntity",
            fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<NoteEntity> notes;

    @OneToOne
    private AirdropEntity airdrop;


    public FarmingProcessEntity() {
    }

    public List<WalletEntity> getWalletNameAddress() {
        return walletNameAddress;
    }

    public void setWalletNameAddress(List<WalletEntity> walletNameAddress) {
        this.walletNameAddress = walletNameAddress;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getReward() {
        return reward;
    }

    public void setReward(BigDecimal reward) {
        this.reward = reward;
    }

    public List<NoteEntity> getNotes() {
        return notes;
    }

    public void setNotes(List<NoteEntity> notes) {
        this.notes = notes;
    }

    public AirdropEntity getAirdrop() {
        return airdrop;
    }

    public void setAirdrop(AirdropEntity airdrop) {
        this.airdrop = airdrop;
    }
}
