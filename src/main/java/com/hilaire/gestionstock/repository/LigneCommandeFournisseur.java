package com.hilaire.gestionstock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneCommandeFournisseur extends JpaRepository<Integer, LigneCommandeFournisseur> {
}
