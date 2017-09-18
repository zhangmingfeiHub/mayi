package com.mfzhang.mayi.common;

import java.io.Serializable;

import com.mfzhang.mayi.common.constants.StateCodeEnum;

/**
 * 结果公共类
 *
 * @author Guo YL 2017年9月12日 上午12:12:18
 */
public class ServiceResult<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -136688858518173974L;
	
	private boolean ok; // 成功失败
	private String code; // 信息码
	private String message; // 返回信息
	private T data; // 返回数据

	public void success (T data) {
		this.ok = true;
		this.code = StateCodeEnum.CODE_SUCCESS.getCode();
		this.message = StateCodeEnum.CODE_SUCCESS.toString();
		this.data = data;
	}
	
	public void success(String message, T data) {
		this.ok = true;
		this.code = StateCodeEnum.CODE_SUCCESS.getCode();
		this.message = message;
		this.data = data;
	}
	
	public void fail(String code, String message) {
		fail(code, message, null);
	}

	public void fail(String code, String message, T data) {
		this.ok = false;
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	public void doRes(boolean ok, String code, String message, T data) {
		this.ok = ok;
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}

	public String getCode() {
		return ok ? StateCodeEnum.CODE_SUCCESS.getCode() : this.code;
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
