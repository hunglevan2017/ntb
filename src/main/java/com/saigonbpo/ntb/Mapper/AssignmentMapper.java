package com.saigonbpo.ntb.Mapper;

import java.util.List;
import java.util.Map;

import com.saigonbpo.model.Sea_Thongtinthuyenvien;

public interface AssignmentMapper {

	List<Map<String, Object>> getShips();

	List<Map<String, Object>> loadCrewOnShip(String tauid);

	List<Map<String, Object>> loadTVDuTru(String tauid);

	Map<String, Object> getChucDanh(String thuyenvienid);

	void updateOldDieuDong(Map<String, Object> condition);

	void insertNewDieuDong(Map<String, Object> condition);

	void updateTinhTrangDieuDong(Map<String, Object> condition);

	Map<String, Object> getDieuDong(String thuyenvienid);

	void updateLeaveShip(Map<String, Object> condition);

	void updateDieuDong(Map<String, Object> condition);


}
