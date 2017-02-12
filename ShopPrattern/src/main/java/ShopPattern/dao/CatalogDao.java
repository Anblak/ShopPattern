package ShopPattern.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ShopPattern.entity.Buy;

public interface CatalogDao extends JpaRepository<Buy, Integer> {
}
