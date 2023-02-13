package com.example.demo.controller;

import com.example.demo.dao.Foo;
import com.example.demo.dao.Views;
import com.example.demo.dao.repository.FooRepository;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foo")
@AllArgsConstructor
public class FooController {

    private FooRepository fooRepository;



    @GetMapping("/{id}")
    public Foo  getById( @PathVariable("id") Foo value) {
        return value;
    }


    @PostMapping
    @JsonView(Views.Value.class)
    public Foo create(
            @RequestBody @JsonView(Views.Value.class) Foo value) {
        return fooRepository.save(value);
    }
}
