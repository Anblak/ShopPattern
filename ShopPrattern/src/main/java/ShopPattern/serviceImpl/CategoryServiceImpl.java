package ShopPattern.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ShopPattern.dao.CategoryDao;
import ShopPattern.entity.Category;
import ShopPattern.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDao categoryDao;

	@Override
	public void save(Category category) {

		categoryDao.save(category);

	}

	@Override
	public List<Category> findAll() {

		return categoryDao.findAll();
	}

	@Override
	public Category findOne(int id) {

		return categoryDao.findOne(id);
	}

	@Override
	public void delete(int id) {

		categoryDao.delete(id);

	}
}
