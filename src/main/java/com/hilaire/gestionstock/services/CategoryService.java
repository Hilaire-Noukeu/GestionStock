package com.hilaire.gestionstock.services;

import com.hilaire.gestionstock.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    CategoryDto save(CategoryDto category);
    CategoryDto findById(Integer id);
    CategoryDto findByCodeCategory(String codeCategory);
    List<CategoryDto> findAll();
    void delete(Integer id);

}
