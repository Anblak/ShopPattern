package ShopPattern.service;

import java.util.List;

import ShopPattern.entity.Buy;


public interface BuyService {
	void save(Buy buy);
	List<Buy> findAll();
	Buy findOne(int id);
	void delete(int id);
}
