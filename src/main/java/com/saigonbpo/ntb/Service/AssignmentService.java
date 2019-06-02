package com.saigonbpo.ntb.Service;

import java.text.ParseException;
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

	void newToShip(Map<String, Object> condition) throws ParseException;

	void updateDieuDong(Map<String, Object> condition);

	List<Map<String, Comparable>> SP_DieuDong_Search(Map<String, Object> condition);

	List<Map<String, Object>> SP_Kinh_Nghiem_Lam_Viec(Map<String, Object> condition);

	void ProcessDeleteOnBoard(Map<String, Object> condition);

	


}
