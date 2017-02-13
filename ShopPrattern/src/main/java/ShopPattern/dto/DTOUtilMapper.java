package ShopPattern.dto;

import java.util.ArrayList;
import java.util.List;

import ShopPattern.entity.Catalog;
import ShopPattern.entity.Category;



public class DTOUtilMapper {
	
	public static List<CatalogDTO> catalogToCatalogDTO(List<Catalog>catalogs){		
		List<CatalogDTO> catalogDTOs=new ArrayList<CatalogDTO>();
		
		for (Catalog catalog : catalogs) {
			
			CatalogDTO catalogDTO=new CatalogDTO();
			catalogDTO.setName(catalog.getName());
			catalogDTO.setId(catalog.getId());
		
			catalogDTOs.add(catalogDTO);
			
		}
		return catalogDTOs;
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
