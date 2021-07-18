package com.sbi.benefits.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "BENEFIT_REWARD",schema = "public")
public class BenefitReward {

    @Id
    @Column(name = "BENEFIT_ID")
    private Integer benefitId;

    @Column(name = "REWARD_AMOUNT",nullable = false)
    private Integer rewardAmount;

    public BenefitReward() {
    }

    public BenefitReward(Integer benefitId, Integer rewardAmount) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BenefitReward)) return false;
        BenefitReward that = (BenefitReward) o;
        return benefitId.equals(that.benefitId) && rewardAmount.equals(that.rewardAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(benefitId, rewardAmount);
    }
}
