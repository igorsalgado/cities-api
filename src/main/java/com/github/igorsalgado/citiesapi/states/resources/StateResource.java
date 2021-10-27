package com.github.igorsalgado.citiesapi.states.resources;

import com.github.igorsalgado.citiesapi.states.repositories.StateRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/states")
public class StateResource {
    private StateRepository repository;
}
