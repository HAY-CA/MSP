/*
 * @Project Name: MSP-dependency
 * @File Name: ApiException
 * @Package Name: com.hay.msp.base.exception
 * @Date: 2017/6/30 20:28
 * @Creator: HAY
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.base.exception;

import com.hay.msp.base.constant.Message;

/**
 * TODO
 *
 * @author HAY
 * @date 2017/6/30 20:28
 * @see
 */
public class ApiException extends RuntimeException {

	private int code;
	private String msg;

	public ApiException(int code){
		this.code = code;
		this.msg = Message.getMessage(code);
	}

	public ApiException(int code,String msg){
		this.code = code;
		this.msg = msg;
	}

	public ApiException(){
		this.code = Message.RESULT_1;
		this.msg = Message.getMessage(Message.RESULT_1);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
