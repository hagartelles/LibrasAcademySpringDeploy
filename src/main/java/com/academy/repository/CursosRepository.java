package com.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.academy.entidades.Cursos;

public interface CursosRepository extends JpaRepository<Cursos, Long> {

}
