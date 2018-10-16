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
import com.saigonbpo.ntb.Service.ShipService;
import com.saigonbpo.ntb.Service.UserService;
import com.saigonbpo.util.FuncUtil;
import com.saigonbpo.util.UtilLn;

import ch.qos.logback.core.recovery.ResilientFileOutputStream;

@RestController
public class UserRestController {

	// Rest Template
	@Autowired
	RestTemplate restTemplate;

	// Log
	Logger logger = LoggerFactory.getLogger(UserRestController.class);

	@Autowired
	private Environment env;

	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/user" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> getship() {
		logger.info("ship");
		List<Map<String, Object>> result = userService.sp_get_user();
		//if (result != null)
		//	result.remove(result.size() - 1);
		return result;
	}
	

	@RequestMapping(value = { "user/add" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> add_ship(@RequestBody Map<String, Object> condition) throws JSONException {

	
		
		FuncUtil.removeEmptyStringColumn(condition);

		int result = 1;
		logger.info("ship Input: " + condition);
		try {
			condition.put("id", null);
			condition.put("Password", UtilLn.ConvertToMD5(condition.get("Password").toString())) ;
			
			userService.add_user(condition);
			//userService.add_member(condition);
			condition = userService.sp_get_user_by_id(Integer.parseInt(condition.get("id").toString()));

			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "user/edit" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> edit_ship(@RequestBody Map<String, Object> condition) throws JSONException {
		FuncUtil.removeEmptyStringColumn(condition);
		logger.info("ship edit Input: " + condition);
		try {
			Map<String,Object> oldRecord = userService.sp_get_user_by_id(Integer.parseInt(condition.get("UserId").toString()));;
			
			if( condition.get("Password")==null || "".equals( condition.get("Password") ) )
			{
				condition.put("Password",oldRecord.get("Password"));
			}
			else
			{
				condition.put("Password", UtilLn.ConvertToMD5(condition.get("Password").toString())) ;
			}
			
			
			
			if( "on".equals(condition.get("IsActive")) )
			{
				condition.put("IsActive", 1);
			}
			else
				condition.put("IsActive", 0);
			
			userService.edit_user(condition);
			condition = userService.sp_get_user_by_id(Integer.parseInt(condition.get("UserId").toString()));
			return condition;

		} catch (Exception ex) {
			ex.printStackTrace();
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "user/delete" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> delete_ship(@RequestBody Map<String, Object> condition) throws JSONException {
		logger.info("ship Input: " + condition);
		try {
			userService.delete_user(condition);
			condition = userService.sp_get_user_by_id(Integer.parseInt(condition.get("UserId").toString()));
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}
	
	
}
