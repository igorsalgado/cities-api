package com.github.igorsalgado.citiesapi.countries.resources;

import com.github.igorsalgado.citiesapi.countries.entities.Country;
import com.github.igorsalgado.citiesapi.countries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository repository;

    @GetMapping
    public List<Country> countries() {
        return repository.findAll();
    }
}