package com.saigonbpo.util;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.google.gson.reflect.TypeToken;

/**
 * Created by hunglv on 10/07/2017.
 */

@Configuration
@PropertySource("classpath:config.properties")
@ComponentScan
public class DBConstant {


	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	// Solution for singleton pattern
    private static class LazyHolder {
        private static final DBConstant INSTANCE = new DBConstant();
    }

    public static DBConstant getInstance() {
        return LazyHolder.INSTANCE;
    }

	/**
	 * GENERAL STATUS FOR NORTIFY MESSAGE
	 */
	public static final String SUCCESS = "success";
	public static final String FAILED = "fail";
	public static final String ERROR = "ERROR";

	/**
	 * CONSTANTS FOR LOGIN
	 */
	public static final String MSG_SUCCESS_LOGIN = "LOGIN SUCCESSFUL";
	public static final String MSG_ERROR_LOGIN = "LOGIN FAILED";
	public static final String MSG_ERROR_LOGIN_USER_NOT_EXIST_IN_DB = "USER NOT EXIST IN DATABASE";
	public static final String MSG_ERROR_LOGIN_USER_EXPIRED = "USER HAS EXPIRED, PlEASE CONTACT ADMIN";
	public static final String MSG_ERROR_LOGIN_USER_PWD_NOT_CORRECT = "PASSWORD NOT CORRECT";

	/**
	 * CONSTANTS FOR CRUD
	 */
	public static final String MSG_SUCCESS_INSERT = "INSERT SUCCESS";
	public static final String MSG_SUCCESS_DELETE = "DELETE SUCCESS";
	public static final String MSG_SUCCESS_UPDATE = "DELETE SUCCESS";

	public static final String MSG_ERROR_INSERT = "INSERT ERROR";
	public static final String MSG_ERROR_DELETE = "DELETE ERROR";

	public static final String PROFILE_SUCCESS = "PROFILE_SUCCESS";
	public static final String MSG_ERROR_PROFILE_NAME_NOT_CORRECT = "MSG_ERROR_PROFILE_NAME_NOT_CORRECT";

	public static final Type typeMap = new TypeToken<Map<String, String>>() {
	}.getType();
	public static final Type typeListMap = new TypeToken<List<Map<String, String>>>() {
	}.getType();
	
	
	public static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


	// API For only Upload
	@Value("${PATH_UPLOAD_SERVER_TEMP}")
	public static String PATH_UPLOAD_SERVER_TEMP;
	
	 private static final String pattern = "yyyyMMddhhmmss";
	 private static final DateFormat dateFormat = new SimpleDateFormat(pattern);  
	 
	 public static String getNameNowDateForFile() {
		 return dateFormat.format(new Date());
	 }
	 

}
