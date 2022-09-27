package com.example.springbootbatch.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Person {
    @Id
    private Integer id;
    private String name;
    private String dept;
    private Integer salary;

}
