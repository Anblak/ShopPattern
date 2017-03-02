package com.shopPattern.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.shopPattern.dao.UserDao;
import com.shopPattern.entity.Role;
import com.shopPattern.entity.User;
import com.shopPattern.service.UserService;



@Service("userDetailsService")
public class UserServiceImpl implements UserService, UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Override
	public void save(User user) {

		user.setRole(Role.ROLE_USER);
		user.setPassword(encoder.encode(user.getPassword()));
		userDao.save(user);

	}

	@Override
	public List<User> findAll() {

		return userDao.findAll();
	}

	@Override
	public User findOne(int id) {

		return userDao.findOne(id);
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}

	@Override
	public void update(User user) {
		userDao.save(user);
	}

	@Override
	public User findByUUID(String uuid) {

		return userDao.findByUUID(uuid);
	}

	@Override
	public void updatePassword(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		userDao.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

		return userDao.findByName(name);
	}

}
