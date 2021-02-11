package com.example.mysecondapp.repository;

import com.example.mysecondapp.model.Cats;
import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cats, Long> {
}
