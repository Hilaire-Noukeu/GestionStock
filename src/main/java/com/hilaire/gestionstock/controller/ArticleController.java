package com.hilaire.gestionstock.controller;

import com.hilaire.gestionstock.controller.Api.ArticleApi;
import com.hilaire.gestionstock.dto.ArticleDto;
import com.hilaire.gestionstock.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController implements ArticleApi {

    private ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }
    @Override
    public ArticleDto save(ArticleDto articleDto) {
        return articleService.save(articleDto);
    }

    @Override
    public ArticleDto findById(Integer id) {
        return articleService.findById(id);
    }

    @Override
    public ArticleDto findByCodeArticle(String codeArticle) {
        return articleService.findByCodeArticle(codeArticle);
    }

    @Override
    public List<ArticleDto> finAll() {
        return articleService.finAll();
    }

    @Override
    public void delete(Integer id) {

        articleService.delete(id);
    }
}
