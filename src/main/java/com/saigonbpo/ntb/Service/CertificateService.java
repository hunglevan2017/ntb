package com.saigonbpo.ntb.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.saigonbpo.model.Sea_Thongtinthuyenvien;


public interface CertificateService {

	List<Map<String, Object>> sp_get_certificate(String thuyenvien_id);

	List<Map<String, Object>> SP_LOV_REMAINING_BOATMAN_CERT(int id);

	void add_certificate(Map<String, Object> condition);

	Map<String, Object> sp_get_certificate_by_id(int parseInt);


	
	



}
