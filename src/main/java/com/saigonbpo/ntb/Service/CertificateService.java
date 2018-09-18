package com.saigonbpo.ntb.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.saigonbpo.model.Sea_Thongtinthuyenvien;


public interface CertificateService {

	List<Map<String, Object>> sp_get_certificate(String thuyenvien_id);
	
	



}
