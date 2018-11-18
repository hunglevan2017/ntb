package com.saigonbpo.ntb.Mapper;

import java.util.List;
import java.util.Map;

import com.saigonbpo.model.Sea_Thongtinthuyenvien;

public interface CertificateMapper {

	List<Map<String, Object>> sp_get_certificate(String thuyenvien_id);
	List<Map<String, Object>> SP_LOV_REMAINING_BOATMAN_CERT(int id);
	Map<String, Object> sp_get_certificate_by_id(int parseInt);
	void add_certificate(Map<String, Object> condition);
	void delete_certificate(Map<String, Object> condition);
	void edit_certificate(Map<String, Object> condition);
	
	
	List<Map<String, Object>> SP_Boatman_Position_Search(String thuyenvien_id);
	Map<String, Object> sp_get_Rank_by_id(int id);
	void delete_rank(Map<String, Object> condition);
	void edit_rank(Map<String, Object> condition);
	void add_rank(Map<String, Object> condition);
	List<Map<String, Object>> sp_statistic_seaman();



	




}
