package com.hilaire.gestionstock.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hilaire.gestionstock.model.CommandeFournisseur;

public interface CommandeFournisseurRepository extends JpaRepository<Integer, CommandeFournisseur> {
}
