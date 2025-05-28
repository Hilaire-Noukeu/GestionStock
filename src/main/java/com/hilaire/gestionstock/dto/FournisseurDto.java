package com.hilaire.gestionstock.dto;

import java.util.List;
import jakarta.persistence.Embedded;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class FournisseurDto {


  private String nom;

  
  private String prenom;
  
  @Embedded
  private AdresseDto adresse;

  
  private String photo;

  private String mail;

  private String numTel;
  
  private List<CommandeFournisseurDto> commandeFournisseurs;

}
