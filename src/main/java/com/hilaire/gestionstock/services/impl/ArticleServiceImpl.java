package com.hilaire.gestionstock.services.impl;

import com.hilaire.gestionstock.dto.ArticleDto;
import com.hilaire.gestionstock.exception.EntityNotFoundException;
import com.hilaire.gestionstock.exception.ErrorCodes;
import com.hilaire.gestionstock.exception.InvalidEntityException;
import com.hilaire.gestionstock.model.Article;
import com.hilaire.gestionstock.repository.ArticleRepository;
import com.hilaire.gestionstock.services.ArticleService;
import com.hilaire.gestionstock.validator.ArticleValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {


    private ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public ArticleDto save(ArticleDto articleDto) {

        List<String> errors = ArticleValidator.validate(articleDto);
        if(!errors.isEmpty()) {
            log.error("Article invalid",articleDto);
            throw new InvalidEntityException("article invalid", ErrorCodes.ARTICLE_NOT_VALID,errors);
        }
        return ArticleDto.fromEntity(articleRepository.save(ArticleDto.toEntity(articleDto)));
    }

    @Override
    public ArticleDto findById(Integer id) {

        if(id == null) {
            log.error("Article id is null");
            return null;
        }

        Optional<Article> article = articleRepository.findById(id);
        return Optional.of(ArticleDto.fromEntity(article.get())).orElseThrow(() -> new EntityNotFoundException("aucun article",ErrorCodes.ARTICLE_NOT_FOUND));
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
    public void delete(Integer id) {

    }

}
