package com.saigonbpo.ntb.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
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
import com.saigonbpo.ntb.view.ExcelView;
import com.saigonbpo.util.CallAPI;
import com.saigonbpo.util.DBConstant;
import com.saigonbpo.util.FuncUtil;
import org.springframework.beans.factory.annotation.Value;

@Controller
public class ExportController {

	// Rest Template
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	private Environment env;

	// Log
	Logger logger = LoggerFactory.getLogger(ExportController.class);


	
	  @RequestMapping(value = "/download",method=RequestMethod.GET)
      public ModelAndView getExcel(HttpServletResponse response) throws EncryptedDocumentException, InvalidFormatException, IOException{

		  
		  	String fileName = "Certificate.xlsx";
			response.setHeader("Content-disposition", "attachment; filename=" + fileName);

			InputStream fis = null;
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			fis = classloader.getResourceAsStream("template/Certificate.xlsx");
			
			org.apache.poi.ss.usermodel.Workbook workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheetAt(0);
			
			OutputStream out = response.getOutputStream();
			workbook.write(out);
			out.flush();

			fis.close();
			out.close();
			
			
			
			return null;
		  
            // return new ModelAndView(new ExcelView(), "type_report", 1);
      }
	

}
