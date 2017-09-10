/*
 * @Project Name: MSP-dependency
 * @File Name: UserLoginInterceptor
 * @Package Name: com.hay.msp.web.interceptor
 * @Date: 2017/7/1 12:31
 * @Creator: HAY
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.web.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户登陆拦截器
 *
 * @author HAY
 * @date 2017/7/1 12:31
 * @see
 */
@Component
public class UserLoginInterceptor implements HandlerInterceptor {

	private static final Logger logger = LoggerFactory.getLogger(UserLoginInterceptor.class);

	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o)
			throws Exception {

		logger.info("登陆拦截");

		return true;
	}

	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
			ModelAndView modelAndView) throws Exception {
		logger.info("登陆拦截");
	}

	public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Object o, Exception e) throws Exception {
	}
}
