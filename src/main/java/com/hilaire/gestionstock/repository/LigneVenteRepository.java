package com.hilaire.gestionstock.repository;

import com.hilaire.gestionstock.model.LigneVente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneVenteRepository extends JpaRepository<Integer, LigneVente> {
}
