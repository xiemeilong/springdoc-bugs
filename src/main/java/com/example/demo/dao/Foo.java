package com.example.demo.dao;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Foo {
    @Id
    @GeneratedValue
    private Long id;

    @JsonView(Views.Value.class)
    private String value;
}
