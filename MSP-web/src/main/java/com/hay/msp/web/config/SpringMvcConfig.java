/*
 * @Project Name: MSP-dependency
 * @File Name: SpringMvcConfig
 * @Package Name: com.hay.msp.web.config
 * @Date: 2017/7/1 12:32
 * @Creator: HAY
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.web.config;

import com.hay.msp.web.interceptor.PermissionsInterceptor;
import com.hay.msp.web.interceptor.UserLoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器配置
 * @author HAY
 * @date 2017/7/1 12:32
 * @see
 */
@Configuration
public class SpringMvcConfig extends WebMvcConfigurerAdapter {

	@Autowired
	UserLoginInterceptor userLoginInterceptor;
	@Autowired
	PermissionsInterceptor permissionsInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(userLoginInterceptor).addPathPatterns("/v1/user/*");
		registry.addInterceptor(permissionsInterceptor).addPathPatterns("/v1/user/*");
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
}
