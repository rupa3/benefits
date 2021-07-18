package com.sbi.benefits.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="BENEFITS",schema = "public")
public class BenefitTable implements Serializable {

    @Id
    @Column(name = "APPLICATION_ID")
    private Integer applicationId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "BENEFIT_ID")
    private Integer benefitId;

    @Column(name = "REWARD_VALUE")
    private Integer rewardValue;

    @Column(name="REWARD_TYPE")
    private String rewardType;

    @Column(name ="BENIFIT_STATUS")
    private String rewardStatus;

    @Column(name = "SSN")
    private String ssn;

    public BenefitTable() {
    }

    public BenefitTable(Integer applicationId, String name,String ssn,String email, Integer benefitId, Integer rewardValue, String rewardType) {
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

    public String getRewardStatus() {
        return rewardStatus;
    }

    public void setRewardStatus(String rewardStatus) {
        this.rewardStatus = rewardStatus;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
