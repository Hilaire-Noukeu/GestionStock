package com.hilaire.gestionstock.dto;

import java.time.Instant;
import java.util.List;

import com.hilaire.gestionstock.model.Entreprise;
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



}
