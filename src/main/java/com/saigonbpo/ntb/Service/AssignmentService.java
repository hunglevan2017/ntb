package com.saigonbpo.ntb.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.saigonbpo.model.Sea_Thongtinthuyenvien;


public interface AssignmentService {

	List<Map<String, Object>> getShips();

	List<Map<String, Object>> loadCrewOnShip(String tauid);

	List<Map<String, Object>> loadTVDuTru(String tauid);

	Map<String, Object> getChucDanh(String thuyenvienid);

	void ProcessTranferShip(Map<String, Object> condition);

	Map<String, Object> getDieuDong(String thuyenvienid);

	void ProcessLeaveShip(Map<String, Object> condition);

	void newToShip(Map<String, Object> condition);

	void updateDieuDong(Map<String, Object> condition);

	


}
