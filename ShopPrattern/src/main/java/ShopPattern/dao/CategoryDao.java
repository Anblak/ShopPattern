package ShopPattern.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import ShopPattern.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Integer>{

}
