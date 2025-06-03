package com.hilaire.gestionstock.dto;

import java.math.BigDecimal;

import com.hilaire.gestionstock.model.LigneVente;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class LigneVenteDto {

    private  Integer id;

    private BigDecimal quantite;
    
    private VentesDto vente;

    public static LigneVenteDto fromEntity(LigneVente ligneVente) {
        if (ligneVente == null){
            return null;
        }
        LigneVenteDto.builder()
                .id(ligneVente.getId())
                .quantite(ligneVente.getQuantite())
                .build();
    }

    public static LigneVente toEntity(LigneVenteDto ligneVenteDto) {
        if (ligneVenteDto == null){
            return null;
        }
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVenteDto.getId());
        ligneVente.setQuantite(ligneVente.getQuantite());
        return ligneVente;
    }

}
