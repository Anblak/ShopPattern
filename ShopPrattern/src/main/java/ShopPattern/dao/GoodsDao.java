package ShopPattern.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ShopPattern.entity.Goods;



public interface GoodsDao extends JpaRepository<Goods, Integer>{

}
