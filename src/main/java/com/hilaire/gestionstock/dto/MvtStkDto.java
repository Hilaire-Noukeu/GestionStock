package com.hilaire.gestionstock.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Data
@Builder
public class MvtStkDto {

    private  Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDto article;


}
