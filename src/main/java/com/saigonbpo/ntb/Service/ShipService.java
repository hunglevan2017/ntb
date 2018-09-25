package com.saigonbpo.ntb.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.saigonbpo.model.Sea_Thongtinthuyenvien;


public interface ShipService {

	

	List<Map<String, Object>> sp_get_ship();

	void add_ship(Map<String, Object> condition);

	Map<String, Object> sp_get_ship_by_id(int id);

	void edit_ship(Map<String, Object> condition);

	void delete_ship(Map<String, Object> condition);


}
