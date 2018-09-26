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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
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
public class ShipController {

	@Autowired
	private Environment env;

	// Log
	Logger logger = LoggerFactory.getLogger(ShipController.class);

	@Autowired
	private AppService appService;

	@Autowired
	private ShipService shipService;

	@RequestMapping(value = { "/Ship" }, method = RequestMethod.GET)
	public ModelAndView login_get(Model model, HttpSession session) {
		ModelAndView mav = new ModelAndView("component/ship/index");
		return mav;
	}

	@RequestMapping(value = { "/addShip/{id}" }, method = RequestMethod.GET)
	public ModelAndView addShip(@PathVariable("id") String id) {

		ModelAndView mav = new ModelAndView("component/Ship/Ship_add");
		FuncUtil.load_master_data("T001", mav, "ships", appService);
		return mav;
	}

	@RequestMapping(value = { "/editShip/{id}" }, method = RequestMethod.GET)
	public ModelAndView editShip(@PathVariable("id") int id) {

		ModelAndView mav = new ModelAndView("component/Ship/Ship_edit");

		Map<String, Object> information = shipService.sp_get_ship_by_id(id);
		FuncUtil.load_master_data("T001", mav, "ships", appService);

		logger.info("msg:" + information);

		mav.addObject("data", information);

		return mav;
	}

	@RequestMapping(value = { "/deleteShip/{id}" }, method = RequestMethod.GET)
	public ModelAndView deleteShip(@PathVariable("id") int id) {

		ModelAndView mav = new ModelAndView("component/Ship/Ship_delete");
		Map<String, Object> information = shipService.sp_get_ship_by_id(id);
		mav.addObject("data", information);

		return mav;
	}
	
	//Ship Certificate
	
	@RequestMapping(value = { "/ShipCertificate/{ship_id}" }, method = RequestMethod.GET)
	public ModelAndView ShipCertificate(@PathVariable("ship_id") String ship_id) {
		ModelAndView mav = new ModelAndView("component/ship/index_CertificateShip");
		// List<Map<String,Object>> result = shipService.getCerficate(ship_id);
		mav.addObject("ship_id", ship_id);
		return mav;
	}

	@RequestMapping(value = { "/addShipCertificate/{ship_id}" }, method = RequestMethod.GET)
	public ModelAndView addShipCertificate(@PathVariable("ship_id") String ship_id) {

		ModelAndView mav = new ModelAndView("component/Ship/CertificateShip_add");
		List<Map<String, Object>> certificates = shipService.SP_LOV_REMAINING_SHIP_CERT(ship_id);
		mav.addObject("certificates", certificates);
		// FuncUtil.load_master_data("T001", mav, "ships",appService);
		return mav;
	}

	@RequestMapping(value = { "/editShipCertificate/{id}" }, method = RequestMethod.GET)
	public ModelAndView editShipCertificate(@PathVariable("id") int id) {

		ModelAndView mav = new ModelAndView("component/Ship/CertificateShip_edit");
		Map<String, Object> information = shipService.sp_get_certificate_ship_by_id(id);
		mav.addObject("data", information);
		return mav;
	}

	@RequestMapping(value = { "/deleteShipCertificate/{id}" }, method = RequestMethod.GET)
	public ModelAndView deleteShipCertificate(@PathVariable("id") int id) {

		ModelAndView mav = new ModelAndView("component/Ship/CertificateShip_delete");
		Map<String, Object> information = shipService.sp_get_certificate_ship_by_id(id);
		mav.addObject("data", information);

		return mav;
	}

}
