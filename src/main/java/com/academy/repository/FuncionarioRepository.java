package com.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academy.entidades.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
