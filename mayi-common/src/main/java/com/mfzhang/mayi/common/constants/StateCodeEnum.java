package com.mfzhang.mayi.common.constants;

/**
 * 状态码
 *
 * @author Guo YL 2017年9月12日 上午12:16:37
 */
public enum StateCodeEnum {

	/** MY200:成功 */
	CODE_SUCCESS("MY200", "成功"),
	
	/** MY300:失败 */
	CODE_FAIL("MY300", "失败"),
	
	/** MY00001:参数错误 */
	CODE_ERROR_PARAM("MY00001", "参数错误");
	
	private String code;
	private String message;
	
	private StateCodeEnum(String code, String message) {
		this.code = code;
		this.message = message;
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
	
	public String toString() {
		return "[" + this.code + "]" + this.message;
	}
	
}
