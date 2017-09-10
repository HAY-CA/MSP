/*
 * @Project Name: MSP-dependency
 * @File Name: ServiceInterceptor
 * @Package Name: com.hay.msp.web.interceptor
 * @Date: 2017/6/30 20:32
 * @Creator: HAY
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.web.handle;

import com.hay.msp.base.constant.Message;
import com.hay.msp.base.exception.ApiException;
import com.hay.msp.base.vo.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理
 *
 * @author HAY
 * @date 2017/6/30 20:32
 * @see
 */
@ResponseBody
@ControllerAdvice
public class ServiceExceptionHandle {

	private static final Logger logger = LoggerFactory.getLogger(ServiceExceptionHandle.class);


	@ExceptionHandler(value = ApiException.class)
	public Result doApiExcepion(ApiException exception){
		logger.error("业务异常["+exception.getMsg()+"]");
		return new Result(exception.getCode(),exception.getMsg());
	}


	@ExceptionHandler(value = Exception.class)
	public Result doException(Exception exception){
		exception.printStackTrace();
		return new Result(Message.RESULT_ERR);
	}


}
