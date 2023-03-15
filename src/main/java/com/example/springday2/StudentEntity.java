package com.example.springday2;

import lombok.*;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Students")
@Data
public class StudentEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public StudentEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentEntity() {
    }
}
