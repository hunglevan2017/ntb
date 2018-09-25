package com.saigonbpo.ntb.Mapper;

import java.util.List;
import java.util.Map;

import com.saigonbpo.model.Sea_Thongtinthuyenvien;

public interface ShipMapper {


	List<Map<String, Object>> sp_get_ship();
	void delete_ship(Map<String, Object> condition);
	void edit_ship(Map<String, Object> condition);
	Map<String, Object> sp_get_ship_by_id(int id);
	void add_ship(Map<String, Object> condition);



	




}
