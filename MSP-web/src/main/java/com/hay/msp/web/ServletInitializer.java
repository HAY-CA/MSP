/*
 * @Project Name: MSP-dependency
 * @File Name: ServletInitializer
 * @Package Name: com.hay.msp.web
 * @Date: 2017/6/27 21:35
 * @Creator: HAY
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.web;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 使用外部服务器启动进行应用初始化
 *
 * @author HAY
 * @date 2017/6/27 21:35
 * @see
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SwaggerSpringBoot.class);
    }
}
