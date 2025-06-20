package com.hilaire.gestionstock.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hilaire.gestionstock.model.CommandeFournisseur;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeFournisseurRepository extends JpaRepository<Integer, CommandeFournisseur> {
}
