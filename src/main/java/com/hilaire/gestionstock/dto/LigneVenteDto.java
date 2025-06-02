package com.hilaire.gestionstock.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class LigneVenteDto {

    private  Integer id;

    private BigDecimal quantite;
    
    private VentesDto vente;

}
