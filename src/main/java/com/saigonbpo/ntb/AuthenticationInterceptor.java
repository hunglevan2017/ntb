package com.saigonbpo.ntb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import com.saigonbpo.ntb.controller.AppController;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by hunglv on 11/07/2017.
 */

public class AuthenticationInterceptor extends HandlerInterceptorAdapter {

	Logger logger = LoggerFactory.getLogger(AuthenticationInterceptor.class);

	 
	 private boolean isResourceHandler(Object handler)
     {
         return handler instanceof ResourceHttpRequestHandler;
     }
	 

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    	if(isResourceHandler(handler))
    		return true;
        String uri = request.getRequestURI();
        
        //logger.info(uri);
  
        Map<String,Object> loginInfo = (Map<String,Object>) request.getSession().getAttribute("loginInfo");
        //logger.info("uri:" + uri + "(" + uri.length() + ")");
        if (!uri.contains("/login") && !uri.endsWith("/logout") && !uri.endsWith("/forgotPassword")  ) {
            if (loginInfo == null && !uri.contains("/login") ) {
                response.sendRedirect(request.getContextPath() + "/login");
                
                
                return false;
            }
            else
            	return true;
        }
        
        
//        if(uri.endsWith("/error"))
//        {
//        	 response.sendRedirect(request.getContextPath() + "/login");
//             
//             
//             return false;
//        }
        
        
        return true;
    }


}
