package com.shopPattern.dto;

import java.util.ArrayList;
import java.util.List;

import com.shopPattern.entity.Book;
import com.shopPattern.entity.Catalog;
import com.shopPattern.entity.Category;



public class DtoUtilMapper {
	
	public static List<CatalogDTO> catalogToCatalogDTO(List<Catalog>catalogs){		
		List<CatalogDTO> catalogDTOs=new ArrayList<CatalogDTO>();
		
		for (Catalog catalog : catalogs) {
			
			catalogDTOs.add(new CatalogDTO(catalog.getId(),catalog.getName()));
			
		}
		return catalogDTOs;
	}
	
	public static List<BookDTO> booksToBooksDTO(List<Book> books) {

		List<BookDTO> bookDTOs = new ArrayList<BookDTO>();

		for (Book book : books) {
			BookDTO bookDTO = new BookDTO();

			bookDTO.setTitle(book.getTitle());
			bookDTO.setPages(book.getPages());

			bookDTOs.add(bookDTO);

		}

		return bookDTOs;

	}
	
	public static List<CategoryDTO> categoryToCategoryDTO(List<Category>categories){		
		List<CategoryDTO> categoryDTOs=new ArrayList<CategoryDTO>();
		
		for (Category category : categories) {
			
			CategoryDTO categoryDTO=new CategoryDTO();
			categoryDTO.setName(category.getName());
			categoryDTO.setId(category.getId());
			categoryDTO.setCatalogs(category.getCatalogs());
			categoryDTOs.add(categoryDTO);
			
		}
		return categoryDTOs;
	}
}
