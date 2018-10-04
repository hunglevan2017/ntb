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
import com.saigonbpo.ntb.Service.CertificateService;
import com.saigonbpo.util.CallAPI;
import com.saigonbpo.util.DBConstant;
import com.saigonbpo.util.FuncUtil;
import org.springframework.beans.factory.annotation.Value;

@Controller
public class CertificateController {


	@Autowired
	private Environment env;

	// Log
	Logger logger = LoggerFactory.getLogger(CertificateController.class);

	@Autowired
	private AppService appService;
	
	
	@Autowired
	private CertificateService certificateService;
	

	@RequestMapping(value = { "/addCertificate/{id}" }, method = RequestMethod.GET)
	public ModelAndView addCertificate( @PathVariable("id") int id ) {

		ModelAndView mav = new ModelAndView("component/certificate/certificate_add");
		logger.info("111");
		List<Map<String, Object>> certificates = certificateService.SP_LOV_REMAINING_BOATMAN_CERT(id);
		mav.addObject("certificates", certificates);
		return mav;
	}

	@RequestMapping(value = { "/editCertificate/{id}" }, method = RequestMethod.GET)
	public ModelAndView editCertificate(@PathVariable("id") int id) {

		ModelAndView mav = new ModelAndView("component/certificate/Certificate_edit");
		
		Map<String, Object> information = certificateService.sp_get_certificate_by_id(id );
		
		logger.info("msg:" + information);
		
		 mav.addObject("data", information);

		return mav;
	}

	@RequestMapping(value = { "/deleteCertificate/{id}" }, method = RequestMethod.GET)
	public ModelAndView deleteCertificate(@PathVariable("id") int id) {

		ModelAndView mav = new ModelAndView("component/certificate/Certificate_delete");
		 Map<String, Object> information = certificateService.sp_get_certificate_by_id(id);
		 mav.addObject("data", information);

		return mav;
	}
	
	
	@RequestMapping(value = { "/addRank/{id}" }, method = RequestMethod.GET)
	public ModelAndView addRank( @PathVariable("id") int id ) {

		ModelAndView mav = new ModelAndView("component/certificate/rank_add");
		FuncUtil.load_master_data("TV002", mav, "ranks",appService);
		return mav;
	}

	@RequestMapping(value = { "/editRank/{id}" }, method = RequestMethod.GET)
	public ModelAndView editRank(@PathVariable("id") int id) {

		ModelAndView mav = new ModelAndView("component/certificate/rank_edit");
		
		Map<String, Object> information = certificateService.sp_get_Rank_by_id(id );
		FuncUtil.load_master_data("TV002", mav, "ranks",appService);
		logger.info("msg:" + information);
		
		mav.addObject("data", information);

		return mav;
	}

	@RequestMapping(value = { "/deleteRank/{id}" }, method = RequestMethod.GET)
	public ModelAndView deleteRank(@PathVariable("id") int id) {

		ModelAndView mav = new ModelAndView("component/certificate/rank_delete");
		 Map<String, Object> information = certificateService.sp_get_Rank_by_id(id);
		 mav.addObject("data", information);

		return mav;
	}

}
