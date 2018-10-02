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
import com.saigonbpo.ntb.Service.AssignmentService;
import com.saigonbpo.ntb.Service.CertificateService;
import com.saigonbpo.util.CallAPI;
import com.saigonbpo.util.DBConstant;
import com.saigonbpo.util.FuncUtil;
import org.springframework.beans.factory.annotation.Value;

@Controller
public class AssignmentController {


	@Autowired
	private Environment env;

	// Log
	Logger logger = LoggerFactory.getLogger(AssignmentController.class);

	@Autowired
	private AppService appService;
	
	
	@Autowired
	private AssignmentService assignmentService;
	
	@RequestMapping(value = { "/assignment" }, method = RequestMethod.GET)
	public ModelAndView index( ) {
		ModelAndView mav = new ModelAndView("component/assignment/index");
		List<Map<String, Object>> ships = assignmentService.getShips();
		mav.addObject("ships", ships);
		return mav;
	}
	@RequestMapping(value = { "/XuongTau/{tauid}/{thuyenvienid}" }, method = RequestMethod.GET)
	public ModelAndView XuongTau( @PathVariable("tauid") String tauid,@PathVariable("thuyenvienid") String thuyenvienid ) {

		ModelAndView mav = new ModelAndView("component/assignment/assignment_add");
		
		List<Map<String, Object>> result = assignmentService.loadTVDuTru(tauid);
		if (result != null)
			result.remove(result.size() - 1);
		for (Map<String, Object> map : result) {
			if( thuyenvienid.equals( map.get("id").toString()) )
			{
				
			
				Map<String,Object> chucdanh = assignmentService.getChucDanh(thuyenvienid);
				if(chucdanh !=null )
				map.put("ngay_dam_nhan", chucdanh.get("tungay"));
				map.put("tauid", tauid);
				map.put("thuyenvienid", thuyenvienid);
				
				mav.addObject("data", map);
				break;
			}
		}
		
		//logger.info("111");
		//List<Map<String, Object>> certificates = assignmentService.SP_LOV_REMAINING_BOATMAN_CERT(id);
		//mav.addObject("certificates", certificates);
		return mav;
	}
	
	

}
