package com.mfzhang.mayi.dubbo.provider.service;

import com.mfzhang.mayi.dubbo.provider.bean.UserInfo;

/**
 * 参数验证用<br/>
 *
 * @author Guo YL 2017年9月25日 上午12:44:18
 */
public interface UserInfoService {

	/**
	 * 保存
	 * 
	 * @param userInfo
	 * @author Guo YL 2017年9月25日 上午12:45:57
	 */
	@interface Save{} // 与方法同名接口，首字母大写，用于区分验证场景
	void save(UserInfo userInfo);
	
	/**
	 * 修改
	 * 
	 * @param userInfo
	 * @author Guo YL 2017年9月25日 上午12:46:15
	 */
	void update(UserInfo userInfo);
	
	/**
	 * 删除
	 * 
	 * @param userId
	 * @author Guo YL 2017年9月25日 上午12:46:41
	 */
	void deleteById(Long userId);
	
}
