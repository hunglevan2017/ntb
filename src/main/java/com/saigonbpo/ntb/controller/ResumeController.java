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
import com.saigonbpo.util.CallAPI;
import com.saigonbpo.util.DBConstant;
import com.saigonbpo.util.FuncUtil;
import org.springframework.beans.factory.annotation.Value;

@Controller
public class ResumeController {

	// Rest Template
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	private Environment env;

	// Log
	Logger logger = LoggerFactory.getLogger(ResumeController.class);

	@Autowired
	private AppService appService;

	/**
	 * / Information /
	 **/
	
	
	@RequestMapping(value = { "/addInformationFamily" }, method = RequestMethod.GET)
	public ModelAndView addInformationFamily() {

		ModelAndView mav = new ModelAndView("component/resume/information_add");
		FuncUtil.load_master_data("S007", mav, "relations", appService);
		return mav;
	}

	@RequestMapping(value = { "/editInformationFamily/{id}" }, method = RequestMethod.GET)
	public ModelAndView editInformationFamily(@PathVariable("id") int id) {

		ModelAndView mav = new ModelAndView("component/resume/information_edit");
		FuncUtil.load_master_data("S007", mav, "relations", appService);
		Map<String, Object> information = appService.sp_get_thongtingiadinh_by_id(id);
		mav.addObject("data", information);

		return mav;
	}

	@RequestMapping(value = { "/deleteInformationFamily/{id}" }, method = RequestMethod.GET)
	public ModelAndView deleteInformationFamily(@PathVariable("id") int id) {

		ModelAndView mav = new ModelAndView("component/resume/information_delete");
		Map<String, Object> information = appService.sp_get_thongtingiadinh_by_id(id);
		mav.addObject("data", information);

		return mav;
	}
	
	
	/**
	 * / Trinh Do Chuyen Mon /
	 **/

	
	@RequestMapping(value = { "/addTrinhDoChuyenMon" }, method = RequestMethod.GET)
	public ModelAndView addTrinhDoChuyemon() {

		ModelAndView mav = new ModelAndView("component/resume/trinhdochuyenmon_add");
		return mav;
	}

	@RequestMapping(value = { "/editTrinhDoChuyenMon/{id}" }, method = RequestMethod.GET)
	public ModelAndView editTrinhDoChuyemon(@PathVariable("id") int id) {

		ModelAndView mav = new ModelAndView("component/resume/trinhdochuyenmon_edit");
		Map<String, Object> information = appService.sp_get_trinhdochuyenmon_by_id(id);
		mav.addObject("data", information);

		return mav;
	}

	@RequestMapping(value = { "/deleteTrinhDoChuyenMon/{id}" }, method = RequestMethod.GET)
	public ModelAndView deleteTrinhDoChuyemon(@PathVariable("id") int id) {

		ModelAndView mav = new ModelAndView("component/resume/trinhdochuyenmon_delete");
		Map<String, Object> information = appService.sp_get_trinhdochuyenmon_by_id(id);
		mav.addObject("data", information);

		return mav;
	}
	
	/** /
	Language Skills 
	/**/

		
		@RequestMapping(value = { "/addTrinhDoNgoaiNgu" }, method = RequestMethod.GET)
		public ModelAndView addTrinhDoNgoaiNgu() {

			ModelAndView mav = new ModelAndView("component/resume/TrinhDoNgoaiNgu_add");
			FuncUtil.load_master_data("S008", mav, "languages",appService);
			return mav;
		}

		@RequestMapping(value = { "/editTrinhDoNgoaiNgu/{id}" }, method = RequestMethod.GET)
		public ModelAndView editTrinhDoNgoaiNgu(@PathVariable("id") int id) {

			ModelAndView mav = new ModelAndView("component/resume/TrinhDoNgoaiNgu_edit");
			FuncUtil.load_master_data("S008", mav, "languages",appService);
			Map<String, Object> information = appService.sp_get_TrinhDoNgoaiNgu_by_id(id);
			mav.addObject("data", information);

			return mav;
		}

		@RequestMapping(value = { "/deleteTrinhDoNgoaiNgu/{id}" }, method = RequestMethod.GET)
		public ModelAndView deleteTrinhDoNgoaiNgu(@PathVariable("id") int id) {

			ModelAndView mav = new ModelAndView("component/resume/TrinhDoNgoaiNgu_delete");
			Map<String, Object> information = appService.sp_get_TrinhDoNgoaiNgu_by_id(id);
			mav.addObject("data", information);

			return mav;
		}
		
		
		@RequestMapping(value = { "/addTrinhDoViTinh" }, method = RequestMethod.GET)
		public ModelAndView addTrinhDoViTinh() {

			ModelAndView mav = new ModelAndView("component/resume/TrinhDoViTinh_add");
			FuncUtil.load_master_data("S009", mav, "ranks",appService);
			return mav;
		}

		@RequestMapping(value = { "/editTrinhDoViTinh/{id}" }, method = RequestMethod.GET)
		public ModelAndView editTrinhDoViTinh(@PathVariable("id") int id) {

			ModelAndView mav = new ModelAndView("component/resume/TrinhDoViTinh_edit");
			FuncUtil.load_master_data("S009", mav, "ranks",appService);
			Map<String, Object> information = appService.sp_get_trinhdovitinh_by_id(id);
			mav.addObject("data", information);

			return mav;
		}

		@RequestMapping(value = { "/deleteTrinhDoViTinh/{id}" }, method = RequestMethod.GET)
		public ModelAndView deleteTrinhDoViTinh(@PathVariable("id") int id) {

			ModelAndView mav = new ModelAndView("component/resume/TrinhDoViTinh_delete");
			Map<String, Object> information = appService.sp_get_trinhdovitinh_by_id(id);
			mav.addObject("data", information);

			return mav;
		}
		
		/**
		 * Experience
		 */
		@RequestMapping(value = { "/addExperience" }, method = RequestMethod.GET)
		public ModelAndView addExperience() {

			ModelAndView mav = new ModelAndView("component/experience/experience_add");
			FuncUtil.load_master_data("T001", mav, "ships",appService);
			FuncUtil.load_master_data("TV002", mav, "ranks",appService);
			return mav;
		}

		@RequestMapping(value = { "/editExperience/{id}" }, method = RequestMethod.GET)
		public ModelAndView editExperience(@PathVariable("id") int id) {

			ModelAndView mav = new ModelAndView("component/experience/experience_edit");
			FuncUtil.load_master_data("T001", mav, "ships",appService);
			FuncUtil.load_master_data("TV002", mav, "ranks",appService);
			Map<String, Object> information = appService.sp_get_Experience_by_id(id);
			mav.addObject("data", information);

			return mav;
		}
		
		@RequestMapping(value = { "/deleteExperience/{id}" }, method = RequestMethod.GET)
		public ModelAndView deleteExperience(@PathVariable("id") int id) {

			ModelAndView mav = new ModelAndView("component/experience/experience_delete");
			Map<String, Object> information = appService.sp_get_Experience_by_id(id);
			mav.addObject("data", information);

			return mav;
		}

		

}
