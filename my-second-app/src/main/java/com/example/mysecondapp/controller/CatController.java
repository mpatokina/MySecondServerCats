package com.example.mysecondapp.controller;

import com.example.mysecondapp.model.Cats;
import com.example.mysecondapp.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cats")
// http://localhost:8080/cats
public class CatController {
    @Autowired
    CatService catService;
    @GetMapping
    public Iterable<Cats> getCats() {
        return catService.getCats();
    }
    @GetMapping("/{id}") // http://localhost:8080/cats/:id
    public Cats getCatById(@PathVariable Long id) {
        return catService.findCatById(id);
    }
    @PostMapping
    public Cats createCat(@RequestBody Cats cat) {
        return catService.createCat(cat);
    }
    @PatchMapping
    public Cats updateCat(@RequestBody Cats cat) {
        return catService.updateCat(cat);
    }
    @DeleteMapping("/{id}")
    public HttpStatus deleteCatById(@PathVariable Long id) {
        return catService.deleteCat(id);
    }
}
