package com.mfzhang.mayi.job;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.mfzhang.mayi.common.utils.LogUtils;

/**
 * web配置，相当于web.xml配置<br/>
 * 服务启动之后会自动调用
 *
 * @author Guo YL 2017年11月5日 下午5:48:28
 */
public class WebInitializer implements WebApplicationInitializer {

	private static final Logger logger = LoggerFactory.getLogger(WebInitializer.class);
	
	/**
	 * Spring容器启动之后就会被自动调用
	 * 
	 * @see org.springframework.web.WebApplicationInitializer#onStartup(javax.servlet.ServletContext)
	 * @author Guo YL 2017年11月5日 下午5:50:21
	 */
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		LogUtils.printLog(logger, Level.INFO, "=====web初始化=====");
		
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(WebConfig.class, WebMvcConfig.class);
        ctx.setServletContext(servletContext);
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
	}

}
