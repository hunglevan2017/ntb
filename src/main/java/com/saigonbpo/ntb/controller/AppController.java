package com.saigonbpo.ntb.controller;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.el.ArrayELResolver;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.saigonbpo.Oauth2Util.OAuthConstants;
import com.saigonbpo.model.LoginForm;
import com.saigonbpo.model.Sea_Thongtinthuyenvien;
import com.saigonbpo.model.Sea_Thongtinthuyenvien_Left;
import com.saigonbpo.ntb.Service.AppService;
import com.saigonbpo.ntb.Service.ShipService;
import com.saigonbpo.util.CallAPI;
import com.saigonbpo.util.DBConstant;
import com.saigonbpo.util.FuncUtil;
import org.springframework.beans.factory.annotation.Value;

@Controller
public class AppController {

	// Rest Template
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	private Environment env;

	// Log
	Logger logger = LoggerFactory.getLogger(AppController.class);

	@Autowired
	private AppService appService;
	
	@Autowired
	private ShipService shipService;

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request) {
		Map<String, Object> loginInfo = (Map<String, Object>) request.getSession().getAttribute("loginInfo");

		if (loginInfo == null) {
			return new ModelAndView("component/login");
		}

		ModelAndView mav = new ModelAndView("component/DashBoard");
		Map<String, Object> Input = new HashMap<>();

		// Get Sumary Crews
		Map<String, Object> SumaryCrew = appService.get_SP_Get_statistical_DashBoard(Input);
		logger.info("SumaryCrew:" + SumaryCrew);

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
		logger.info("ListCrewDepartment11:" + ListCrewDepartment);
		

		// Crew Ship
		List<Map<String, Object>> ListCrewShip = appService.sp_statistic_ship(Input);
		String[] color = { "fa fa-square blue", "fa fa-square green", "fa fa-square purple", "fa fa-square aero",
				"fa fa-square red", "fa fa-square yellow", "fa fa-square dark", "black" };

		for (int i = 0; i < ListCrewShip.size(); i++) {
			int m = i;
			if (i > 7)
				m = 7;
			ListCrewShip.get(i).put("color", color[m]);
		}
		logger.info("ListCrewShip:" + ListCrewShip);

		mav.addObject("SumaryCrew", SumaryCrew);
		mav.addObject("ListCrewDepartment", ListCrewDepartment);
		mav.addObject("ListCrewShip", ListCrewShip);
		return mav;
	}

	@RequestMapping(value = { "/ListOfBoat/{tinhtrangdieudong}" }, method = RequestMethod.GET)
	public ModelAndView ListOfBoat(@PathVariable("tinhtrangdieudong") int tinhtrangdieudong) {

		ModelAndView mav = new ModelAndView("component/ListOfBoat");
		mav.addObject("tinhtrangdieudong", tinhtrangdieudong);

		return mav;

	}

	@RequestMapping(value = { "/CrewOnShip/{tauid}" }, method = RequestMethod.GET)
	public ModelAndView CrewOnShip(@PathVariable("tauid") int tauid) {

		ModelAndView mav = new ModelAndView("component/CrewOnShip");
		
		Map<String, Object> ship = shipService.sp_get_ship_by_id(tauid);
		String tentau = ship.get("ten").toString();
		
		mav.addObject("tauid", tauid);
		mav.addObject("tentau", tentau);
		
		return mav;

	}



	// Edit crew load page
	@RequestMapping(value = { "/InfoCrew/{thuyenvienid}" }, method = RequestMethod.GET)
	public ModelAndView InfoCrew(@PathVariable("thuyenvienid") int thuyenvienid) {

		logger.info("detail crew");
		ModelAndView mav = new ModelAndView("component/DetailCrew");

		// Load Left Info Crew
		Map<String, Object> Input = new HashMap<>();
		Input.put("thuyenvienid", thuyenvienid);
		Input.put("thuyenvienId", thuyenvienid);
		List<Map<String, Object>> left_info_crew = appService.sp_sea_get_profile_user(Input);
		
		List<Map<String, Object>> chungchi = appService.getMainCertificateCrewII (Input);
		Map<String,Object> tempCertificate = new HashMap<>();
		mav.addObject("chungchi", chungchi);
		if(chungchi.size()==0)
		{
			chungchi.add(tempCertificate);
			chungchi.add(tempCertificate);
		}
	

		logger.info("left_info_crew:" + left_info_crew);

		if (left_info_crew != null && left_info_crew.size() > 1) {
			if (left_info_crew.get(0).get("tinhtrangdieudong") != null
					&& left_info_crew.get(0).get("tinhtrangdieudong").toString().equals("1")) {
				left_info_crew.get(0).put("status_ship", "On board ");
			} else
				left_info_crew.get(0).put("status_ship", "On leave ");

			logger.info("left_info_crew:" + left_info_crew);

			mav.addObject("left_info_crew", left_info_crew.get(0));
		} else
			mav.addObject("left_info_crew", null);

		// Load Main Info Crew
		Map<String, Object> crew = appService.sp_get_info_crew(Input);

		// crew.put("email", "haha");

		logger.info("crew:" + crew);
		if (crew != null) {
			mav.addObject("crew", crew);

		} else {
			mav.addObject("crew", null);
		}

		// Load Master Data Tinhtrangdieudong
		FuncUtil.load_master_data("S001", mav, "nations",appService);
		FuncUtil.load_master_data("S002", mav, "clothes",appService);
		FuncUtil.load_master_data("S003", mav, "shoes",appService);
		FuncUtil.load_master_data("S004", mav, "tinhtrangdieudongs",appService);
		FuncUtil.load_master_data("S006", mav, "status",appService);
		FuncUtil.load_master_data("S007", mav, "relations",appService);
		FuncUtil.load_master_data("S008", mav, "languages",appService);
		FuncUtil.load_master_data("S011", mav, "reasons",appService);

		return mav;

	}

	// Create new crew load page
	@RequestMapping(value = { "/InfoCrew" }, method = RequestMethod.GET)
	public ModelAndView DetailCrew() {

		logger.info("detail crew");
		ModelAndView mav = new ModelAndView("component/DetailCrew");

		// Load Left Info Crew
		mav.addObject("left_info_crew", null);
		mav.addObject("crew", null);
		
		List<Map<String, Object>> chungchi = new ArrayList<>();
		Map<String,Object> tempCertificate = new HashMap<>();
		mav.addObject("chungchi", chungchi);
		if(chungchi.size()==0)
		{
			chungchi.add(tempCertificate);
			chungchi.add(tempCertificate);
		}
		
		// Load Master Data Tinhtrangdieudong
		FuncUtil.load_master_data("S001", mav, "nations",appService);
		FuncUtil.load_master_data("S002", mav, "clothes",appService);
		FuncUtil.load_master_data("S003", mav, "shoes",appService);
		FuncUtil.load_master_data("S004", mav, "tinhtrangdieudongs",appService);
		FuncUtil.load_master_data("S006", mav, "status",appService);
		FuncUtil.load_master_data("S007", mav, "relations",appService);
		FuncUtil.load_master_data("S008", mav, "languages",appService);
		FuncUtil.load_master_data("S011", mav, "reasons",appService);
		return mav;
	}

	

}
