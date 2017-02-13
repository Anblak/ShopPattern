package ShopPattern.service;

import java.util.List;

import ShopPattern.entity.User;



public interface UserService {
	void save(User user);

	List<User> findAll();

	User findOne(int id);

	void delete(int id);

	void update(User user);


	User findByUUID(String uuid);

	void updatePassword(User user);
}
