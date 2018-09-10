package com.saigonbpo.ntb.Mapper;

import java.util.List;
import java.util.Map;

public interface UserMapper {



	Map<String, Object> findByUserName(String userName);

	int createUser(Map<String, Object> account);
	
	Map<String, Object> login(Map<String, Object> input);


}
