package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User2 {
    @Id
    private Integer id;
    private String pwd;
    private String name;
}
