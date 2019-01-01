package com.saigonbpo.ntb.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {



	Map<String, Object> findByUserName(String userName);

	int createUser(Map<String, Object> account);
	
	Map<String, Object> login(Map<String, Object> input);

	List<Map<String, Object>> sp_get_user();

	Map<String, Object> sp_get_user_by_id(int id);

	void add_user(Map<String, Object> condition);

	void edit_user(Map<String, Object> condition);

	void delete_user(Map<String, Object> condition);

	void add_member(Map<String, Object> condition);

	void updateSS(Map<String, Object> condition);


}
