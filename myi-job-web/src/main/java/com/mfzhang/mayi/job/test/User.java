package com.mfzhang.mayi.job.test;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 *
 * @author Guo YL 2017年11月8日 下午11:21:19
 */
public class User implements Serializable {

	/**
	 * -7185786329875897310L
	 */
	private static final long serialVersionUID = -7185786329875897310L;

	private Integer id;
	private String name;
	private Date birth;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

}
