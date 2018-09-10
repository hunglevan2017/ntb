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
	


	
	

}
