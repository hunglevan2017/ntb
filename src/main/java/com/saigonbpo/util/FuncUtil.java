package com.saigonbpo.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.springframework.web.servlet.ModelAndView;

import com.saigonbpo.ntb.Service.AppService;

public class FuncUtil {
	public static String encodeCredentials(String username, String password) {
		String cred = username + ":" + password;
		String encodedValue = null;
		byte[] encodedBytes = Base64.encodeBase64(cred.getBytes());
		encodedValue = new String(encodedBytes);
		System.out.println("encodedBytes " + new String(encodedBytes));

		byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
		System.out.println("decodedBytes " + new String(decodedBytes));

		return encodedValue;

	}
	public static void load_master_data(String code, ModelAndView mav, String var_name_master_data_in_view,AppService appService) {
		Map<String, Object> input_master_data = new HashMap<>();
		input_master_data.put("code", code);
		List<Map<String, Object>> list_master_data = appService.SP_LOV_GET(input_master_data);
		// logger.info(var_name_master_data_in_view + ":" + list_master_data);
		mav.addObject(var_name_master_data_in_view, list_master_data);

	}
}
