package com.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.academy.entidades.FaleConosco;

public interface FaleRepository extends JpaRepository<FaleConosco, Long> {

}
