package com.hilaire.gestionstock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hilaire.gestionstock.model.Category;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryDto {

  private  Integer id;

  private String code;
  
  private String designation;

  @JsonIgnore
  private List<ArticleDto> articles;

   //mapping from Entity to Dto
  public  CategoryDto fromEntity(Category category) {

    if (category == null){
        return null;
    }
      return CategoryDto.builder()
              .id(category.getId())
              .code(category.getCode())
              .designation(category.getDesignation())
              .build();
  }

  //mapping from Dto to Entity


}
