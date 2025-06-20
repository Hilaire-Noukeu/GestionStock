package com.hilaire.gestionstock.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hilaire.gestionstock.model.Roles;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Integer, Roles> {
}
