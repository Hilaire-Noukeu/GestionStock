package com.hilaire.gestionstock.dto;

import java.math.BigDecimal;

import com.hilaire.gestionstock.model.Article;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ArticleDto {
    private  Integer id;

    private String codeArticle;
    
    private String designation;
    
    private BigDecimal prixUnitaireHt;
    
    private BigDecimal tauxTva;
    
    private BigDecimal prixUnitaireTtc;
    
    private String photo;
    
    private CategoryDto category;

    //mapping from Entity to Dto

    public ArticleDto fromEntity(Article article){
        if(article == null){
            return null;
        }
        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .prixUnitaireHt(article.getPrixUnitaireHt())
                .tauxTva(article.getTauxTva())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .photo(article.getPhoto())
                .build();
    }

    //mapping from Dto to Entity


}
