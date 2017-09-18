package com.mfzhang.mayi.dubbo.provider.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mfzhang.mayi.common.ServiceResult;
import com.mfzhang.mayi.common.utils.CommonUtils;
import com.mfzhang.mayi.common.utils.LogUtils;
import com.mfzhang.mayi.dubbo.provider.bean.Student;

@Service(protocol={"rmi"})
public class StudentServiceImpl implements StudentService {

	private static final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);
	
	/*@Autowired
	private Student student;*/
	/*@Autowired
	private ObjectMapper objectMapper;*/
	
	@Override
	public ServiceResult<Student> getStudentInfoById(Integer id) {
		LogUtils.printLog(logger, Level.INFO, "入参={}", id);
		ServiceResult<Student> serviceResult = new ServiceResult<Student>();
		ObjectMapper objectMapper = new ObjectMapper();
		Student student = new Student();
		student.setStuId(100);
		student.setStuName(student.getStuId() + "-name");
		
		LogUtils.printLog(logger, Level.INFO, "返回结果={}", CommonUtils.writeValueAsString(objectMapper, student));
		serviceResult.success(student);
		return serviceResult;
	}

}
