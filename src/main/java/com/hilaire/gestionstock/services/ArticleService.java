package com.hilaire.gestionstock.services;

import com.hilaire.gestionstock.dto.ArticleDto;

import java.util.List;

public interface ArticleService {

    ArticleDto save(ArticleDto articleDto) ;

    ArticleDto findById(Integer id);

    ArticleDto findByCodeArticle(String codeArticle);

    List<ArticleDto> finAll();

    void delete();
}
