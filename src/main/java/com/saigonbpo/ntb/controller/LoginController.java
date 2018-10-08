package com.saigonbpo.ntb.controller;

import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.saigonbpo.Oauth2Util.OAuthConstants;
import com.saigonbpo.model.LoginForm;
import com.saigonbpo.ntb.Service.AppService;
import com.saigonbpo.ntb.Service.UserService;
import com.saigonbpo.util.CallAPI;
import com.saigonbpo.util.DBConstant;
import com.saigonbpo.util.FuncUtil;
import com.saigonbpo.util.UtilLn;

@Controller
public class LoginController {

	// inject via application.properties

	@Autowired
	RestTemplate restTemplate;

	Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private AppService appService;
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public ModelAndView login_get(@ModelAttribute(name = "loginForm") LoginForm loginForm, Model model,
			HttpSession session) {
		ModelAndView mav =  new ModelAndView("component/login");
		return mav;
	}

	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute(name = "loginForm") LoginForm loginForm, Model model,
			HttpSession session) {
		ModelAndView mav =  new ModelAndView("component/login");
		try
		{
			System.out.println(loginForm.toString());
			
			Map<String,Object> Input = new HashMap<>();
			Input.put("p1", 1);
			Input.put("p2", 0);
			Input.put("username", loginForm.getUsername() );
			Input.put("password", UtilLn.ConvertToMD5(loginForm.getPassword())) ;
			Map<String,Object> result = userService.login(Input);
			
			if(result ==  null)
			{
				
				 logger.info("Account not found");
				 mav.addObject("error_message", "login.error");
				 return mav;
			}
			logger.info("loginInfo:"+result);
			session.setAttribute("loginInfo", result);
			
			
			
						
			mav = new ModelAndView("component/DashBoard");
			
			//Get Sumary Crews
			Map<String,Object> SumaryCrew = appService.get_SP_Get_statistical_DashBoard(Input);
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
			
			//Crew Ship
			List<Map<String,Object>> ListCrewShip = appService.sp_statistic_ship(Input);
			String[] color = {"fa fa-square blue","fa fa-square green","fa fa-square purple","fa fa-square aero"
			                  ,"fa fa-square red","fa fa-square yellow","fa fa-square dark","black"};
			
			for (int i=0;i<ListCrewShip.size();i++)
			{
				int m=i;
				if(i>7)
					m=7;
				ListCrewShip.get(i).put("color", color[m]);
			}
			logger.info("ListCrewShip:" + ListCrewShip);
			
			mav.addObject("SumaryCrew",SumaryCrew);
			mav.addObject("ListCrewDepartment",ListCrewDepartment);
			mav.addObject("ListCrewShip",ListCrewShip);
			return mav;
			
		}
		catch (Exception ex)
		{
			logger.info(ex.toString());
			ex.printStackTrace();
			return mav;
			
		}
		
	}

	@RequestMapping(value = { "/logout" }, method = RequestMethod.GET)
	public String logout(Model model,HttpServletRequest request) {

		ModelAndView mav =  new ModelAndView("component/login");
		request.removeAttribute("loginInfo");
		 return "redirect:/login";

	}

}