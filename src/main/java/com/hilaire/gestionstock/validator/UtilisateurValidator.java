package com.hilaire.gestionstock.validator;

import com.hilaire.gestionstock.dto.CategoryDto;
import com.hilaire.gestionstock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

    public static List<String> validate (UtilisateurDto utilisateurDto){
        List<String> errors = new ArrayList<>();

        if (utilisateurDto == null){
            errors.add("Veuillez renseigner le nom de l'utilisateur");
            errors.add("Veuillez renseigner le prenom de l'utilisateur");
            errors.add("Veuillez renseigner le mail de l'utilisateur");
            errors.add("Veuillez renseigner l'adresse de l'utilisateur");
        }
        if (!StringUtils.hasLength(utilisateurDto.getNom())){
            errors.add("Veuillez renseigner le nom de l'utilisateur");
        }
        if (!StringUtils.hasLength(utilisateurDto.getPrenom())){
            errors.add("Veuillez renseigner le prenom de l'utilisateur");
        }
        if (!StringUtils.hasLength(utilisateurDto.getMail())){
            errors.add("Veuillez renseigner le mail de l'utilisateur");
        }
        if (utilisateurDto.getAdresse() == null){
            errors.add("Veuillez renseigner l'adresse de l'utilisateur");
        }else {
            if (!StringUtils.hasLength(utilisateurDto.getAdresse().getAdresse1())){
                errors.add("Veuillez renseigner l'adresse 1 de l'utilisateur");
            }
            if (!StringUtils.hasLength(utilisateurDto.getAdresse().getVille())){
                errors.add("Veuillez renseigner la ville de l'utilisateur");
            }
            if (!StringUtils.hasLength(utilisateurDto.getAdresse().getPays())){
                errors.add("Veuillez renseigner le pays de l'utilisateur");
            }
            if (!StringUtils.hasLength(utilisateurDto.getAdresse().getCodePostal())){
                errors.add("Veuillez renseigner le code postal de l'utilisateur");
            }
        }
        if (!StringUtils.hasLength(utilisateurDto.getMotDePasse())){
            errors.add("Veuillez renseigner le mot de passe de l'utilisateur");
        }

        return errors;

    }
}
