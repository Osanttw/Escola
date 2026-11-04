package com.seduc2.escola.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.seduc2.escola.entity.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}