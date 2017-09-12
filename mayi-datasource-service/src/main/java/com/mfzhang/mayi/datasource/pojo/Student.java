package com.mfzhang.mayi.datasource.pojo;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

/**
 * 
 * 
 * @author mingfei.zhang 2017年8月6日 下午4:55:29
 */
public class Student implements Serializable {

	/**
	 * 
	 * @author mingfei.zhang 2017年8月6日 下午4:58:45
	 */
	private static final long serialVersionUID = -2507224947004948670L;
	
	@Value("${mayi.student.id}")
	private Integer id;
	@Value("${mayi.student.name:NAME1200}")
	private String name;

	private MealCard mealCard; // 餐卡
	private List<Course> courseList; // 所修课程
	
	public Student() {
		super();
	}

	public Student(Integer id, String name, MealCard mealCard, List<Course> courseList) {
		super();
		this.id = id;
		this.name = name;
		this.mealCard = mealCard;
		this.courseList = courseList;
	}

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

	public MealCard getMealCard() {
		return mealCard;
	}

	public void setMealCard(MealCard mealCard) {
		this.mealCard = mealCard;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

}
