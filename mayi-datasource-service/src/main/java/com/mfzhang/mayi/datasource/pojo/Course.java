package com.mfzhang.mayi.datasource.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * 
 * @author mingfei.zhang 2017年8月6日 下午4:58:21
 */
public class Course implements Serializable {

	/**
	 * 
	 * @author mingfei.zhang 2017年8月6日 下午4:59:34
	 */
	private static final long serialVersionUID = 7584292675677606223L;

	private Integer id;
	private String courseName;
	private BigDecimal score;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

}
