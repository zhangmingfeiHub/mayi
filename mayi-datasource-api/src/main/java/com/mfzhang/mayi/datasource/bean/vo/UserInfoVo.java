package com.mfzhang.mayi.datasource.bean.vo;

import java.io.Serializable;

/**
 * 用户信息Vo
 * 
 * @author mingfei.zhang 2017年8月6日 上午9:56:17
 */
public class UserInfoVo implements Serializable {

	/**
	 * 3027670248698460623L
	 * @author mingfei.zhang 2017年8月6日 上午9:56:04
	 */
	private static final long serialVersionUID = 3027670248698460623L;

	private Integer id;

    private String openId;

    private String mobilePhone;

    private Byte userType;

    private Integer parentId;

    private Integer agentsBusinessId;

    private Integer manuId;

    private String remark;

    private String idCard;

    private String rolesName;

    private String eSigned;

    private Byte deleteStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public Byte getUserType() {
		return userType;
	}

	public void setUserType(Byte userType) {
		this.userType = userType;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getAgentsBusinessId() {
		return agentsBusinessId;
	}

	public void setAgentsBusinessId(Integer agentsBusinessId) {
		this.agentsBusinessId = agentsBusinessId;
	}

	public Integer getManuId() {
		return manuId;
	}

	public void setManuId(Integer manuId) {
		this.manuId = manuId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getRolesName() {
		return rolesName;
	}

	public void setRolesName(String rolesName) {
		this.rolesName = rolesName;
	}

	public String geteSigned() {
		return eSigned;
	}

	public void seteSigned(String eSigned) {
		this.eSigned = eSigned;
	}

	public Byte getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Byte deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
	
}
