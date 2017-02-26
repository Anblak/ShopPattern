package com.shopPattern.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopPattern.dto.CatalogDTO;
import com.shopPattern.dto.CategoryDTO;
import com.shopPattern.dto.DTOUtilMapper;
import com.shopPattern.entity.Catalog;
import com.shopPattern.entity.Category;
import com.shopPattern.service.CatalogService;
import com.shopPattern.service.CategoryService;

@RestController
public class CategoryAndCatalogController {
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private CatalogService catalogService;
	
	
	
	
//	------------------------------save-------------------------------------
	
	@RequestMapping(value="/saveCategory",method=RequestMethod.POST)
	public List<CategoryDTO> saveCatagory(@RequestBody Category category){
		
		categoryService.save(category);
		
		return DTOUtilMapper.categoryToCategoryDTO(categoryService.findAll());
	}
	
	@RequestMapping(value="/saveCatalog",method=RequestMethod.POST)
	public List<CatalogDTO> saveCatalog(@RequestBody Catalog catalog){
		
		catalogService.save(catalog);
		
		return DTOUtilMapper.catalogToCatalogDTO(catalogService.findAll());
	}
	
// ----------------------------load-----------------------------------------
	
	@RequestMapping(value="/loadCategories",method=RequestMethod.POST)
	public List<CategoryDTO> loadCatagory(){
		
		return DTOUtilMapper.categoryToCategoryDTO(categoryService.findAll());
	}
	
	@RequestMapping(value="/loadCatalogs",method=RequestMethod.POST)
	public List<CatalogDTO> loadCatalogs(){
		
		return DTOUtilMapper.catalogToCatalogDTO(catalogService.findAll());
	}
	
//------------------------------------delete--------------------------------
	
    @RequestMapping(value = "/deleteCategory", method = RequestMethod.POST)
    public List<CategoryDTO> deleteCategory(@RequestBody String index) {

        categoryService.delete(Integer.parseInt(index));

        return DTOUtilMapper.categoryToCategoryDTO(categoryService.findAll());

    }
    
    @RequestMapping(value = "/deleteCatalog", method = RequestMethod.POST)
    public List<CatalogDTO> deleteCatalog(@RequestBody String index) {

        catalogService.delete(Integer.parseInt(index));

        return DTOUtilMapper.catalogToCatalogDTO(catalogService.findAll());

    }

}
