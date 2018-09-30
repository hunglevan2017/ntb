package com.saigonbpo.ntb.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.saigonbpo.model.Sea_Thongtinthuyenvien;


public interface AssignmentService {

	List<Map<String, Object>> getShips();

	List<Map<String, Object>> loadCrewOnShip(String tauid);

	


}
