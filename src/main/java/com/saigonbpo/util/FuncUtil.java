package com.saigonbpo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;

import com.saigonbpo.ntb.Service.AppService;
import com.saigonbpo.ntb.controller.AppController;

public class FuncUtil {

	// Log
	static Logger logger = LoggerFactory.getLogger(FuncUtil.class);

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

	public static void load_master_data(String code, ModelAndView mav, String var_name_master_data_in_view,
			AppService appService) {
		Map<String, Object> input_master_data = new HashMap<>();
		input_master_data.put("code", code);
		List<Map<String, Object>> list_master_data = appService.SP_LOV_GET(input_master_data);
		logger.info(var_name_master_data_in_view + ":" + list_master_data);
		mav.addObject(var_name_master_data_in_view, list_master_data);

	}

	public static void removeEmptyStringColumn(Map<String, Object> condition) throws JSONException {
		// TODO Auto-generated method stub
		JSONObject json = new JSONObject(condition);
		System.out.printf("JSON: %s", json.toString(2));

		for (Map.Entry<String, Object> entry : condition.entrySet()) {
			if ("".equals(entry.getValue()))
				condition.put(entry.getKey(), null);
		}

	}

	private static MissingCellPolicy xRow;

	public static void setCellValH(String val, Sheet sheet, int row, int cell, CellStyle cellStyle) {
		row = row - 1;
		cell = cell - 1;
		Row r = sheet.getRow(row);
		r = r != null ? r : sheet.createRow(row);

		Cell c = r.getCell(cell, xRow.CREATE_NULL_AS_BLANK);
		c = c != null ? c : r.createCell(cell);
		if (cellStyle != null)
			c.setCellStyle(cellStyle);

		c.setCellValue(val);
	}

	public static String modifyDateLayout(String inputDate) throws ParseException {
		Date date = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzzz yyyy", Locale.ENGLISH).parse(inputDate);
		return new SimpleDateFormat("dd/MM/yyyy").format(date);
	}

	public static String formatDateToYYYYMMDD(String string) {
		// TODO Auto-generated method stub
		String[] ArrayNgaySinh = string.split("-");
		String output = ArrayNgaySinh[2] + "/" + ArrayNgaySinh[1] + "/" + ArrayNgaySinh[0];
		return output;
	}
}
