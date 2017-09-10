/*
 * @Project Name: MSP-dependency
 * @File Name: ServiceInterceptor
 * @Package Name: com.hay.msp.web.interceptor
 * @Date: 2017/6/27 22:38
 * @Creator: HAY
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.web.handle;

import com.hay.msp.base.constant.Message;
import com.hay.msp.base.vo.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

/**
 * 参数异常统一处理
 *
 * @author HAY
 * @date 2017/6/27 22:38
 * @see
 */
@ControllerAdvice
@ResponseBody
@Order(0)
public class VaildExceptionHandle {

	private static final Logger logger = LoggerFactory.getLogger(VaildExceptionHandle.class);

	/**
	 * 参数类型异常
	 * @date 2017/6/29 21:30
	 * @author HAY
	 * @since 1.0.0
	 *
	*/
	@ExceptionHandler(value = MethodArgumentTypeMismatchException.class)
	public Result paramsTypeException(MethodArgumentTypeMismatchException exception){
		String message = "参数类型错误[" + exception.getRequiredType().getSimpleName() + "@" + exception.getName() + ":" + exception.getValue() +"]";
		logger.error(message);
		return new Result(Message.RESULT_2,message);
	}

	/**
	 * 参数匹配异常
	 * @date 2017/6/29 21:30
	 * @author HAY
	 * @since 1.0.0 
	 *
	*/
	@ExceptionHandler(value = MissingServletRequestParameterException.class)
	public Result requestParamsException(MissingServletRequestParameterException exception){
		String messae = "参数错误[" + exception.getParameterName() + "@" + exception.getParameterType() + "]";
		logger.error(messae);
		return new Result(Message.RESULT_2,messae);
	}
	
	
	/**
	 * 请求找不到方法异常
	 * @date 2017/6/30 20:17
	 * @author HAY
	 * @since 1.0.0 
	 *
	*/
	@ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
	public Result methodNotSupport(HttpRequestMethodNotSupportedException exception){
		return new Result(Message.RESULT_3);
	}


}
