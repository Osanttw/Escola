package com.seduc2.escola.controller;


import com.seduc2.escola.service.SalaService;
import com.seduc2.escola.entity.Sala;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalaController {

    private final SalaService service;
    public SalaController(SalaService service) {
        this.service = service;
    }
    @GetMapping
    public List<Sala>mostrarSala(){
        return service.buscarTodas();
    }

    @PostMapping
    public void criarSala(@RequestBody Sala s){
        service.criaSALA(s);
    }


}
