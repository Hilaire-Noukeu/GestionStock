package com.hilaire.gestionstock.model;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "entreprise")
@EqualsAndHashCode(callSuper = true)
public class Entreprise extends AbstractEntity{

    private String nom;

}
