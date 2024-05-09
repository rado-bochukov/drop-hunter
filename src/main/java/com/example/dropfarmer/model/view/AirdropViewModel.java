package com.example.dropfarmer.model.view;

import com.example.dropfarmer.model.entity.enums.CategoryEnum;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class AirdropViewModel {

    private Long id;
    private String projectName;
    private String imageUrl;
    private String projectXUrl;
    private String projectOfficialSiteUrl;
    private CategoryEnum category;
    private boolean isCompleted;
    private String eligibilityCheckerUrl;
    private String snapshot;

    public AirdropViewModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
