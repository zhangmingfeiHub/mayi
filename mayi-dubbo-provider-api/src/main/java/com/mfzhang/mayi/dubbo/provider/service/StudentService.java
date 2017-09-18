package com.mfzhang.mayi.dubbo.provider.service;

import com.mfzhang.mayi.common.ServiceResult;
import com.mfzhang.mayi.dubbo.provider.bean.Student;

/**
 * dubbo中台服务
 *
 * @author Guo YL 2017年9月18日 下午11:46:09
 */
public interface StudentService {

	/**
	 * 获取学生信息
	 * 
	 * @param id
	 * @return
	 * @author Guo YL 2017年9月18日 下午11:45:57
	 */
	ServiceResult<Student> getStudentInfoById(Integer id);
	
}
