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

import com.saigonbpo.ntb.Service.AppService;

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

	
	@RequestMapping(value = { "/thongtingiadinh/{thuyenvien_id}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> getFamilyInformation(@PathVariable("thuyenvien_id") String thuyenvien_id) {
		
		List<Map<String,Object>> result = appService.sp_get_thongtingiadinh(thuyenvien_id);
		return result;
	}
	//Information Family
	@RequestMapping(value = { "information/add" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String,Object> addInformation(@RequestBody Map<String, Object> condition) throws JSONException {
		int result=1;
		logger.info("Information Input: "+condition);
		try
		{
			condition.put("id", null);
			appService.addInformation(condition);
			condition = appService.sp_get_thongtingiadinh_by_id( Integer.parseInt( condition.get("id").toString() ) );
		
			return condition;
			
		}
		catch(Exception ex)
		{
			logger.info(ex.toString());
			return condition;
		}

	}
	
	@RequestMapping(value = { "information/edit" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String,Object> editInformation(@RequestBody Map<String, Object> condition) throws JSONException {
		logger.info("Information Input: " + condition);
		try
		{
			appService.editInformation(condition);
			condition = appService.sp_get_thongtingiadinh_by_id( Integer.parseInt( condition.get("id").toString() ) );
			return condition;
			
		}
		catch(Exception ex)
		{
			logger.info(ex.toString());
			return condition;
		}

	}
	
	@RequestMapping(value = { "information/delete" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String,Object> deleteInformation(@RequestBody Map<String, Object> condition) throws JSONException {
		logger.info("Information Input: " + condition);
		try
		{
			appService.deleteInformation(condition);
			return condition;
			
		}
		catch(Exception ex)
		{
			logger.info(ex.toString());
			return condition;
		}

	}
	
	//TrinhDoChuyenMon Family
	@RequestMapping(value = { "/trinhdochuyenmon/{thuyenvien_id}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> getTrinhdochuyenmon(@PathVariable("thuyenvien_id") String thuyenvien_id) {
		
		List<Map<String,Object>> result = appService.sp_get_trinhdochuyenmon(thuyenvien_id);
		return result;
	}
	
		@RequestMapping(value = { "trinhdochuyenmon/add" }, method = RequestMethod.POST, produces = {
				MediaType.APPLICATION_JSON_VALUE })
		public Map<String,Object> addTrinhDoChuyenMon(@RequestBody Map<String, Object> condition) throws JSONException {
			int result=1;
			logger.info("TrinhDoChuyenMon Input: "+condition);
			try
			{
				condition.put("id", null);
				appService.addTrinhDoChuyenMon(condition);
				condition = appService.sp_get_trinhdochuyenmon_by_id( Integer.parseInt( condition.get("id").toString() ) );
			
				return condition;
				
			}
			catch(Exception ex)
			{
				logger.info(ex.toString());
				return condition;
			}

		}
		
		@RequestMapping(value = { "trinhdochuyenmon/edit" }, method = RequestMethod.POST, produces = {
				MediaType.APPLICATION_JSON_VALUE })
		public Map<String,Object> editTrinhDoChuyenMon(@RequestBody Map<String, Object> condition) throws JSONException {
			logger.info("TrinhDoChuyenMon Input: " + condition);
			try
			{
				appService.editTrinhDoChuyenMon(condition);
				condition = appService.sp_get_trinhdochuyenmon_by_id( Integer.parseInt( condition.get("id").toString() ) );
				return condition;
				
			}
			catch(Exception ex)
			{
				logger.info(ex.toString());
				return condition;
			}

		}
		
		@RequestMapping(value = { "trinhdochuyenmon/delete" }, method = RequestMethod.POST, produces = {
				MediaType.APPLICATION_JSON_VALUE })
		public Map<String,Object> deleteTrinhDoChuyenMon(@RequestBody Map<String, Object> condition) throws JSONException {
			logger.info("TrinhDoChuyenMon Input: " + condition);
			try
			{
				appService.deleteTrinhDoChuyenMon(condition);
				return condition;
				
			}
			catch(Exception ex)
			{
				logger.info(ex.toString());
				return condition;
			}

		}
		
		//Trinh Do Ngoai Ngu
		@RequestMapping(value = { "/trinhdongoaingu/{thuyenvien_id}" }, method = RequestMethod.GET, produces = {
				MediaType.APPLICATION_JSON_VALUE })
		public List<Map<String, Object>> gettrinhdongoaingu(@PathVariable("thuyenvien_id") String thuyenvien_id) {
			
			List<Map<String,Object>> result = appService.sp_get_trinhdongoaingu(thuyenvien_id);
			return result;
		}
		
			@RequestMapping(value = { "trinhdongoaingu/add" }, method = RequestMethod.POST, produces = {
					MediaType.APPLICATION_JSON_VALUE })
			public Map<String,Object> add_trinhdongoaingu(@RequestBody Map<String, Object> condition) throws JSONException {
				int result=1;
				logger.info("trinhdongoaingu Input: "+condition);
				try
				{
					condition.put("id", null);
					appService.add_trinhdongoaingu(condition);
					condition = appService.sp_get_TrinhDoNgoaiNgu_by_id( Integer.parseInt( condition.get("id").toString() ) );
				
					return condition;
					
				}
				catch(Exception ex)
				{
					logger.info(ex.toString());
					return condition;
				}

			}
			
			@RequestMapping(value = { "trinhdongoaingu/edit" }, method = RequestMethod.POST, produces = {
					MediaType.APPLICATION_JSON_VALUE })
			public Map<String,Object> edit_trinhdongoaingu(@RequestBody Map<String, Object> condition) throws JSONException {
				logger.info("trinhdongoaingu Input: " + condition);
				try
				{
					appService.edit_trinhdongoaingu(condition);
					condition = appService.sp_get_TrinhDoNgoaiNgu_by_id( Integer.parseInt( condition.get("id").toString() ) );
					return condition;
					
				}
				catch(Exception ex)
				{
					logger.info(ex.toString());
					return condition;
				}

			}
			
			@RequestMapping(value = { "trinhdongoaingu/delete" }, method = RequestMethod.POST, produces = {
					MediaType.APPLICATION_JSON_VALUE })
			public Map<String,Object> delete_trinhdongoaingu(@RequestBody Map<String, Object> condition) throws JSONException {
				logger.info("trinhdongoaingu Input: " + condition);
				try
				{
					appService.delete_trinhdongoaingu(condition);
					return condition;
					
				}
				catch(Exception ex)
				{
					logger.info(ex.toString());
					return condition;
				}

			}
		
		
	

}
