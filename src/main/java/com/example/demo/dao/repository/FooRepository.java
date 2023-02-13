package com.example.demo.dao.repository;

import com.example.demo.dao.Foo;
import org.springframework.data.repository.CrudRepository;

public interface FooRepository extends CrudRepository<Foo,Long> {
}
