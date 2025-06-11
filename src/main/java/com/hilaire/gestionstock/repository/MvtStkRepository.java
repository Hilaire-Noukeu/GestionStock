package com.hilaire.gestionstock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hilaire.gestionstock.model.MvtStk;

public interface MvtStkRepository extends JpaRepository<Integer,MvtStk> {
}
