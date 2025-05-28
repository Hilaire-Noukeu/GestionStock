package com.hilaire.gestionstock.dto;

import java.time.Instant;
import java.util.List;

import com.hilaire.gestionstock.model.LigneCommandeClient;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeClientDto {

     
    private String code;
    
    
    private Instant dateCommande;
    
   
    private ClientDto client;
    
   
    private List<LigneCommandeClientDto> ligneCommandeClients;
}
