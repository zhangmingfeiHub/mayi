package com.mfzhang.mayi.job;

import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

/**
 * 
 *
 * @author Guo YL 2017年11月5日 下午4:16:22
 */
public class MyJobTest extends BaseTest {

	@Test
	public void testDoJob() throws Exception {
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/job/do").param("a", "AAA"))
		.andDo(MockMvcResultHandlers.print())
		.andReturn();
		
		// System.out.println(CommonUtils.writeValueAsString(result));
	}
	
	
	
}
