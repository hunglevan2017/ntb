package com.saigonbpo.ntb.Service.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.impl.client.AIMDBackoffManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.saigonbpo.model.Sea_Thongtinthuyenvien;
import com.saigonbpo.ntb.Mapper.AppMapper;
import com.saigonbpo.ntb.Mapper.AssignmentMapper;
import com.saigonbpo.ntb.Service.AppService;
import com.saigonbpo.ntb.Service.AssignmentService;

@Service
@Transactional
public class AssignmentServiceImpl implements AssignmentService {

	@Autowired
	private AssignmentMapper assignmentMapper;

	@Override
	public List<Map<String, Object>> getShips() {
		// TODO Auto-generated method stub
		return assignmentMapper.getShips();
	}

	@Override
	public List<Map<String, Object>> loadCrewOnShip(String tauid) {
		// TODO Auto-generated method stub
		return assignmentMapper.loadCrewOnShip(tauid);
	}

	@Override
	public List<Map<String, Object>> loadTVDuTru(String tauid) {
		// TODO Auto-generated method stub
		return assignmentMapper.loadTVDuTru(tauid);
	}

	@Override
	public Map<String, Object> getChucDanh(String thuyenvienid) {
		// TODO Auto-generated method stub
		return assignmentMapper.getChucDanh(thuyenvienid);
	}

	@Override
	public void ProcessTranferShip(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		try {
			assignmentMapper.updateOldDieuDong(condition);
			assignmentMapper.insertNewDieuDong(condition);
			//assignmentMapper.updateTinhTrangDieuDong(condition);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Map<String, Object> getDieuDong(String thuyenvienid) {
		// TODO Auto-generated method stub
		return assignmentMapper.getDieuDong(thuyenvienid);
	}

	@Override
	public void ProcessLeaveShip(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		try {
			assignmentMapper.updateLeaveShip(condition);
			//assignmentMapper.insertNewDieuDong(condition);
			assignmentMapper.updateTinhTrangDieuDong(condition);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void newToShip(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		assignmentMapper.insertNewDieuDong(condition);
		assignmentMapper.updateTinhTrangDieuDong(condition);
	}


	

}
