package com.example.mysecondapp.service;

import com.example.mysecondapp.model.Cats;
import com.example.mysecondapp.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class CatServiceImpl implements CatService {
    @Autowired
    CatRepository catRepository;
    @Override
    public Iterable<Cats> getCats() {
        return catRepository.findAll();
    }
    @Override
    public Cats findCatById(Long id) {
        return catRepository.findById(id).get();
    }
    @Override
    public Cats createCat(Cats cat) {
        return catRepository.save(cat);
    }
    @Override
    public Cats updateCat(Cats cat) {
        return catRepository.save(cat);
    }
    @Override
    public HttpStatus deleteCat(Long id) {
        catRepository.deleteById(id);
        return HttpStatus.OK;
    }
}

