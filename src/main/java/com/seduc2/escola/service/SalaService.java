package com.seduc2.escola.service;

import com.seduc2.escola.entity.Sala;
import org.springframework.stereotype.Service;
import com.seduc2.escola.repository.SalaRepository;

import java.util.List;

@Service
public class SalaService {


    private final SalaRepository repository;

    public SalaService(SalaRepository repository) {
        this.repository = repository;

    }

    public List<Sala> buscarTodas(){
        return repository.findAll();
    }

    public void criaSALA(Sala s) {
        Sala sala = new Sala(s.getNome(),s.getCadeira(),s.getMesas(),s.getAlunos());
        repository.save(sala);
    }
}
