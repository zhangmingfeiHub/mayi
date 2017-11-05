package com.mfzhang.mayi.job;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * 
 *
 * @author Guo YL 2017年11月5日 下午4:16:16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextHierarchy(value = {
		@ContextConfiguration(classes = {WebConfig.class}, name = "parent"),
		@ContextConfiguration(classes = {WebMvcConfig.class}, name = "child")
})
public abstract class BaseTest {

	@Autowired  
    private WebApplicationContext wac;  
    public MockMvc mockMvc;
    
    @Before  
    public void setUp() {  
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();  
    } 
	
}
