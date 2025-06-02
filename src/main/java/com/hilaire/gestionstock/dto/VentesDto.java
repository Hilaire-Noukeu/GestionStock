package com.hilaire.gestionstock.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class VentesDto {

     private  Integer id;

     private List<LigneVenteDto> ligneVentes;
}
