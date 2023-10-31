package com.Suheal.hrms.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    @Id
    private Long id;
    private String ename;
    private int age;
    private Double esal;
    private String address;
}
