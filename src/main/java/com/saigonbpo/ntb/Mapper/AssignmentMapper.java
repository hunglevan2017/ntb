package com.saigonbpo.ntb.Mapper;

import java.util.List;
import java.util.Map;

import com.saigonbpo.model.Sea_Thongtinthuyenvien;

public interface AssignmentMapper {

	List<Map<String, Object>> getShips();

	List<Map<String, Object>> loadCrewOnShip(String tauid);


}
