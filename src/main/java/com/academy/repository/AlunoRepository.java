package com.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academy.entidades.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
