package com.saigonbpo.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.saigonbpo.Oauth2Util.OAuth2Details;
import com.saigonbpo.Oauth2Util.OAuthConstants;
import com.saigonbpo.Oauth2Util.OAuthUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by hunglv on 11/07/2017.
 */
@Configuration
@PropertySource(value = { "classpath:application.properties" })
public class CallAPI {
	static Logger logger = LoggerFactory.getLogger(CallAPI.class);

	/**
	 * @param BaseAPI
	 *            ex:
	 *            "{\"cc_code\":\"cc_code_data\",\"cc_password\":\"cc_password_data\"}";
	 * @param BaseAPI
	 *            ex: LookupChannel
	 * @param API
	 *            ex: loginLookupChannel
	 * @param requestMethod
	 *            ex: POST, GET
	 * @return
	 */

	public static Map<String,Object>  authentication(String username, String password) {
		// Load the properties file
		Properties config = OAuthUtils.getClientConfigProps(OAuthConstants.CONFIG_FILE_PATH);
		

		// Generate the OAuthDetails bean from the config properties file
		OAuth2Details oauthDetails = OAuthUtils.createOAuthDetails(config);
		oauthDetails.setUsername(username);
		oauthDetails.setPassword(password);
		

		// Validate Input
		if (!OAuthUtils.isValidInput(oauthDetails)) {
			System.out.println("Please provide valid config properties to continue.");
			System.exit(0);
		}
		
		Map<String,Object> accessToken=null;
		
		if(oauthDetails.isAccessTokenRequest()){
			//Generate new Access token
			accessToken = OAuthUtils.getAccessToken(oauthDetails);
		}

		return accessToken;

	}

	public static String call(String data, String BaseAPI, String API, String requestMethod) {
		HttpURLConnection conn = null;
		try {

			String WS = PropertiesCache.getInstance().getProperty("WS1");
			URL url = url = new URL(WS + BaseAPI + "/" + API);
			logger.info(requestMethod + ":  " + WS + BaseAPI + "/" + API);

			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod(requestMethod);
			conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");

			// Send post request
			if (!StringUtils.isEmpty(data)) {

				conn.setDoOutput(true);
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream(), "UTF-8"));
				bw.write(data);
				bw.flush();
				bw.close();

				/*
				 * Old DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
				 * wr.writeBytes(data); wr.flush(); wr.close();
				 */
			}

			/**
			 * Check Conn is Error
			 */
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			// Get data from API
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			// Loop BufferedReader
			String result = "";
			String output;
			while ((output = br.readLine()) != null) {
				result += output;
			}

			return result;
		} catch (Exception e) {
			logger.info(e.toString());
			e.printStackTrace();
		} finally {
			conn.disconnect();
		}
		return null;
	}
	
	//
	public static String initURI (String RootEndPoint,String Function,HttpServletRequest request)
	{
		//Get Session Login
		Map<String, Object> loginInfo = (Map<String, Object>) request.getSession().getAttribute("loginInfo");

		//Init Link Web Service & Rest Template
		String token = loginInfo.get("token").toString();
		
		String WS = PropertiesCache.getInstance().getProperty("WS1")  + RootEndPoint + "/" + Function + "?access_token=" + token;
		logger.info("WS: " + WS);
		return WS;
	}
	
	

	

}
