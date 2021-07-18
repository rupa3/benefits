package com.sbi.benefits.models;

public class BenefitCreateEvent {
    private Integer applicationId;
    private String name;
    private String ssn;
    private String email;
    private Integer benefitId;
    private Integer rewardValue;
    private String rewardType;


    public BenefitCreateEvent(){

    }

    public BenefitCreateEvent(Integer applicationId, String name, String ssn, String email, Integer benefitId, Integer rewardValue, String rewardType) {
        this.applicationId = applicationId;
        this.name = name;
        this.ssn = ssn;
        this.email = email;
        this.benefitId = benefitId;
        this.rewardValue = rewardValue;
        this.rewardType = rewardType;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBenefitId() {
        return benefitId;
    }

    public void setBenefitId(Integer benefitId) {
        this.benefitId = benefitId;
    }

    public Integer getRewardValue() {
        return rewardValue;
    }

    public void setRewardValue(Integer rewardValue) {
        this.rewardValue = rewardValue;
    }

    public String getRewardType() {
        return rewardType;
    }

    public void setRewardType(String rewardType) {
        this.rewardType = rewardType;
    }
}

