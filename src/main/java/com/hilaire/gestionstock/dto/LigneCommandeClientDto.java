package com.hilaire.gestionstock.dto;

import com.hilaire.gestionstock.model.Article;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeClientDto {

    private Article article;
    
    private CommandeClientDto commandeClient;

}
