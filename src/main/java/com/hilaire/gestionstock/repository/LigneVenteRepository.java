package com.hilaire.gestionstock.repository;

import com.hilaire.gestionstock.model.LigneVente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneVenteRepository extends JpaRepository<Integer, LigneVente> {
}
