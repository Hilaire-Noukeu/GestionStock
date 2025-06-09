package com.hilaire.gestionstock.repository;

import com.hilaire.gestionstock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Integer, Article> {

}
