package com.hilaire.gestionstock.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {

     private  Integer id;

     private String nom;
 
     private UtilisateurDto utilisateur;


}
