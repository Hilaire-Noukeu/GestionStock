package com.hilaire.gestionstock.dto;

import java.time.Instant;
import java.util.List;

import com.hilaire.gestionstock.model.Adresse;
import com.hilaire.gestionstock.model.Entreprise;
import com.hilaire.gestionstock.model.Roles;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtrilisateurDto {

    private String nom;

  private String prenom;

  private String mail;

  private Instant dateDeNaissance;

  private AdresseDto adresse;
  

  @Column(name = "photo")
  private String photo;

  private String motDePasse;

  private Entreprise entreprise;

  private List<RolesDto> roles;



}
