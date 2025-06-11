package com.hilaire.gestionstock.repository;
import com.hilaire.gestionstock.model.CommandeClient;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<Integer, CommandeClient> {
}
