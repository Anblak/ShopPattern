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
	
	@RequestMapping(value="/saveCategory",method=RequestMethod.POST)
	public void saveCatagory(@RequestBody Category category){
		
		categoryService.save(category);
	}
	@RequestMapping(value="/saveCatalog",method=RequestMethod.POST)
	public void saveCatalog(@RequestBody Catalog catalog){
		
		catalogService.save(catalog);
	}
	@RequestMapping(value="/Categories",method=RequestMethod.POST)
	public List<CategoryDTO> loadCatagory(){
		
		return DTOUtilMapper.categoryToCategoryDTO(categoryService.findAll());
	}
	@RequestMapping(value="/Catalogs",method=RequestMethod.POST)
	public List<CatalogDTO> loadCatalogs(){
		
		return DTOUtilMapper.catalogToCatalogDTO(catalogService.findAll());
	}

}
