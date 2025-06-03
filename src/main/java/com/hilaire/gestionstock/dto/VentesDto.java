package com.hilaire.gestionstock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class VentesDto {

     private  Integer id;

     @JsonIgnore
     private List<LigneVenteDto> ligneVentes;
}
