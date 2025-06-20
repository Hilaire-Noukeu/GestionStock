package com.hilaire.gestionstock.repository;

import com.hilaire.gestionstock.model.LigneCommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneCommandeClientRepository extends JpaRepository<Integer, LigneCommandeClient> {

}
