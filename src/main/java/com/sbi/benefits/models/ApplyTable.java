package com.sbi.benefits.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


public class ApplyTable {


    private Integer applicationId;

    private String name;

    private String ssn;

    private String address;

    private String email;

    public ApplyTable() {
    }

    public ApplyTable(Integer applicationId, String name, String ssn, String address, String email) {
        this.applicationId = applicationId;
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.email = email;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplyTable that = (ApplyTable) o;
        return applicationId.equals(that.applicationId) && Objects.equals(name, that.name) && Objects.equals(ssn, that.ssn) && Objects.equals(address, that.address) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, name, ssn, address, email);
    }
}
