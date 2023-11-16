package com.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academy.entidades.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {

}
