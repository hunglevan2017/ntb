package com.saigonbpo.ntb.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.saigonbpo.model.Sea_Thongtinthuyenvien;


public interface AppService {
	
	public List<Map<String,Object>> getEmployees();

	public Map<String, Object> get_SP_Get_statistical_DashBoard(Map<String, Object> input);

	public List<Map<String, Object>> sp_statistic_department(Map<String, Object> input);

	public List<Map<String, Object>> sp_statistic_ship(Map<String, Object> input);

	public List<Map<String, Object>> getListOfBoat(Map<String, Object> input);

	public List<Map<String, Object>> sp_sea_get_profile_user(Map<String, Object> input);

	public List<Map<String, Object>> SP_LOV_GET(Map<String, Object> input);

	public Map<String, Object> sp_get_info_crew(Map<String, Object> input);

	public List<Map<String, Object>> getListOfBoat_v3(Map<String, Object> input);

	public void updateProfile(Map<String, Object> condition);

	public List<Map<String, Object>> sp_get_thongtingiadinh(String thuyenvien_id);

	public void insertProfile(Map<String, Object> condition);

	public void insertTabFile(Map<String, Object> tab_file);

	public void addInformation(Map<String, Object> condition);

	public Map<String, Object> sp_get_thongtingiadinh_by_id(int id);

	public void editInformation(Map<String, Object> condition);

	public void deleteInformation(Map<String, Object> condition);
	
	

	public List<Map<String, Object>> sp_get_trinhdochuyenmon(String thuyenvien_id);

	public Map<String, Object> sp_get_trinhdochuyenmon_by_id(int id);

	public void addTrinhDoChuyenMon(Map<String, Object> condition);

	public void editTrinhDoChuyenMon(Map<String, Object> condition);

	public void deleteTrinhDoChuyenMon(Map<String, Object> condition);
	
	
	public List<Map<String, Object>> sp_get_trinhdongoaingu(String thuyenvien_id);

	public Map<String, Object> sp_get_TrinhDoNgoaiNgu_by_id(int id);

	public void add_trinhdongoaingu(Map<String, Object> condition);

	public void edit_trinhdongoaingu(Map<String, Object> condition);

	public void delete_trinhdongoaingu(Map<String, Object> condition);



	

	public void delete_trinhdovitinh(Map<String, Object> condition);

	public Map<String, Object> sp_get_trinhdovitinh_by_id(int parseInt);

	public void edit_trinhdovitinh(Map<String, Object> condition);

	public void add_trinhdovitinh(Map<String, Object> condition);

	public List<Map<String, Object>> sp_get_trinhdovitinh(String thuyenvien_id);

	public List<Map<String, Object>> getMainCertificateCrew(Map<String, Object> filter);

	public List<Map<String, Object>> getMainCertificateCrewII(Map<String, Object> input);

	public List<Map<String, Object>> queryKinhNghiemLamviec(String thuyenvien_id);

	public List<Map<String, Object>> queryKinhNghiemLamviecOther(String thuyenvien_id);

	public Map<String, Object> sp_get_Experience_by_id(int id);

	public void add_experience(Map<String, Object> condition);

	public void edit_experience(Map<String, Object> condition);

	public void delete_experience(Map<String, Object> condition);

	public List<Map<String, Object>> sp_tab_department();

	public List<Map<String, Object>> SP_TAB_LOV(String code);





}
