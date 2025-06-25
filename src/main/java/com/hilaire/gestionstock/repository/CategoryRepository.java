package com.hilaire.gestionstock.repository;

import com.hilaire.gestionstock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hilaire.gestionstock.model.Category;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

    Optional<Category> findCategoryByCodeCategory(String codeCategory);

}
