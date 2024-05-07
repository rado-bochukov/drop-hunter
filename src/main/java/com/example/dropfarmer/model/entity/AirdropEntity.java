package com.example.dropfarmer.model.entity;

import com.example.dropfarmer.model.entity.enums.CategoryEnum;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table
public class AirdropEntity extends BaseEntity {

    @Column(name = "project_name", nullable = false)
    private String projectName;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "project_twitter")
    private String projectXUrl;
    @Column(name = "project_site")
    private String projectOfficialSiteUrl;
    @Column(name = "categories", nullable = false)
    @Enumerated(EnumType.STRING)
    private CategoryEnum category;
    @Column
    private boolean isCompleted;
    @Column(name = "eligibility_checker_url")
    private String eligibilityCheckerUrl;
    @Column
    private String snapshot;
    @OneToMany(mappedBy = "airdrop")
    private List<StrategyEntity> farmingStrategiesUrls;

    public AirdropEntity() {
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getProjectXUrl() {
        return projectXUrl;
    }

    public void setProjectXUrl(String projectXUrl) {
        this.projectXUrl = projectXUrl;
    }

    public String getProjectOfficialSiteUrl() {
        return projectOfficialSiteUrl;
    }

    public void setProjectOfficialSiteUrl(String projectOfficialSiteUrl) {
        this.projectOfficialSiteUrl = projectOfficialSiteUrl;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getEligibilityCheckerUrl() {
        return eligibilityCheckerUrl;
    }

    public void setEligibilityCheckerUrl(String eligibilityCheckerUrl) {
        this.eligibilityCheckerUrl = eligibilityCheckerUrl;
    }

    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    public List<StrategyEntity> getFarmingStrategiesUrls() {
        return farmingStrategiesUrls;
    }

    public void setFarmingStrategiesUrls(List<StrategyEntity> farmingStrategiesUrls) {
        this.farmingStrategiesUrls = farmingStrategiesUrls;
    }
}
