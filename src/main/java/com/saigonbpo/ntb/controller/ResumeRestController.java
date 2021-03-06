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
import org.springframework.web.servlet.ModelAndView;

import com.saigonbpo.ntb.Mapper.KinhNghiemLamViecMapper;
import com.saigonbpo.ntb.Mapper.ThongTinGiaDinhMapper;
import com.saigonbpo.ntb.Model.KinhNghiemLamViec;
import com.saigonbpo.ntb.Model.ThongTinGiaDinh;
import com.saigonbpo.ntb.Service.AppService;
import com.saigonbpo.util.FuncUtil;

@RestController
public class ResumeRestController {

	// Rest Template
	@Autowired
	RestTemplate restTemplate;

	// Log
	Logger logger = LoggerFactory.getLogger(ResumeRestController.class);

	@Autowired
	private Environment env;

	@Autowired
	private AppService appService;
	
	@Autowired
	ThongTinGiaDinhMapper thongTinGiaDinhMapper;
	
	@Autowired
	KinhNghiemLamViecMapper kinhNghiemLamViecMapper;

	@RequestMapping(value = { "/thongtingiadinh/{thuyenvien_id}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> getFamilyInformation(@PathVariable("thuyenvien_id") String thuyenvien_id) {

		List<Map<String, Object>> result = appService.sp_get_thongtingiadinh(thuyenvien_id);
		return result;
	}

	// Information Family
	@RequestMapping(value = { "information/add" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> addInformation(@RequestBody Map<String, Object> condition) throws JSONException {
		int result = 1;
		logger.info("Information Input: " + condition);
		try {
			condition.put("id", null);
			
			//appService.addInformation(condition);
			ThongTinGiaDinh thongTinGiaDinh = new ThongTinGiaDinh();
			thongTinGiaDinh.setThuyenvienid(Integer.parseInt( condition.get("thuyenvienId").toString()));
			thongTinGiaDinh.setHoten(condition.get("hoten") == null ? "": condition.get("hoten").toString() );
			thongTinGiaDinh.setCongty(condition.get("congty") == null ? "": condition.get("congty").toString() );
			thongTinGiaDinh.setNghenghiep(condition.get("nghenghiep") == null ? "": condition.get("nghenghiep").toString());
			thongTinGiaDinh.setDienthoai(condition.get("dienthoai") == null ? "": condition.get("dienthoai").toString());
			thongTinGiaDinh.setDiachi(condition.get("diachi") == null ? "": condition.get("diachi").toString() );
			thongTinGiaDinh.setGhichu(condition.get("ghichu") == null ? "": condition.get("ghichu").toString() );
			thongTinGiaDinh.setQuanhe(Integer.parseInt( condition.get("quanhe").toString()));
			thongTinGiaDinhMapper.insertSelective(thongTinGiaDinh);
			
			condition.put("id", thongTinGiaDinh.getId());
			condition = appService.sp_get_thongtingiadinh_by_id(Integer.parseInt(condition.get("id").toString()));

			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "information/edit" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> editInformation(@RequestBody Map<String, Object> condition) throws JSONException {
		logger.info("Information Input: " + condition);
		try {
			appService.editInformation(condition);
			condition = appService.sp_get_thongtingiadinh_by_id(Integer.parseInt(condition.get("id").toString()));
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "information/delete" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> deleteInformation(@RequestBody Map<String, Object> condition) throws JSONException {
		logger.info("Information Input: " + condition);
		try {
			appService.deleteInformation(condition);
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	// TrinhDoChuyenMon Family
	@RequestMapping(value = { "/trinhdochuyenmon/{thuyenvien_id}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> getTrinhdochuyenmon(@PathVariable("thuyenvien_id") String thuyenvien_id) {

		List<Map<String, Object>> result = appService.sp_get_trinhdochuyenmon(thuyenvien_id);
		return result;
	}

	@RequestMapping(value = { "trinhdochuyenmon/add" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> addTrinhDoChuyenMon(@RequestBody Map<String, Object> condition) throws JSONException {
		int result = 1;
		logger.info("TrinhDoChuyenMon Input: " + condition);
		try {
			condition.put("id", null);
			appService.addTrinhDoChuyenMon(condition);
			condition = appService.sp_get_trinhdochuyenmon_by_id(Integer.parseInt(condition.get("id").toString()));

			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "trinhdochuyenmon/edit" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> editTrinhDoChuyenMon(@RequestBody Map<String, Object> condition) throws JSONException {
		logger.info("TrinhDoChuyenMon Input: " + condition);
		try {
			appService.editTrinhDoChuyenMon(condition);
			condition = appService.sp_get_trinhdochuyenmon_by_id(Integer.parseInt(condition.get("id").toString()));
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "trinhdochuyenmon/delete" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> deleteTrinhDoChuyenMon(@RequestBody Map<String, Object> condition) throws JSONException {
		logger.info("TrinhDoChuyenMon Input: " + condition);
		try {
			appService.deleteTrinhDoChuyenMon(condition);
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	// Trinh Do Ngoai Ngu
	@RequestMapping(value = { "/trinhdongoaingu/{thuyenvien_id}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> gettrinhdongoaingu(@PathVariable("thuyenvien_id") String thuyenvien_id) {

		List<Map<String, Object>> result = appService.sp_get_trinhdongoaingu(thuyenvien_id);
		return result;
	}

	@RequestMapping(value = { "trinhdongoaingu/add" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> add_trinhdongoaingu(@RequestBody Map<String, Object> condition) throws JSONException {
		int result = 1;
		logger.info("trinhdongoaingu Input: " + condition);
		try {
			condition.put("id", null);
			appService.add_trinhdongoaingu(condition);
			condition = appService.sp_get_TrinhDoNgoaiNgu_by_id(Integer.parseInt(condition.get("id").toString()));

			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "trinhdongoaingu/edit" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> edit_trinhdongoaingu(@RequestBody Map<String, Object> condition) throws JSONException {
		logger.info("trinhdongoaingu Input: " + condition);
		try {
			appService.edit_trinhdongoaingu(condition);
			condition = appService.sp_get_TrinhDoNgoaiNgu_by_id(Integer.parseInt(condition.get("id").toString()));
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "trinhdongoaingu/delete" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> delete_trinhdongoaingu(@RequestBody Map<String, Object> condition) throws JSONException {
		logger.info("trinhdongoaingu Input: " + condition);
		try {
			appService.delete_trinhdongoaingu(condition);
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	// Trinh Do Ngoai Ngu
	@RequestMapping(value = { "/trinhdovitinh/{thuyenvien_id}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> gettrinhdovitinh(@PathVariable("thuyenvien_id") String thuyenvien_id) {
		logger.info("trinhdovitinh");
		List<Map<String, Object>> result = appService.sp_get_trinhdovitinh(thuyenvien_id);
		return result;
	}

	@RequestMapping(value = { "trinhdovitinh/add" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> add_trinhdovitinh(@RequestBody Map<String, Object> condition) throws JSONException {
		int result = 1;
		logger.info("trinhdovitinh Input: " + condition);
		try {
			condition.put("id", null);
			appService.add_trinhdovitinh(condition);
			condition = appService.sp_get_trinhdovitinh_by_id(Integer.parseInt(condition.get("id").toString()));

			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "trinhdovitinh/edit" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> edit_trinhdovitinh(@RequestBody Map<String, Object> condition) throws JSONException {
		logger.info("trinhdovitinh Input: " + condition);
		try {
			appService.edit_trinhdovitinh(condition);
			condition = appService.sp_get_trinhdovitinh_by_id(Integer.parseInt(condition.get("id").toString()));
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "trinhdovitinh/delete" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> delete_trinhdovitinh(@RequestBody Map<String, Object> condition) throws JSONException {
		logger.info("trinhdovitinh Input: " + condition);
		try {
			appService.delete_trinhdovitinh(condition);
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "/experience/{thuyenvien_id}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> experience(@PathVariable("thuyenvien_id") String thuyenvien_id) {

		List<Map<String, Object>> result = appService.queryKinhNghiemLamviec(thuyenvien_id);
		
		return result;
	}
	
	@RequestMapping(value = { "/experience1/{thuyenvien_id}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> experience1(@PathVariable("thuyenvien_id") String thuyenvien_id) {


		List<Map<String, Object>> result = appService.queryKinhNghiemLamviecOther(thuyenvien_id);
		
		return result;
	}
	
	@RequestMapping(value = { "experience/add" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> add_Experience(@RequestBody Map<String, Object> condition)   {
		int result = 1;
		logger.info("Experience Input: " + condition);
		FuncUtil.removeEmptyStringColumn(condition);
		try {
			condition.put("id", null);
			//appService.add_experience(condition);
			
			SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
			   
			String chucdanh = condition.get("chucdanh") == null ? "": condition.get("chucdanh").toString();
			String congsuatmay = condition.get("congsuatmay") == null ? "":condition.get("congsuatmay").toString();
			Date denngay = formatter1.parse(condition.get("denngay").toString());
			Date tungay = formatter1.parse(condition.get("tungay").toString());
			String ghichu = condition.get("ghichu") == null ? "":condition.get("ghichu").toString();
			int loaitau =Integer.parseInt( condition.get("loaitau").toString()); 
			String tencongty = condition.get("tencongty") == null ? "": condition.get("tencongty").toString(); 
			String tentau = condition.get("tentau") == null ? "": condition.get("tentau").toString(); 
			int thuyenvienid = Integer.parseInt( condition.get("thuyenvienId").toString()); 
			String trongtai = condition.get("trongtai") == null ? "": condition.get("trongtai").toString(); 
			
			KinhNghiemLamViec kinhNghiemLamViec = new KinhNghiemLamViec();
			kinhNghiemLamViec.setChucdanh(chucdanh);
			kinhNghiemLamViec.setCongsuatmay(congsuatmay);
			kinhNghiemLamViec.setDenngay(denngay);
			kinhNghiemLamViec.setTungay(tungay);
			kinhNghiemLamViec.setGhichu(ghichu);
			kinhNghiemLamViec.setLoaitau(loaitau);
			kinhNghiemLamViec.setMycompany(0);
			kinhNghiemLamViec.setTencongty(tencongty);
			kinhNghiemLamViec.setTentau(tentau);
			kinhNghiemLamViec.setThuyenvienid(thuyenvienid);
			kinhNghiemLamViec.setTrongtai(trongtai);
			kinhNghiemLamViecMapper.insertSelective(kinhNghiemLamViec);
			condition = appService.sp_get_Experience_by_id(kinhNghiemLamViec.getId());

			return condition;

		} catch (Exception ex) {
			ex.printStackTrace();
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "experience/edit" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> edit_Experience(@RequestBody Map<String, Object> condition)   {
		logger.info("Experience Input: " + condition);
		FuncUtil.removeEmptyStringColumn(condition);
		try {
			appService.edit_experience(condition);
			condition = appService.sp_get_Experience_by_id(Integer.parseInt(condition.get("id").toString()));
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "experience/delete" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> delete_Experience(@RequestBody Map<String, Object> condition)   {
		logger.info("Experience Input: " + condition);
		FuncUtil.removeEmptyStringColumn(condition);
		try {
			appService.delete_experience(condition);
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}



}
