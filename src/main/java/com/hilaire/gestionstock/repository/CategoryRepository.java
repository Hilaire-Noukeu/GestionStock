package com.hilaire.gestionstock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hilaire.gestionstock.model.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Integer, Category> {

}
