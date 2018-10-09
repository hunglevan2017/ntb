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
import com.saigonbpo.ntb.Service.AppService;

@Service
@Transactional
public class AppServiceImpl implements AppService {

	@Autowired
	private AppMapper appMapper;

	@Override
	public List<Map<String, Object>> getEmployees() {
		// TODO Auto-generated method stub

		List<Map<String, Object>> Result = new ArrayList<>();

		Map<String, Object> temp = new HashMap<>();
		temp.put("ID", "E01");
		temp.put("Name", "Smith");
		temp.put("Role", "Clerk");

		Map<String, Object> temp1 = new HashMap<>();
		temp1.put("ID", "E02");
		temp1.put("Name", "Salesman");
		temp1.put("Role", "Salesman");

		Map<String, Object> temp2 = new HashMap<>();
		temp2.put("ID", "E03");
		temp2.put("Name", "Jones");
		temp2.put("Role", "Manager");

		Result.add(temp);
		Result.add(temp1);
		Result.add(temp2);

		return appMapper.selectAll();
	}

	@Override
	public Map<String, Object> get_SP_Get_statistical_DashBoard(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return appMapper.get_SP_Get_statistical_DashBoard();
	}

	@Override
	public List<Map<String, Object>> sp_statistic_department(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return appMapper.sp_statistic_department();
	}

	@Override
	public List<Map<String, Object>> sp_statistic_ship(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return appMapper.sp_statistic_ship();
	}

	@Override
	public List<Map<String, Object>> getListOfBoat(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return appMapper.getListOfBoat(input);
	}

	@Override
	public List<Map<String, Object>> sp_sea_get_profile_user(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return appMapper.sp_sea_get_profile_user(input);
	}

	@Override
	public List<Map<String, Object>> SP_LOV_GET(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return appMapper.SP_LOV_GET(input);
	}

	@Override
	public Map<String, Object> sp_get_info_crew(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return appMapper.sp_get_info_crew(input);
	}

	@Override
	public List<Map<String, Object>> getListOfBoat_v3(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return appMapper.getListOfBoat_v3(input);
	}

	@Override
	public void updateProfile(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		appMapper.updateProfile(condition);

	}

	@Override
	public List<Map<String, Object>> sp_get_thongtingiadinh(String thuyenvien_id) {
		// TODO Auto-generated method stub
		return appMapper.sp_get_thongtingiadinh(thuyenvien_id);
	}

	@Override
	public void insertProfile(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		appMapper.insertProfile(condition);

	}

	@Override
	public void insertTabFile(Map<String, Object> tab_file) {
		// TODO Auto-generated method stub
		appMapper.insertTabFile(tab_file);

	}

	@Override
	public void addInformation(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		appMapper.addInformation(condition);

	}

	@Override
	public Map<String, Object> sp_get_thongtingiadinh_by_id(int id) {
		// TODO Auto-generated method stub
		return appMapper.sp_get_thongtingiadinh_by_id(id);
	}

	@Override
	public void editInformation(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		appMapper.editInformation(condition);

	}

	@Override
	public void deleteInformation(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		appMapper.deleteInformation(condition);

	}

	// Trinh Do Chuyen Mon
	@Override
	public List<Map<String, Object>> sp_get_trinhdochuyenmon(String thuyenvien_id) {
		// TODO Auto-generated method stub
		return appMapper.sp_get_trinhdochuyenmon(thuyenvien_id);
	}

	@Override
	public Map<String, Object> sp_get_trinhdochuyenmon_by_id(int id) {
		// TODO Auto-generated method stub
		return appMapper.sp_get_trinhdochuyenmon_by_id(id);
	}

	@Override
	public void addTrinhDoChuyenMon(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		appMapper.addTrinhDoChuyenMon(condition);
	}

	@Override
	public void editTrinhDoChuyenMon(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		appMapper.editTrinhDoChuyenMon(condition);
	}

	@Override
	public void deleteTrinhDoChuyenMon(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		appMapper.deleteTrinhDoChuyenMon(condition);
	}

	@Override
	public List<Map<String, Object>> sp_get_trinhdongoaingu(String thuyenvien_id) {
		// TODO Auto-generated method stub
		return appMapper.sp_get_trinhdongoaingu(thuyenvien_id);
	}

	@Override
	public Map<String, Object> sp_get_TrinhDoNgoaiNgu_by_id(int id) {
		// TODO Auto-generated method stub
		return appMapper.sp_get_TrinhDoNgoaiNgu_by_id(id);
	}

	@Override
	public void add_trinhdongoaingu(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		appMapper.add_trinhdongoaingu(condition);

	}

	@Override
	public void edit_trinhdongoaingu(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		appMapper.edit_trinhdongoaingu(condition);

	}

	@Override
	public void delete_trinhdongoaingu(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		appMapper.delete_trinhdongoaingu(condition);

	}

	@Override
	public void delete_trinhdovitinh(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		appMapper.delete_trinhdovitinh(condition);

	}

	@Override
	public Map<String, Object> sp_get_trinhdovitinh_by_id(int parseInt) {
		// TODO Auto-generated method stub
		return appMapper.sp_get_trinhdovitinh_by_id(parseInt);
	}

	@Override
	public void edit_trinhdovitinh(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		appMapper.edit_trinhdovitinh(condition);

	}

	@Override
	public void add_trinhdovitinh(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		appMapper.add_trinhdovitinh(condition);

	}

	@Override
	public List<Map<String, Object>> sp_get_trinhdovitinh(String thuyenvien_id) {
		// TODO Auto-generated method stub
		return appMapper.sp_get_trinhdovitinh(thuyenvien_id);
	}

	@Override
	public List<Map<String, Object>> getMainCertificateCrew(Map<String, Object> filter) {
		// TODO Auto-generated method stub
		return appMapper.getMainCertificateCrew(filter);
	}

	@Override
	public List<Map<String, Object>> getMainCertificateCrewII(Map<String, Object> filter) {
		// TODO Auto-generated method stub
		return appMapper.getMainCertificateCrewII(filter);
	}

	@Override
	public List<Map<String, Object>> queryKinhNghiemLamviec(String thuyenvien_id) {
		// TODO Auto-generated method stub
		return appMapper.queryKinhNghiemLamviec(thuyenvien_id);
	}

	@Override
	public List<Map<String, Object>> queryKinhNghiemLamviecOther(String thuyenvien_id) {
		// TODO Auto-generated method stub
		return appMapper.queryKinhNghiemLamviecOther(thuyenvien_id);
	}

	@Override
	public Map<String, Object> sp_get_Experience_by_id(int id) {
		// TODO Auto-generated method stub
		return appMapper.sp_get_Experience_by_id(id);
	}

	@Override
	public void add_experience(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		 appMapper.add_experience(condition);
	}

	@Override
	public void edit_experience(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		 appMapper.edit_experience(condition);
	}

	@Override
	public void delete_experience(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		 appMapper.delete_experience(condition);
		
	}

	

}
