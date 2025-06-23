package com.hilaire.gestionstock.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hilaire.gestionstock.model.Entreprise;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise,Integer> {
}
