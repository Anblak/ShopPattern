package ShopPattern.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ShopPattern.entity.Catalog;

public interface CatalogDao extends JpaRepository<Catalog, Integer> {
}
