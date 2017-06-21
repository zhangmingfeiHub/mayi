package com.mfzhang.mayi.datasource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mfzhang.mayi.datasource.config.WebConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebConfig.class)
public class TestSpring {

	@Autowired
	private User user;
	
	@Test
	public void test() {
		System.out.println(user);
	}
	
}
