package com.example.mysecondapp.service;

import com.example.mysecondapp.model.Cats;
import org.springframework.http.HttpStatus;

public interface CatService {
    Iterable<Cats> getCats();
    Cats findCatById(Long id);
    Cats createCat(Cats cat);
    Cats updateCat(Cats cat);
    HttpStatus deleteCat(Long id);

}
