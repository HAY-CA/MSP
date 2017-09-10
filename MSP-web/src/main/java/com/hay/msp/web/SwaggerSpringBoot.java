/*
 * @Project Name: MSP-dependency
 * @File Name: SwaggerSpringBoot
 * @Package Name: com.hay.msp.web
 * @Date: 2017/6/27 21:36
 * @Creator: HAY
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.web;

import com.hay.msp.base.vo.Result;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 启动入口
 *
 * @author HAY
 * @date 2017/6/27 21:36
 * @see
 */
@SpringBootApplication
@EnableSwagger2
@EnableWebMvc
@ComponentScan("com.hay.msp")
public class SwaggerSpringBoot {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerSpringBoot.class, args);
	}

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.genericModelSubstitutes(Result.class)
				.useDefaultResponseMessages(false)  //禁止默认的响应
				.forCodeGeneration(false)
				.select()
				.build()
				.apiInfo(apiInfo());   //这里配置apiinfo
	}

	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfoBuilder()
				.title("RESTful API文档")
				.description("使用spring boot和swagger2构建")
				.license(null)
				.contact("HAY")
				.version("1.0")
				.build();
		return apiInfo;
	}
}
