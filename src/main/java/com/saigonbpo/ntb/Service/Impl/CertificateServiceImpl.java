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
import com.saigonbpo.ntb.Mapper.CertificateMapper;
import com.saigonbpo.ntb.Service.AppService;
import com.saigonbpo.ntb.Service.CertificateService;

@Service
@Transactional
public class CertificateServiceImpl implements CertificateService {

	@Autowired
	private CertificateMapper certificateMapper;

	@Override
	public List<Map<String, Object>> sp_get_certificate(String thuyenvien_id) {
		// TODO Auto-generated method stub
		return certificateMapper.sp_get_certificate(thuyenvien_id);
	}

	@Override
	public List<Map<String, Object>> SP_LOV_REMAINING_BOATMAN_CERT(int id) {
		// TODO Auto-generated method stub
		return certificateMapper.SP_LOV_REMAINING_BOATMAN_CERT(id);
	}

	@Override
	public void add_certificate(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		certificateMapper.add_certificate(condition);
	}

	@Override
	public Map<String, Object> sp_get_certificate_by_id(int parseInt) {
		// TODO Auto-generated method stub
		return certificateMapper.sp_get_trinhdovitinh_by_id(parseInt);
	}


}
