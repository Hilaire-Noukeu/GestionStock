package com.hilaire.gestionstock.dto;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hilaire.gestionstock.model.CommandeFournisseur;
import com.hilaire.gestionstock.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeFournisseurDto {

    private  Integer id;

    private String code;
    
    private Instant dateCommande;
    
    private FournisseurDto fournisseur;

    @JsonIgnore
    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;


   public static CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur) {
       if (commandeFournisseur == null){
           return null;
       }
       CommandeFournisseurDto.builder()
               .id(commandeFournisseur.getId())
               .code(commandeFournisseur.getCode())
               .dateCommande(commandeFournisseur.getDateCommande())
               .build();
   }

   public static CommandeFournisseur toEntity(CommandeFournisseurDto commandeFournisseurDto) {
       if (commandeFournisseurDto == null){
           return null;
       }
       CommandeFournisseur commandeFournisseur = new CommandeFournisseur();

       commandeFournisseur.setId(commandeFournisseurDto.getId());
       commandeFournisseur.setCode(commandeFournisseurDto.getCode());
       commandeFournisseur.SetDateCommande(commandeFournisseurDto.get());

       return commandeFournisseur;
   }
}
