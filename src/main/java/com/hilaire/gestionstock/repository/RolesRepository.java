package com.hilaire.gestionstock.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hilaire.gestionstock.model.Roles;

public interface RolesRepository extends JpaRepository<Integer, Roles> {
}
