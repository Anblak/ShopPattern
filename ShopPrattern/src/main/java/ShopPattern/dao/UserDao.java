package ShopPattern.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ShopPattern.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
