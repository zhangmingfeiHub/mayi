package com.mfzhang.mayi.valid.test;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * 
 * 
 * @author mingfei.zhang 2017年11月22日 下午3:45:31
 */
public class Phone implements Serializable {

	/**
	 * -8115354198933156129L
	 * 
	 * @author mingfei.zhang 2017年11月22日 下午3:45:24
	 */
	private static final long serialVersionUID = -8115354198933156129L;

	@NotNull(message = "电话id不能为空")
	private Integer id;
	private String content;
	private Integer type;

	public Phone() {}
	
	public Phone(@NotNull(message = "电话id不能为空") Integer id, String content, Integer type) {
		super();
		this.id = id;
		this.content = content;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}
