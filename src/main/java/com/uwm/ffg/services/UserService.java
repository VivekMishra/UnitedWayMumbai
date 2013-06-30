package com.uwm.ffg.services;

import com.uwm.ffg.domain.UserEntity;

/**
 * Service providing service methods to work with user data and entity.
 * 
 * @author Vivek Mishra
 */
public interface UserService {

	/**
	 * Create user - persist to database
	 * 
	 * @param userEntity
	 * @return true if success
	 */
	boolean createUser(UserEntity userEntity);
}
