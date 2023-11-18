package com.academy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.academy.entidades.Cursos;

public interface CursosRepository extends JpaRepository<Cursos, Long> {

}
