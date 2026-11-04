package com.seduc2.escola.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.seduc2.escola.entity.Professor;
import com.seduc2.escola.repository.ProfessorRepository;

@Service
public class ProfessorService {

    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public List<Professor> listar() {
        return repository.findAll();
    }

    public Optional<Professor> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Professor salvar(Professor professor) {
        professor.setId(null);
        return repository.save(professor);
    }

    public Optional<Professor> atualizar(Long id, Professor professor) {
        if (!repository.existsById(id)) {
            return Optional.empty();
        }
        professor.setId(id);
        return Optional.of(repository.save(professor));
    }

    public boolean deletar(Long id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}