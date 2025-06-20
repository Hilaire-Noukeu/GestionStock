package com.hilaire.gestionstock.services.impl;

import com.hilaire.gestionstock.dto.ArticleDto;
import com.hilaire.gestionstock.services.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {


    @Override
    public ArticleDto save(ArticleDto articleDto) {
        return null;
    }

    @Override
    public ArticleDto findById(Integer id) {
        return null;
    }

    @Override
    public ArticleDto findByCodeArticle(String codeArticle) {
        return null;
    }

    @Override
    public List<ArticleDto> finAll() {
        return List.of();
    }

    @Override
    public void delete() {

    }
}
