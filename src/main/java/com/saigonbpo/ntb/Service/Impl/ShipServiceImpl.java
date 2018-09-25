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

import com.saigonbpo.ntb.Mapper.ShipMapper;
import com.saigonbpo.ntb.Service.AppService;
import com.saigonbpo.ntb.Service.CertificateService;
import com.saigonbpo.ntb.Service.ShipService;

@Service
@Transactional
public class ShipServiceImpl implements ShipService {

	@Autowired
	private ShipMapper shipMapper;

	@Override
	public List<Map<String, Object>> sp_get_ship() {
		// TODO Auto-generated method stub
		return shipMapper.sp_get_ship();
	}

	@Override
	public void add_ship(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		shipMapper.add_ship(condition);
	}

	@Override
	public Map<String, Object> sp_get_ship_by_id(int id) {
		// TODO Auto-generated method stub
		return shipMapper.sp_get_ship_by_id(id);
	}

	@Override
	public void edit_ship(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		shipMapper.edit_ship(condition);
	}

	@Override
	public void delete_ship(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		shipMapper.delete_ship(condition);
	}


}
