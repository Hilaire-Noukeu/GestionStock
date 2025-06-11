package com.hilaire.gestionstock.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hilaire.gestionstock.model.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Integer, Entreprise> {
}
