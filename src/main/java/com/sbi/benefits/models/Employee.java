package com.sbi.benefits.models;

import org.springframework.data.annotation.Id;


public class Employee {

    @Id
    private String empId;
    private String name;
    private int age;
    private double salary;
}
