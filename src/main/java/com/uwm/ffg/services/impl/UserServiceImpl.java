package com.uwm.ffg.services.impl;

import com.uwm.ffg.dao.UserDao;
import com.uwm.ffg.domain.UserEntity;
import com.uwm.ffg.services.UserService;

/**
 * Service providing service methods to work with user data and entity.
 * 
 * @author Vivek Mishra
 */
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	/**
	 * Create user - persist to database
	 * 
	 * @param userEntity
	 * @return true if success
	 */
	public boolean createUser(UserEntity userEntity) {
		userDao.save(userEntity);
		return true;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
