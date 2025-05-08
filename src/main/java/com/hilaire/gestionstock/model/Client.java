package com.hilaire.gestionstock.model;

import jakarta.persistence.Column;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "client")
public class Client extends AbstractEntity{

  @Column(name = "nom")
  private String nom;

  @Column(name = "prenom")
  private String prenom;

  //private adress

  @Column(name = "photo")
  private String photo;

  @Column(name = "mail")
  private String mail;

  @Column(name = "numTel")
  private String numTel;
}
