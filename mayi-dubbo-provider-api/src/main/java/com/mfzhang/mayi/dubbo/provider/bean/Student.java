package com.mfzhang.mayi.dubbo.provider.bean;

import java.io.Serializable;

/**
 * 
 * 
 * @author mingfei.zhang 2017年9月12日 下午7:05:53
 */
public class Student implements Serializable {

	/**
	 * -2893163288576724692L
	 * 
	 * @author mingfei.zhang 2017年9月12日 下午7:05:46
	 */
	private static final long serialVersionUID = -2893163288576724692L;

	private Integer stuId;
	private String stuName;
	
	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

}
