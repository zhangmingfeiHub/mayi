package com.mfzhang.mayi.dubbo.provider.bean;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.mfzhang.mayi.common.constants.CommonConstants;
import com.mfzhang.mayi.dubbo.provider.service.UserInfoService;

/**
 * 
 *
 * @author Guo YL 2017年9月25日 上午12:33:19
 */
public class UserInfo implements Serializable {

	/**
	 * 3243242971913976251L
	 */
	private static final long serialVersionUID = 3243242971913976251L;

	private Long userId;
	
	@NotBlank
	@Size(min = 1, max = 20)
	private String userName;
	
	@Min(18)
	@Max(100)
	private Integer age;
	
	private Byte sex; // 1->男 0->女 -1->未知
	
	@NotNull(groups = UserInfoService.Save.class) // 分组验证,save时不能为空, update则不要求
	@Pattern(regexp = CommonConstants.RegExp.EMAIL)
	private String email;
	
	@Past
	private Date loginDate; // 一个过去时间
	
	@Future
	private Date expiryDate; // 一个未来时间

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Byte getSex() {
		return sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", age=" + age + ", sex=" + sex + ", email="
				+ email + ", loginDate=" + loginDate + ", expiryDate=" + expiryDate + "]";
	}

}
