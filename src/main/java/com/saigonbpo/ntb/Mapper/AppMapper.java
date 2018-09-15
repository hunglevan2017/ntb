package com.saigonbpo.ntb.Mapper;

import java.util.List;
import java.util.Map;

import com.saigonbpo.model.Sea_Thongtinthuyenvien;

public interface AppMapper {

	List<Map<String, Object>> selectAll();

	Map<String, Object> get_SP_Get_statistical_DashBoard();

	List<Map<String, Object>> sp_statistic_department();

	List<Map<String, Object>> sp_statistic_ship();

	List<Map<String, Object>> getListOfBoat(Map<String, Object> input);

	List<Map<String, Object>> sp_sea_get_profile_user(Map<String, Object> input);

	List<Map<String, Object>> SP_LOV_GET(Map<String, Object> input);

	Map<String, Object> sp_get_info_crew(Map<String, Object> input);

	List<Map<String, Object>> getListOfBoat_v3(Map<String, Object> input);

	void updateProfile(Map<String, Object> condition);

	List<Map<String, Object>> sp_get_thongtingiadinh(String thuyenvien_id);

	void insertProfile(Map<String, Object> condition);

	void insertTabFile(Map<String, Object> tab_file);

	void addInformation(Map<String, Object> condition);

	Map<String,Object> sp_get_thongtingiadinh_by_id(int id);

	void editInformation(Map<String, Object> condition);

	void deleteInformation(Map<String, Object> condition);


}
