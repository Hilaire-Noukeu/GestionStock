package com.hilaire.gestionstock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hilaire.gestionstock.model.Entreprise;
import jakarta.persistence.Embedded;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class EntrepriseDto {

    private  Integer id;

    private String nom;

    private  String description;

    private AdresseDto adresse;

    private  String codeFiscal;

    private String photo;

    private String mail;

    private String numTel;

    private String siteWeb;

    @JsonIgnore
    private  List<UtilisateurDto> utilisateurs;

    public static EntrepriseDto fromEntity(Entreprise entreprise) {
        if (entreprise == null){
            return null;
        }
        EntrepriseDto.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .description(entreprise.getDescription())
                .codeFiscal(entreprise.getCodeFiscal())
                .photo(entreprise.getPhoto())
                .mail(entreprise.getMail())
                .numTel(entreprise.getNumTel())
                .siteWeb(entreprise.getSiteWeb())
                .build();

    }

    public static Entreprise toEntity(EntrepriseDto EntrepriseDto) {
        if (EntrepriseDto == null){
            return null;
        }
        Entreprise entreprise = new Entreprise();

        entreprise.setId(EntrepriseDto.getId());
        entreprise.setNom(EntrepriseDto.getNom());
        entreprise.setDescription(EntrepriseDto.getDescription());
        entreprise.setCodeFiscal(EntrepriseDto.getCodeFiscal());
        entreprise.setPhoto(EntrepriseDto.getPhoto());
        entreprise.setMail(EntrepriseDto.getMail());
        entreprise.setNumTel(EntrepriseDto.getNumTel());
        entreprise.setSiteWeb(EntrepriseDto.getSiteWeb());

        return entreprise;

    }
}
