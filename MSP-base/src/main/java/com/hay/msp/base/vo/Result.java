/*
 * @Project Name: MSP-dependency
 * @File Name: Result
 * @Package Name: com.hay.msp.base.vo
 * @Date: 2017/6/27 21:11
 * @Creator: HAY
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.base.vo;

import com.hay.msp.base.constant.Message;

/**
 * 返回结果封装对象
 * @author HAY
 * @date 2017/6/27 21:11
 * @see
 */
public class Result<T> extends BaseEntity {

	private int code;
	private String msg;
	private T data;

	public Result(int code) {
		this.code = code;
		this.msg = Message.getMessage(code);
	}

	public Result(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Result(T data) {
		this.code = Message.RESULT_0;
		this.msg = Message.getMessage(Message.RESULT_0);
		this.data = data;
	}

	public Result(int code, T data) {
		this.code = code;
		this.msg = Message.getMessage(code);
		this.data = data;
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

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
