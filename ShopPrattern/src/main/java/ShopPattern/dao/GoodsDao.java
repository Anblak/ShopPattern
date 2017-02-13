package ShopPattern.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ShopPattern.entity.Goods;



public interface GoodsDao extends JpaRepository<Goods, Integer>{
    @Query("select b from Goods b left join fetch b.goodsImages where b.id =:id")
    Goods bookWithimages(@Param("id") int id);
}
