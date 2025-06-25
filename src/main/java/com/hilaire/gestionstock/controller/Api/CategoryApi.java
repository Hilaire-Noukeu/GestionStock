package com.hilaire.gestionstock.controller.Api;

import com.hilaire.gestionstock.dto.ArticleDto;
import com.hilaire.gestionstock.dto.CategoryDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.hilaire.gestionstock.utils.Constants.APP_ROOT;

public interface CategoryApi {

    @PostMapping(value = APP_ROOT + "/category/create", consumes = MediaType.APPLICATION_JSON_VALUE,produces  = MediaType.APPLICATION_JSON_VALUE)
    CategoryDto save(@RequestBody CategoryDto categoryDto) ;

    @GetMapping(value = APP_ROOT + "/category/{idCategory}", produces = MediaType.APPLICATION_JSON_VALUE )
    CategoryDto findById( @PathVariable("idCategory") Integer id);

    @GetMapping(value = APP_ROOT + "/categories/{codeCategory}", produces = MediaType.APPLICATION_JSON_VALUE )
    CategoryDto findByCodeArticle( @PathVariable("codeCategory") String codeCategory);

    @GetMapping(value = APP_ROOT + "/categories/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<CategoryDto> finAll();

    @DeleteMapping(value = APP_ROOT + "/categories/delete/{idCategory}")
    void delete( @PathVariable("idCategory") Integer id);
}
