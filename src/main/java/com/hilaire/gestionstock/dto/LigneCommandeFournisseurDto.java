package com.hilaire.gestionstock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeFournisseurDto {

    private  Integer id;

    private ArticleDto article;
    @JsonIgnore
    private CommandeFournisseurDto commandeFournisseur;



}
