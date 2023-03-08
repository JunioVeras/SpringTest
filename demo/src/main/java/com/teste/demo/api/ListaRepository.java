package com.teste.demo.api;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ListaRepository extends JpaRepository<Lista, Integer> {
    List<Lista> findByDoneFalse();
}
