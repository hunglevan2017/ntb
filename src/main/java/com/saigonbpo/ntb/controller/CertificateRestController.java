package com.saigonbpo.ntb.controller;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.saigonbpo.ntb.Mapper.ChungChiThuyenVienMapper;
import com.saigonbpo.ntb.Model.ChungChiThuyenVien;
import com.saigonbpo.ntb.Service.AppService;
import com.saigonbpo.ntb.Service.CertificateService;
import com.saigonbpo.util.FuncUtil;

import ch.qos.logback.core.recovery.ResilientFileOutputStream;

@RestController
public class CertificateRestController {

	// Rest Template
	@Autowired
	RestTemplate restTemplate;

	// Log
	Logger logger = LoggerFactory.getLogger(CertificateRestController.class);

	@Autowired
	private Environment env;

	@Autowired
	private CertificateService certificateService;

	@Autowired
	private ChungChiThuyenVienMapper chungChiThuyenVienMapper;

	@RequestMapping(value = { "/certificate/{thuyenvien_id}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> getcertificate(@PathVariable("thuyenvien_id") String thuyenvien_id) {
		logger.info("certificate");
		List<Map<String, Object>> result = certificateService.sp_get_certificate(thuyenvien_id);
		if (result != null)
			result.remove(result.size() - 1);
		return result;
	}

	@RequestMapping(value = { "/certificate_near_expire" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> certificate_near_expire() {
		logger.info("certificate");

		List<Map<String, Object>> result = certificateService.sp_statistic_seaman();
		// if (result != null)
		// result.remove(result.size() - 1);
		return result;
	}

	@RequestMapping(value = { "certificate/add" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> add_certificate(@RequestBody Map<String, Object> condition) throws JSONException {

		FuncUtil.removeEmptyStringColumn(condition);

		int result = 1;
		logger.info("certificate Input: " + condition);
		try {
			condition.put("id", null);
			//certificateService.add_certificate(condition);

			SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
			Date tungay = formatter1.parse(condition.get("tungay").toString());
			Date denngay = null;
			if (condition.get("denngay") != null)
				denngay = formatter1.parse(condition.get("denngay").toString());
			
			//int hinhscan = ( condition.get("hinhCertificate") == null || "".equals(condition.get("hinhCertificate").toString()))  ? null
			//		: Integer.parseInt(condition.get("hinhCertificate").toString());
			
			int tenchungchival = condition.get("tenchungchiVAL") == null ? null
					: Integer.parseInt(condition.get("tenchungchiVAL").toString());
			String so = condition.get("so") == null ? "" : condition.get("so").toString();
			int thuyenvienid = condition.get("thuyenvienId") == null ? null
					: Integer.parseInt(condition.get("thuyenvienId").toString());

			ChungChiThuyenVien chungChiThuyenVien = new ChungChiThuyenVien();
			chungChiThuyenVien.setTungay(tungay);
			chungChiThuyenVien.setDenngay(denngay);
			if( condition.get("hinhCertificate")!=null && !("".equals(condition.get("hinhCertificate").toString())) )
			{
				chungChiThuyenVien.setHinhscan( Integer.parseInt(condition.get("hinhCertificate").toString()));
			}
			chungChiThuyenVien.setTenchungchival(tenchungchival);
			chungChiThuyenVien.setSo(so);
			chungChiThuyenVien.setThuyenvienid(thuyenvienid);
			chungChiThuyenVienMapper.insertSelective(chungChiThuyenVien);

			condition = certificateService.sp_get_certificate_by_id(chungChiThuyenVien.getId());

			return condition;

		} catch (Exception ex) {
			ex.printStackTrace();
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "certificate/edit" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> edit_certificate(@RequestBody Map<String, Object> condition) throws JSONException {
		FuncUtil.removeEmptyStringColumn(condition);
		logger.info("certificate edit Input: " + condition);
		try {
			certificateService.edit_certificate(condition);
			condition = certificateService.sp_get_certificate_by_id(Integer.parseInt(condition.get("id").toString()));
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "certificate/delete" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> delete_certificate(@RequestBody Map<String, Object> condition) throws JSONException {
		logger.info("certificate Input: " + condition);
		try {
			certificateService.delete_certificate(condition);
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "/rank/{thuyenvien_id}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> getrank(@PathVariable("thuyenvien_id") String thuyenvien_id) {
		logger.info("rank");
		List<Map<String, Object>> result = certificateService.SP_Boatman_Position_Search(thuyenvien_id);
		if (result != null)
			result.remove(result.size() - 1);
		return result;
	}

	@RequestMapping(value = { "rank/add" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> add_rank(@RequestBody Map<String, Object> condition) throws JSONException {

		FuncUtil.removeEmptyStringColumn(condition);

		int result = 1;
		logger.info("rank Input: " + condition);
		try {
			condition.put("id", null);
			certificateService.add_rank(condition);

			condition = certificateService.sp_get_Rank_by_id(Integer.parseInt(condition.get("id").toString()));

			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "rank/edit" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> edit_rank(@RequestBody Map<String, Object> condition) throws JSONException {
		FuncUtil.removeEmptyStringColumn(condition);
		logger.info("rank edit Input: " + condition);
		try {
			certificateService.edit_rank(condition);
			condition = certificateService.sp_get_Rank_by_id(Integer.parseInt(condition.get("id").toString()));
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "rank/delete" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> delete_rank(@RequestBody Map<String, Object> condition) throws JSONException {
		logger.info("rank Input: " + condition);
		try {
			certificateService.delete_rank(condition);
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

}
