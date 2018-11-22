package com.zebra.print;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.zebra.print.constants.Constants;

/**
 * 打印服务本地WebService,启动三个路径来处理各种打印相关请求 目前共三种： 1 PrinterConfigEndPoint
 * 默认打印机设置、获取打印机列表 2 PrintEndPoint 直接打印，输入模版名称，以及模版匹配的参数值，以及一些打印字体等设置 3
 * PrintPreviewPoint 打印预览，上面的打印按钮默认不打印背景 默认的Local Socket 端口号:9035
 * 本服务使用jws打包成可执行文件，安装为windows服务，并且自带JRE，防止无法调用。
 */

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@EnableScheduling
public class Application  implements EmbeddedServletContainerCustomizer{
	static int DEFAULT_PORT = 9035;
	private static boolean headless = false;
	private static Logger logger = LoggerFactory.getLogger(Application.class);


	/**
	 * 设置系统属性java.awt.headless，
	 * 因为我们开发的是服务器程序，一般运行在没有显示器和键盘的环境。由于打
	 * 印程序会调用awt的一些依赖与显示器和键盘，需要关闭headless，因此该属
	 * 性会被设置为false，
	 * 
	 */
	public static void main(String[] args) {
		
		 logger.info("user.dir:"+Constants.PROJECT_DIR);
		 SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
		 builder.headless(headless).run(args);
		
	}
	
	public void customize(ConfigurableEmbeddedServletContainer serverConfig) {
		// TODO Auto-generated method stub
		serverConfig.setPort(DEFAULT_PORT);
	}
	
}
