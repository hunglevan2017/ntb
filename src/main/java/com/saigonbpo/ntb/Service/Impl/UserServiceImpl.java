package com.saigonbpo.ntb.Service.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.saigonbpo.ntb.Mapper.UserMapper;
import com.saigonbpo.ntb.Service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	
//	@Autowired
//	@Resource(name="sqlSession_01")
//	private SqlSession session;
	
	
	@Autowired
	private UserMapper userMapper ;

	@Override
	public Map<String, Object> findByUserName(String UserName) {
		// TODO Auto-generated method stub
		return userMapper.findByUserName(UserName);
	}

	@Override
	public int createUser(Map<String, Object> account) {
		// TODO Auto-generated method stub
		return userMapper.createUser(account);
	}

	@Override
	public Map<String, Object> login(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return userMapper.login(input);
	}

	@Override
	public List<Map<String, Object>> sp_get_user() {
		// TODO Auto-generated method stub
		return userMapper.sp_get_user();
	}

	@Override
	public Map<String, Object> sp_get_user_by_id(int id) {
		// TODO Auto-generated method stub
		return userMapper.sp_get_user_by_id(id);
	}

	@Override
	public void add_user(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		userMapper.add_user(condition);
		condition.put("UserId", condition.get("id"));
		add_member(condition);
		
	}
	
	@Override
	public void add_member(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		userMapper.add_member(condition);
	}

	@Override
	public void edit_user(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		userMapper.edit_user(condition);
		
	}

	@Override
	public void delete_user(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		userMapper.delete_user(condition);
		
	}


	


	
	

}
