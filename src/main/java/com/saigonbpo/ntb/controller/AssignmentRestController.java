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

import com.saigonbpo.ntb.Service.AppService;
import com.saigonbpo.ntb.Service.AssignmentService;
import com.saigonbpo.ntb.Service.CertificateService;
import com.saigonbpo.util.FuncUtil;

import ch.qos.logback.core.recovery.ResilientFileOutputStream;

@RestController
public class AssignmentRestController {

	// Rest Template
	@Autowired
	RestTemplate restTemplate;

	// Log
	Logger logger = LoggerFactory.getLogger(AssignmentRestController.class);

	@Autowired
	private Environment env;

	@Autowired
	private AssignmentService assignmentService;

	@RequestMapping(value = { "/loadCrewOnShip/{tauid}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> loadCrewOnShip(@PathVariable("tauid") String tauid) {
		logger.info("certificate");
		List<Map<String, Object>> result = assignmentService.loadCrewOnShip(tauid);
		if (result != null)
			result.remove(result.size() - 1);
		return result;
	}

	@RequestMapping(value = { "/loadTVDuTru/{tauid}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> loadTVDuTru(@PathVariable("tauid") String tauid) {
		logger.info("certificate");
		List<Map<String, Object>> result = assignmentService.loadTVDuTru(tauid);
		if (result != null)
			result.remove(result.size() - 1);

		List<Map<String, Object>> arrs = new ArrayList();

		/*
		for (Map<String, Object> map : result) {
			if ("0".equals(map.get("tinhtrangdieudong").toString())) {
					arrs.add(map);
			}
		}*/

		return result;
	}
	
	@RequestMapping(value = { "/loadTVDuTruAssign/{tauid}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> loadTVDuTruAssign(@PathVariable("tauid") String tauid) {
		logger.info("certificate");
		List<Map<String, Object>> result = assignmentService.loadTVDuTru(tauid);
		if (result != null)
			result.remove(result.size() - 1);

		List<Map<String, Object>> arrs = new ArrayList();

		
		for (Map<String, Object> map : result) {
			if ("0".equals(map.get("tinhtrangdieudong").toString())) {
					arrs.add(map);
			}
		}

		return arrs;
	}

	@RequestMapping(value = { "assignment/add" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> assignment_add(@RequestBody Map<String, Object> condition) throws JSONException {

		Map<String, Object> output = new HashMap<>();
		output.put("status", false);
		logger.info("condition:" + condition);

		try {

			if ("1".equals(condition.get("tinhtrangdieudong").toString())) {
				assignmentService.ProcessTranferShip(condition);
			} else {
				assignmentService.newToShip(condition);
			}
			output.put("status", true);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			output.put("message", "There a error data please contact admin");
		}
		return output;
	}

	@RequestMapping(value = { "assignment/edit" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> assignment_edit(@RequestBody Map<String, Object> condition) throws JSONException {

		Map<String, Object> output = new HashMap<>();
		output.put("status", false);
		logger.info("condition:" + condition);

		try {
			assignmentService.updateDieuDong(condition);

			output.put("status", true);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			output.put("message", "There a error data please contact admin");
		}
		return output;
	}

	@RequestMapping(value = { "assignment/add_roitau" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> assignment_add_roitau(@RequestBody Map<String, Object> condition) throws JSONException {

		Map<String, Object> output = new HashMap<>();
		output.put("status", false);
		logger.info("condition:" + condition);

		try {
			assignmentService.ProcessLeaveShip(condition);
			output.put("status", true);
		} catch (Exception e) {
			e.printStackTrace();
			output.put("message", "There a error data please contact admin");
		}

		return output;
	}

	@RequestMapping(value = { "assignment/delete" }, method = RequestMethod.POST)
	public Map<String, Object> deleteKhoiTau(@RequestBody Map<String, Object> condition) {

		Map<String, Object> output = new HashMap<>();

		logger.info("condition delete tren tau:" + condition);

		try {
			assignmentService.ProcessDeleteOnBoard(condition);

			output.put("status", true);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			output.put("message", "There a error data please contact admin");
		}
		return output;
	}

}
