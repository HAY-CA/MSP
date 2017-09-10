/*
 * @Project Name: MSP-dependency
 * @File Name: ApiOriginFilter
 * @Package Name: com.hay.msp.web.interceptor
 * @Date: 2017/6/30 20:45
 * @Creator: HAY
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.web.interceptor;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 跨域过滤器
 *
 * @author HAY
 * @date 2017/6/30 20:45
 * @see
 */
@WebFilter(filterName = "corsFilter",urlPatterns = "/*")
public class ApiOriginFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletResponse res = (HttpServletResponse) response;
		res.addHeader("Access-Control-Allow-Origin", "*");
		res.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
		res.addHeader("Access-Control-Allow-Headers", "Content-Type");
		filterChain.doFilter(request, response);
	}

	public void destroy() {
	}
}
