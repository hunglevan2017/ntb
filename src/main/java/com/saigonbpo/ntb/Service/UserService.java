package com.saigonbpo.ntb.Service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface UserService {
	
	Map<String,Object> findByUserName(String userName);

	int createUser(Map<String, Object> account);
	public Map<String, Object> login(Map<String, Object> input);
}
