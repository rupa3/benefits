package com.sbi.benefits.models;

public class BenefitRewardEvent {

    private Integer benefitId;
    private Integer rewardAmount;

    public BenefitRewardEvent() {
    }

    public BenefitRewardEvent(Integer benefitId, Integer rewardAmount) {
        this.benefitId = benefitId;
        this.rewardAmount = rewardAmount;
    }

    public Integer getBenefitId() {
        return benefitId;
    }

    public void setBenefitId(Integer benefitId) {
        this.benefitId = benefitId;
    }

    public Integer getRewardAmount() {
        return rewardAmount;
    }

    public void setRewardAmount(Integer rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

}
