package com.jadson.core.dao;

import org.springframework.data.repository.CrudRepository;

import com.jadson.core.domain.UserInfo;

public interface UserInfoDao extends CrudRepository<UserInfo, Integer> {
	
	public UserInfo findByUserName(String userName);

}
