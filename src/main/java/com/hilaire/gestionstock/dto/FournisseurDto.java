package com.hilaire.gestionstock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hilaire.gestionstock.model.Fournisseur;
import jakarta.persistence.Embedded;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class FournisseurDto {

  private  Integer id;

  private String nom;

  private String prenom;

  private AdresseDto adresse;

  private String photo;

  private String mail;

  private String numTel;

  @JsonIgnore
  private List<CommandeFournisseurDto> commandeFournisseurs;

  public  static FournisseurDto fromEntity(Fournisseur fournisseur) {
    if (fournisseur == null){
      return null;
    }
    FournisseurDto.builder()
            .id(fournisseur.getId())
            .nom(fournisseur.getNom())
            .prenom(fournisseur.getPrenom())
            .photo(fournisseur.getPhoto())
            .mail(fournisseur.getMail())
            .numTel(fournisseur.getNumTel())
            .build();
  }

  public static Fournisseur toEntity(FournisseurDto FournisseurDto) {
    if (FournisseurDto == null){
      return null;
    }
    Fournisseur fournisseur = new Fournisseur();

    fournisseur.setId(FournisseurDto.getId());
    fournisseur.setNom(FournisseurDto.getNom());
    fournisseur.setPrenom(FournisseurDto.getNom());
    fournisseur.setPhoto(FournisseurDto.getPhoto());
    fournisseur.setMail(FournisseurDto.getMail());
    fournisseur.setNumTel(FournisseurDto.getNumTel());

    return fournisseur;
  }
}
