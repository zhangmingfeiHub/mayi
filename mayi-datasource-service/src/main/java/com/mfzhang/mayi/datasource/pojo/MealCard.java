package com.mfzhang.mayi.datasource.pojo;

import java.io.Serializable;

/**
 * 
 * 
 * @author mingfei.zhang 2017年8月6日 下午4:57:54
 */
public class MealCard implements Serializable {

	/**
	 * 
	 * @author mingfei.zhang 2017年8月6日 下午4:59:03
	 */
	private static final long serialVersionUID = 291456117236288111L;

	private Integer id;
	private String cardNo;
	
	public MealCard() {
		
	}

	public MealCard(Integer id, String cardNo) {
		super();
		this.id = id;
		this.cardNo = cardNo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

}
