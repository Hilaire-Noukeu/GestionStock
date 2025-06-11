package com.hilaire.gestionstock.repository;

import com.hilaire.gestionstock.model.Ventes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentesRepository extends JpaRepository<Integer, Ventes> {
}
