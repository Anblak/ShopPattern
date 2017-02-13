package ShopPattern.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ShopPattern.dao.CatalogDao;
import ShopPattern.entity.Catalog;
import ShopPattern.service.CatalogService;



@Service
public class CatalogServiceImpl implements CatalogService {
	
	@Autowired
	private  CatalogDao catalogDao;

	@Override
	public void save(Catalog catalog) {

		catalogDao.save(catalog);

	}

	@Override
	public List<Catalog> findAll() {

		return catalogDao.findAll();
	}

	@Override
	public Catalog findOne(int id) {

		return catalogDao.findOne(id);
	}

	@Override
	public void delete(int id) {

		catalogDao.delete(id);

	}
}
