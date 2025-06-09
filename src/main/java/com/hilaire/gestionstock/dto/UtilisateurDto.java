package com.hilaire.gestionstock.dto;

import java.time.Instant;
import java.util.List;

import com.hilaire.gestionstock.model.Entreprise;
import com.hilaire.gestionstock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDto {

  private  Integer id;

  private String nom;

  private String prenom;

  private String mail;

  private Instant dateDeNaissance;

  private AdresseDto adresse;

  private String photo;

  private String motDePasse;

  private Entreprise entreprise;

  private List<RolesDto> roles;


  public static UtilisateurDto fromEntity(Utilisateur utilisateur) {
    if (utilisateur == null){
      return null;
    }
    return UtilisateurDto.builder()
            .id(utilisateur.getId())
            .nom(utilisateur.getNom())
            .prenom(utilisateur.getPrenom())
            .mail(utilisateur.getMail())
            .dateDeNaissance(utilisateur.getDateDeNaissance())
            .photo(utilisateur.getPhoto())
            .motDePasse(utilisateur.getMotDePasse())
            .build();
  }

  public static Utilisateur toEntity(UtilisateurDto utilisateurDto) {
    if (utilisateurDto == null){
      return null;
    }
    Utilisateur utilisateur = new Utilisateur();

    utilisateur.setId(utilisateurDto.getId());
    utilisateur.setNom(utilisateurDto.getNom());
    utilisateur.setPrenom(utilisateurDto.getPrenom());
    utilisateur.setMail(utilisateurDto.getMail());
    //Utilisateur.setDateDeNaissance(utilisateurDto.getDateDeNaissance());
    utilisateur.setPhoto(utilisateurDto.getPhoto());
    utilisateur.setMotDePasse(utilisateurDto.getMotDePasse());

    return utilisateur;
  }

}
