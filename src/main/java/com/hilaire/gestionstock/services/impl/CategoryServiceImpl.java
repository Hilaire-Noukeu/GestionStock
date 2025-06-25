package com.hilaire.gestionstock.services.impl;

import com.hilaire.gestionstock.dto.CategoryDto;
import com.hilaire.gestionstock.exception.EntityNotFoundException;
import com.hilaire.gestionstock.exception.ErrorCodes;
import com.hilaire.gestionstock.exception.InvalidEntityException;
import com.hilaire.gestionstock.model.Category;
import com.hilaire.gestionstock.repository.CategoryRepository;
import com.hilaire.gestionstock.services.CategoryService;
import com.hilaire.gestionstock.validator.CategoryValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {


    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryDto save(CategoryDto categoryDto) {

        List<String> errors = CategoryValidator.validate(categoryDto);
        if(!errors.isEmpty()) {
            log.error("Category invalid",categoryDto);
            throw new InvalidEntityException("category invalid", ErrorCodes.CATEGORY_NOT_VALID,errors);
        }
            return CategoryDto.fromEntity(categoryRepository.save(CategoryDto.toEntity(categoryDto)));
    }

    @Override
    public CategoryDto findById(Integer id) {
        if(id == null) {
            log.error("Category id is null");
            return null;
        }

        Optional<Category> category = categoryRepository.findById(id);
        return Optional.of(CategoryDto.fromEntity(category.get())).orElseThrow(() -> new EntityNotFoundException("aucune category",ErrorCodes.CATEGORY_NOT_FOUND));
    }

    @Override
    public CategoryDto findByCodeCategory(String codeCategory) {
        if(!StringUtils.hasLength(codeCategory)) {
            log.error("CATEGORY code is null");
            return null;

        }
        Optional<Category> category = categoryRepository.findCategoryByCodeCategory(codeCategory);
        return Optional.of(CategoryDto.fromEntity(category.get())).orElseThrow(() -> new EntityNotFoundException("aucune category avec le code" + codeCategory + "na ete retrouve",ErrorCodes.CATEGORY_NOT_FOUND));

    }

    @Override
    public List<CategoryDto> findAll() {
        return categoryRepository.findAll().stream().map(CategoryDto::fromEntity).collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        if(id == null) {
            log.error("CATEGORY id is null");
            return ;
        }
        categoryRepository.deleteById(id);

    }

}
