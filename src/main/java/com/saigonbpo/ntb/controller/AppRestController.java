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
import com.saigonbpo.util.FuncUtil;

@RestController
public class AppRestController {

	// Rest Template
	@Autowired
	RestTemplate restTemplate;

	// Log
	Logger logger = LoggerFactory.getLogger(AppRestController.class);

	@Autowired
	private Environment env;

	@Autowired
	private AppService appService;
	
	@Autowired
	private ShipService shipService;


	@RequestMapping(value = { "/ListOfBoatFollowState/{tinhtrangdieudong}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> ListOfBoatFollowState(@PathVariable("tinhtrangdieudong") int tinhtrangdieudong) {

		logger.info("ListOfBoatFollowState");
		// Input
		Map<String, Object> Input = new HashMap<>();
		List<Map<String, Object>> ListOfCrew = new ArrayList<>();

		if (tinhtrangdieudong >= 0) {
			// 1 is on leave
			// 0 is onboard
			Input.put("tinhtrangdieudong", tinhtrangdieudong);

			// Call Service
			ListOfCrew = appService.getListOfBoat(Input);
		} else if (tinhtrangdieudong == -2) {

			// Total
			Input.put("tinhtrangdieudong", null);
			logger.info(""+Input);
			
			ListOfCrew = appService.getListOfBoat_v3(Input);

			for (Iterator<Map<String, Object>> iter = ListOfCrew.iterator(); iter.hasNext();) {
				Map<String, Object> map = iter.next();
				Object c_id = map.get("trangthaiId").toString();
				if (c_id.equals("-2"))
					iter.remove();
			}

		} else if (tinhtrangdieudong == -1) {
			// Applicant
			Input.put("trangthaiId", 0);
			ListOfCrew = appService.getListOfBoat_v3(Input);
		} else if (tinhtrangdieudong == -3) {
			// Resign
			Input.put("trangthaiId", -2);
			ListOfCrew = appService.getListOfBoat_v3(Input);
		}

		logger.info("ListOfCrew:" + ListOfCrew.size());

		return ListOfCrew;

	}
	
	@RequestMapping(value = { "/searchRest" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> searchRest(@RequestParam("crew") String crew) {

		logger.info("ListOfBoatFollowState");
		// Input
		Map<String, Object> Input = new HashMap<>();
		List<Map<String, Object>> ListOfCrew = new ArrayList<>();


		Input.put("crew", crew);

	
		ListOfCrew = appService.getListOfBoat_4(Input);
		

		return ListOfCrew;

	}

	@RequestMapping(value = { "/CrewOnShip/{tauid}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> CrewOnShip(@PathVariable("tauid") int tauid) {

		logger.info("CrewOnShip");
		Map<String, Object> ship = shipService.sp_get_ship_by_id(tauid);
		String ten = ship.get("ten").toString();
		// Input
		Map<String, Object> Input = new HashMap<>();
		List<Map<String, Object>> ListOfCrew = new ArrayList<>();
		Input.put("tinhtrangdieudong", 1);
		// Call Service
		ListOfCrew = appService.getListOfBoat(Input);
		for (Iterator<Map<String, Object>> iter = ListOfCrew.iterator(); iter.hasNext();) {
			Map<String, Object> map = iter.next();
			Object c_id = map.get("tauOffHoacOnGanNhat").toString();
			if (!c_id.equals(ten))
				iter.remove();
		}
		return ListOfCrew;

	}

	@RequestMapping(value = { "/updateProfile" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public long updateProfile(@RequestBody Map<String, Object> condition) throws JSONException {

		// Debug
		JSONObject json = new JSONObject(condition);
		System.out.printf("JSON: %s", json.toString(2));

		for (Map.Entry<String, Object> entry : condition.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());

			if ("".equals(entry.getValue()))
				condition.put(entry.getKey(), null);
		}

		if (condition.get("id") != null) {
			try {
				logger.info("ghichu:" + condition.get("ghichu"));
				appService.updateProfile(condition);

				return Long.valueOf(condition.get("id").toString());
			} catch (Exception ex) {
				logger.info(ex.toString());
				return 0;
			}
		} else {
			try {
				condition.put("id", null);
				appService.insertProfile(condition);
				return Long.valueOf(condition.get("id").toString());
			} catch (Exception ex) {
				logger.info(ex.toString());
				return 0;
			}
		}

	}



	@RequestMapping(value = "/uploadImage", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Map<String, Object> uploadFile(@RequestParam("uploadfile") MultipartFile uploadfile) {
		Map<String, Object> tab_file = new HashMap<>();
		try {

			// Init Time
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();
			System.out.println(formatter.format(date));
			int year = Calendar.getInstance().get(Calendar.YEAR);

			// Init Path Upload
			String PATH = env.getProperty("FILE_PATH");
			String directoryName = PATH + year;

			// Init File Name
			String originalFilename = uploadfile.getOriginalFilename();
			String filename = FilenameUtils.getBaseName(originalFilename) + date.getTime() + "."
					+ FilenameUtils.getExtension(originalFilename);
			// String filename = uploadfile.getOriginalFilename() ;

			File directory = new File(directoryName);
			if (!directory.exists()) {
				directory.mkdir();
				// If you require it to make the entire directory path including parents,
				// use directory.mkdirs(); here instead.
			}

			String filepath = Paths.get(directoryName, filename).toString();

			// Save the file locally
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(filepath)));
			stream.write(uploadfile.getBytes());
			stream.close();

			// Insert To Tab File DB
			tab_file.put("id", null);
			tab_file.put("name", year + "/" + filename);
			tab_file.put("full_path", originalFilename);
			tab_file.put("size", uploadfile.getSize());

			if (uploadfile.getContentType().length() > 40) {
				int length = uploadfile.getContentType().length();
				tab_file.put("type", uploadfile.getContentType().substring(length - 8, length));
			} else {
				tab_file.put("type", uploadfile.getContentType());
			}
			appService.insertTabFile(tab_file);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

		return tab_file;
	}

	/*
	 * @RequestMapping(value = "/uploadImage", method = RequestMethod.POST)
	 * 
	 * @ResponseBody public ResponseEntity<Map<String,Object>>
	 * uploadFile(@RequestParam("uploadfile") MultipartFile uploadfile) {
	 * Map<String,Object> tab_file = new HashMap<>(); try {
	 * 
	 * } catch (Exception e) { System.out.println(e.getMessage()); return new
	 * ResponseEntity<>(HttpStatus.BAD_REQUEST); }
	 * 
	 * return new ResponseEntity<Map<String,Object>>(tab_file,HttpStatus.OK); }
	 */
	@RequestMapping(value = { "/getSumCrew" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> getSumCrew() {
		Map<String, Object> Input = new HashMap<>();
		// Get Crew Department
		String[] colorCrew = { 
				"#bf7d10", "#3498DB", "#2cba98", "#E74C3C","#e5d434",
				"#b52970", "#87fac6", "#f8b3de", "black","#f12f7d",
				"#bae9fe", "#82dcc3", "#7f83fa", "#962c63","#ef00d5",
				"#62f02", "#274331", "#1d8721", "#62e541","#4b35cc"
				};
		List<Map<String, Object>> ListCrewDepartment = appService.sp_statistic_department(Input);
	
		for (int i = 0; i < ListCrewDepartment.size(); i++) {
			int m = i;
			if (i > 19)
				m = 19;
			ListCrewDepartment.get(i).put("color", colorCrew[m]);
		}
		logger.info("ListCrewDepartment:" + ListCrewDepartment);
		return ListCrewDepartment;

	}
	
	@RequestMapping(value = { "/masterdata/{code}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> getSpecificMasterDataByCode(@PathVariable("code") String code) {
		logger.info("code:" + code);
		return appService.SP_TAB_LOV(code);


	}
	
	@RequestMapping(value = { "masterdata/add" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> add_masterdata(@RequestBody Map<String, Object> condition)   {
		int result = 1;
		logger.info("masterdata Input: " + condition);
		FuncUtil.removeEmptyStringColumn(condition);
		try {
			condition.put("ID", null);
			
			if( "on".equals(condition.get("ISACTIVE")) )
			{
				condition.put("ISACTIVE", 1);
			}
			else
				condition.put("ISACTIVE", 0);
			
			appService.add_masterdata(condition);
			condition = appService.sp_get_Masterdata_by_id(Integer.parseInt(condition.get("ID").toString()));
			Map<String,Object> parent = appService.sp_get_Masterdata_by_id(Integer.parseInt(condition.get("PARENTID").toString()));
			condition.put("textparent", parent.get("text").toString());

			return condition;

		} catch (Exception ex) {
			ex.printStackTrace();
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "masterdata/edit" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> edit_masterdata(@RequestBody Map<String, Object> condition)   {
		logger.info("masterdata Input: " + condition);
		FuncUtil.removeEmptyStringColumn(condition);
		try {
			if( "on".equals(condition.get("ISACTIVE")) )
			{
				condition.put("ISACTIVE", 1);
			}
			else
				condition.put("ISACTIVE", 0);
			
			appService.edit_masterdata(condition);
			condition = appService.sp_get_Masterdata_by_id(Integer.parseInt(condition.get("ID").toString()));
			Map<String,Object> parent = appService.sp_get_Masterdata_by_id(Integer.parseInt(condition.get("PARENTID").toString()));
			condition.put("textparent", parent.get("text").toString());
			return condition;

		} catch (Exception ex) {
			ex.printStackTrace();
			return condition;
		}

	}

	@RequestMapping(value = { "masterdata/delete" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> delete_masterdata(@RequestBody Map<String, Object> condition)   {
		logger.info("masterdata Input: " + condition);
		FuncUtil.removeEmptyStringColumn(condition);
		try {

			appService.delete_masterdata(condition);
			condition = appService.sp_get_Masterdata_by_id(Integer.parseInt(condition.get("ID").toString()));
			Map<String,Object> parent = appService.sp_get_Masterdata_by_id(Integer.parseInt(condition.get("PARENTID").toString()));
			condition.put("textparent", parent.get("text").toString());
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}
	


	
	
	
	

}
