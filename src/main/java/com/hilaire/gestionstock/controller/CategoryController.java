package com.hilaire.gestionstock.controller;

import com.hilaire.gestionstock.controller.Api.CategoryApi;
import com.hilaire.gestionstock.dto.CategoryDto;
import com.hilaire.gestionstock.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController implements CategoryApi {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        return categoryService.save(categoryDto);
    }

    @Override
    public CategoryDto findById(Integer id) {
        return categoryService.findById(id);
    }

    @Override
    public CategoryDto findByCodeArticle(String codeCategory) {
        return categoryService.findByCodeCategory(codeCategory);
    }

    @Override
    public List<CategoryDto> finAll() {
        return categoryService.findAll();
    }

    @Override
    public void delete(Integer id) {

        categoryService.delete(id);
    }
}
