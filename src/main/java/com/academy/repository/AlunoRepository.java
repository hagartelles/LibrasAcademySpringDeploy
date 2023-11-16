package com.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academy.entidades.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
