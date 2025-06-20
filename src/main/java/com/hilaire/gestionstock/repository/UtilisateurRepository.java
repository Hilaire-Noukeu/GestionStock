package com.hilaire.gestionstock.repository;

import com.hilaire.gestionstock.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Integer, Utilisateur> {
}
