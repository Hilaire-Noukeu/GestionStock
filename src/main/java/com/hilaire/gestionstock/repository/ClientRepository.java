package com.hilaire.gestionstock.repository;

import com.hilaire.gestionstock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Integer, Client> {
}
