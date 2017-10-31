package com.mfzhang.mayi.common;

import java.io.Serializable;

import com.mfzhang.mayi.common.constants.StateCodeEnum;

/**
 * 
 *
 * @author Guo YL 2017年10月31日 下午10:09:00
 */
public class WebResult<T> implements Serializable {

	/**
	 * -3670598573050966018L
	 */
	private static final long serialVersionUID = -3670598573050966018L;

	private boolean isOk;
	private String code;
	private String message;
	private T data;

	public void success(T data){
		success(StateCodeEnum.CODE_SUCCESS.getCode(), StateCodeEnum.CODE_SUCCESS.getMessage(), data);
	}
	
	public void success(String code, String message, T data) {
		doRes(true, code, message, data);
	}
	
	public void doRes(boolean isOk,String code, String message, T data){
		this.isOk = isOk;
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public void fail(String code, String message) {
		doRes(false, code, message, null);
	}
	
	public boolean isOk() {
		return isOk;
	}

	public void setOk(boolean isOk) {
		this.isOk = isOk;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
