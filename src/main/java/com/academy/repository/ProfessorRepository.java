package com.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academy.entidades.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
