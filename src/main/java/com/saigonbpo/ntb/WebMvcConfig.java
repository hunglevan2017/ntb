package com.saigonbpo.ntb;

import java.util.Locale;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.annotation.Order;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.MultipartFilter;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

	/*
	 * @Bean(name = "localeResolver") public LocaleResolver getLocaleResolver() {
	 * CookieLocaleResolver resolver = new CookieLocaleResolver();
	 * System.out.println(111); resolver.setCookieDomain("myAppLocaleCookie");
	 * resolver.setDefaultLocale(new Locale("vi", "VN")); // 60 minutes
	 * resolver.setCookieMaxAge(60 * 60); return resolver; }
	 * 
	 * 
	 * 
	 * @Override public void addInterceptors(InterceptorRegistry registry) {
	 * LocaleChangeInterceptor localeInterceptor = new LocaleChangeInterceptor();
	 * localeInterceptor.setParamName("lang");
	 * 
	 * registry.addInterceptor(localeInterceptor).addPathPatterns("/**");
	 * 
	 * registry.addInterceptor(new
	 * AuthenticationInterceptor()).addPathPatterns("/**");
	 * 
	 * 
	 * }
	 */

	@Bean(name = "messageSource")
	public MessageSource getMessageResource() {
		ReloadableResourceBundleMessageSource messageResource = new ReloadableResourceBundleMessageSource();

		// Read i18n/messages_xxx.properties file.
		// For example: i18n/messages_en.properties
		messageResource.setBasename("classpath:/messages");
		messageResource.setDefaultEncoding("UTF-8");
		// messageResource.setUseCodeAsDefaultMessage(true);
		return messageResource;
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		// Do any additional configuration here
		return builder.build();
	}

	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
		sessionLocaleResolver.setDefaultLocale(new Locale("vi", "VN"));
		return sessionLocaleResolver;
	}

	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
		localeChangeInterceptor.setParamName("lang");
		localeChangeInterceptor.setIgnoreInvalidLocale(true);
		return localeChangeInterceptor;
	}

	@Override
	public void addInterceptors(InterceptorRegistry interceptorRegistry) {
		interceptorRegistry.addInterceptor(localeChangeInterceptor());
		interceptorRegistry.addInterceptor(new AuthenticationInterceptor()).addPathPatterns("/**");

	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
				
		/*Windows*/
		registry.addResourceHandler("/webjars/**", "/component/**", "/css/**", "/fonts/**", "/images/**", "/js/**","/disk/**")
				.addResourceLocations("classpath:/META-INF/resources/webjars/", "classpath:/static/component/",
						"classpath:/static/css/", "classpath:/static/fonts/", "classpath:/static/images/",
						"classpath:/static/js/","file:D:/xampp/tomcat//webapps/seagull/resources/assets/uploads/");
		/**/

		/*Linux* /
		registry.addResourceHandler("/webjars/**", "/component/**", "/css/**", "/fonts/**", "/images/**", "/js/**","/disk/**")
				.addResourceLocations("classpath:/META-INF/resources/webjars/", "classpath:/static/component/",
						"classpath:/static/css/", "classpath:/static/fonts/", "classpath:/static/images/",
						"classpath:/static/js/","file:/usr/data/uploads/");
		/**/

		
		
		
	}
	



}
