package com.hilaire.gestionstock.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {

     private String nom;

 
  private UtrilisateurDto utilisateur;


}
