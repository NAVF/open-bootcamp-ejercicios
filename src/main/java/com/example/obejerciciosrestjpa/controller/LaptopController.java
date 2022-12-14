package com.example.obejerciciosrestjpa.controller;

import com.example.obejerciciosrestjpa.entities.Laptop;
import com.example.obejerciciosrestjpa.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {
    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/api/show")
    public List<Laptop> show(){
        return laptopRepository.findAll();
    }

    @PostMapping("/api/create")
    public Laptop create(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }
}
