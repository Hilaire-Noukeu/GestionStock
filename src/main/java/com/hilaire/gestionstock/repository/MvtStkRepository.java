package com.hilaire.gestionstock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hilaire.gestionstock.model.MvtStk;
import org.springframework.stereotype.Repository;

@Repository
public interface MvtStkRepository extends JpaRepository<Integer,MvtStk> {
}
