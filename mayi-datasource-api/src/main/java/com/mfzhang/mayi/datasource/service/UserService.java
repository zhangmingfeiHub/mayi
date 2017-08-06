package com.mfzhang.mayi.datasource.service;

import com.mfzhang.mayi.datasource.bean.vo.UserInfoVo;

/**
 * 
 *
 * @author Guo YL 2017年6月18日 下午6:48:22
 */
public interface UserService {

	/**
	 * 
	 * @param userId
	 * @return
	 * @author mingfei.zhang 2017年8月6日 上午9:59:37
	 */
	UserInfoVo getUserInfoByUserId(Integer userId);
	
	/**
	 * 
	 * @param userInfoVo
	 * @author mingfei.zhang 2017年8月6日 上午9:59:48
	 */
	void insertUserInfo(UserInfoVo userInfoVo);
	
	/**
	 * 
	 * @param userInfoVo
	 * @author mingfei.zhang 2017年8月6日 上午9:59:54
	 */
	void updateUserInfo(UserInfoVo userInfoVo);
	
	/**
	 * 
	 * @param userInfoVo
	 * @author mingfei.zhang 2017年8月6日 上午9:59:58
	 */
	void deleteUserInfo(UserInfoVo userInfoVo);
	
}
