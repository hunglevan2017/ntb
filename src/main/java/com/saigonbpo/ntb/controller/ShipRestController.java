package com.saigonbpo.ntb.controller;

import static org.assertj.core.api.Assertions.contentOf;

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

import com.saigonbpo.util.FuncUtil;

import ch.qos.logback.core.recovery.ResilientFileOutputStream;

@RestController
public class ShipRestController {

	// Rest Template
	@Autowired
	RestTemplate restTemplate;

	// Log
	Logger logger = LoggerFactory.getLogger(ShipRestController.class);

	@Autowired
	private Environment env;

	@Autowired
	private ShipService shipService;

	@RequestMapping(value = { "/getShips" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> getship() {
		logger.info("ship");
		List<Map<String, Object>> result = shipService.sp_get_ship();
		if (result != null)
			result.remove(result.size() - 1);
		return result;
	}
	

	@RequestMapping(value = { "ship/add" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> add_ship(@RequestBody Map<String, Object> condition) throws JSONException {

	
		
		FuncUtil.removeEmptyStringColumn(condition);

		int result = 1;
		logger.info("ship Input: " + condition);
		try {
			condition.put("id", null);
			shipService.add_ship(condition);

			condition = shipService.sp_get_ship_by_id(Integer.parseInt(condition.get("id").toString()));

			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "ship/edit" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> edit_ship(@RequestBody Map<String, Object> condition) throws JSONException {
		FuncUtil.removeEmptyStringColumn(condition);
		logger.info("ship edit Input: " + condition);
		try {
			shipService.edit_ship(condition);
			condition = shipService.sp_get_ship_by_id(Integer.parseInt(condition.get("id").toString()));
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "ship/delete" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> delete_ship(@RequestBody Map<String, Object> condition) throws JSONException {
		logger.info("ship Input: " + condition);
		try {
			shipService.delete_ship(condition);
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}
	

}
