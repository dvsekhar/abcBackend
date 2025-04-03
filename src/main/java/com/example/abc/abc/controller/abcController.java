package com.example.abc.abc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.abc.abc.service.AbcJpaService;
import com.example.abc.abc.model.Abc;

@RestController
public class abcController {

    @Autowired
    public AbcJpaService abcService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/abc/{id}")
    public Abc getAbcById(@PathVariable("id") int id) {
        return abcService.getAbcById(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/abc/{id}")
    public Abc updateAbc(@PathVariable("id") int id, @RequestBody Abc abc) {
        return abcService.updateAbc(id, abc);
    }

}