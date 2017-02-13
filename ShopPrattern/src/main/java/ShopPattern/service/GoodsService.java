package ShopPattern.service;

import java.util.List;

import ShopPattern.entity.Goods;



public interface GoodsService {
	void save(Goods goods);
	List<Goods> findAll();
	Goods findOne(int id);
	void delete(int id);
}
