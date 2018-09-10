package com.saigonbpo.ntb.Service.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.saigonbpo.model.Sea_Thongtinthuyenvien;
import com.saigonbpo.ntb.Mapper.AppMapper;
import com.saigonbpo.ntb.Service.AppService;

@Service
@Transactional
public class AppServiceImpl implements AppService {

	@Autowired
	private AppMapper appMapper ;
	
	@Override
	public List<Map<String, Object>> getEmployees() {
		// TODO Auto-generated method stub
		
		List<Map<String,Object>> Result = new ArrayList<>();
		
		Map<String,Object> temp = new HashMap<>();
		temp.put("ID", "E01");
		temp.put("Name", "Smith");
		temp.put("Role", "Clerk");
		
		Map<String,Object> temp1 = new HashMap<>();
		temp1.put("ID", "E02");
		temp1.put("Name", "Salesman");
		temp1.put("Role", "Salesman");
		
		
		Map<String,Object> temp2 = new HashMap<>();
		temp2.put("ID", "E03");
		temp2.put("Name", "Jones");
		temp2.put("Role", "Manager");
		
	
		Result.add(temp);
		Result.add(temp1);
		Result.add(temp2);

		
		return appMapper.selectAll();
	}

	@Override
	public Map<String, Object> get_SP_Get_statistical_DashBoard(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return  appMapper.get_SP_Get_statistical_DashBoard();
	}

	@Override
	public List<Map<String, Object>> sp_statistic_department(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return  appMapper.sp_statistic_department();
	}

	@Override
	public List<Map<String, Object>> sp_statistic_ship(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return  appMapper.sp_statistic_ship();
	}

	@Override
	public List<Map<String, Object>> getListOfBoat(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return  appMapper.getListOfBoat(input);
	}

	@Override
	public List<Map<String, Object>> sp_sea_get_profile_user(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return  appMapper.sp_sea_get_profile_user(input);
	}

	@Override
	public List<Map<String, Object>> SP_LOV_GET(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return  appMapper.SP_LOV_GET(input);
	}

	@Override
	public Map<String, Object> sp_get_info_crew(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return  appMapper.sp_get_info_crew(input);
	}

	@Override
	public List<Map<String, Object>> getListOfBoat_v3(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return appMapper.getListOfBoat_v3(input);
	}

	@Override
	public void updateProfile(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		 appMapper.updateProfile(condition);
		
	}

	@Override
	public List<Map<String, Object>> sp_get_thongtingiadinh(String thuyenvien_id) {
		// TODO Auto-generated method stub
		return appMapper.sp_get_thongtingiadinh(thuyenvien_id);
	}

	@Override
	public void insertProfile(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		 appMapper.insertProfile(condition);
		
	}

	@Override
	public void insertTabFile(Map<String, Object> tab_file) {
		// TODO Auto-generated method stub
		 appMapper.insertTabFile(tab_file);
		
	}


}
