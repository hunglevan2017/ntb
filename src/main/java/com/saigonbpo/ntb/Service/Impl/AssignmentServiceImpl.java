package com.saigonbpo.ntb.Service.Impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.saigonbpo.ntb.Mapper.AssignmentMapper;
import com.saigonbpo.ntb.Mapper.ThongTinDieuDongMapper;
import com.saigonbpo.ntb.Mapper.ThongTinGiaDinhMapper;
import com.saigonbpo.ntb.Mapper.ThongTinThuyenVienMapper;
import com.saigonbpo.ntb.Model.ThongTinDieuDong;
import com.saigonbpo.ntb.Model.ThongTinThuyenVien;
import com.saigonbpo.ntb.Service.AssignmentService;

@Service
@Transactional
public class AssignmentServiceImpl implements AssignmentService {

	@Autowired
	private AssignmentMapper assignmentMapper;
	
	@Autowired
	ThongTinDieuDongMapper thongTinDieuDongMapper;
	
	@Autowired
	ThongTinThuyenVienMapper thongTinThuyenVienMapper;

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
			//assignmentMapper.insertNewDieuDong(condition);
			
			SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
			int tauid = condition.get("tauid") == null ? null: Integer.parseInt( condition.get("tauid").toString());
			int thuyenvienid = Integer.parseInt( condition.get("thuyenvienid").toString()); 
			Date tungay = formatter1.parse(condition.get("tungay").toString());
			String ghichuon = condition.get("ghichuon") == null ? "": condition.get("ghichuon").toString();
			
			ThongTinDieuDong thongTinDieuDong = new ThongTinDieuDong();
			thongTinDieuDong.setTauid(tauid);
			thongTinDieuDong.setThuyenvienid(thuyenvienid);
			thongTinDieuDong.setTungay(tungay);
			thongTinDieuDong.setGhichuon(ghichuon);
			thongTinDieuDongMapper.insertSelective(thongTinDieuDong);
			
			//ThongTinThuyenVien thongtinthuyenvien = thongTinThuyenVienMapper.selectByPrimaryKey(thongTinDieuDong.getThuyenvienid());
			//thongtinthuyenvien.setSs(0);
			//thongtinthuyenvien.setTinhtrangdieudong(1);
			//thongTinThuyenVienMapper.updateByPrimaryKeySelective(thongtinthuyenvien);
		
			
			
			

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
			
			//assignmentMapper.updateTinhTrangDieuDong(condition);
			int thuyenvienid = Integer.parseInt( condition.get("thuyenvienid").toString()); 
			ThongTinThuyenVien thongtinthuyenvien = thongTinThuyenVienMapper.selectByPrimaryKey(thuyenvienid);
			thongtinthuyenvien.setSs(1);
			thongtinthuyenvien.setTinhtrangdieudong(0);
			thongTinThuyenVienMapper.updateByPrimaryKeySelective(thongtinthuyenvien);
			
			
		
			
			
			
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void newToShip(Map<String, Object> condition) throws ParseException {
		// TODO Auto-generated method stub
		

		SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
		int tauid = condition.get("tauid") == null ? null: Integer.parseInt( condition.get("tauid").toString());
		int thuyenvienid = Integer.parseInt( condition.get("thuyenvienid").toString()); 
		Date tungay = formatter1.parse(condition.get("tungay").toString());
		String ghichuon = condition.get("ghichuon") == null ? "": condition.get("ghichuon").toString();


		
		//assignmentMapper.insertNewDieuDong(condition);
		//assignmentMapper.updateTinhTrangDieuDong(condition);
		
		ThongTinDieuDong thongTinDieuDong = new ThongTinDieuDong();
		thongTinDieuDong.setTauid(tauid);
		thongTinDieuDong.setThuyenvienid(thuyenvienid);
		thongTinDieuDong.setTungay(tungay);
		thongTinDieuDong.setGhichuon(ghichuon);
		thongTinDieuDongMapper.insertSelective(thongTinDieuDong);
		
		ThongTinThuyenVien thongtinthuyenvien = thongTinThuyenVienMapper.selectByPrimaryKey(thongTinDieuDong.getThuyenvienid());
		thongtinthuyenvien.setSs(0);
		thongtinthuyenvien.setTinhtrangdieudong(1);
		thongTinThuyenVienMapper.updateByPrimaryKeySelective(thongtinthuyenvien);
	
	}

	@Override
	public void updateDieuDong(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		assignmentMapper.updateDieuDong(condition);
		
	}

	@Override
	public List<Map<String, Comparable>> SP_DieuDong_Search(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		return assignmentMapper.SP_DieuDong_Search(condition);
	}

	@Override
	public List<Map<String, Object>> SP_Kinh_Nghiem_Lam_Viec(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		return assignmentMapper.SP_Kinh_Nghiem_Lam_Viec(condition);
	}

	@Override
	public void ProcessDeleteOnBoard(Map<String, Object> condition) {
		try {
			assignmentMapper.deleteDieuDong(condition);
			assignmentMapper.updateTinhTrangDieuDong(condition);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	

}
