package com.mfzhang.mayi.datasource.MBG;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * mybatis 代码自动生成工具(MyBatis Generator)
 *
 * @author Guo YL 2017年6月21日 下午10:33:41
 */
public class MBG {
	
	private static final Logger logger = LoggerFactory.getLogger(MBG.class);

	public static void main(String[] args) {
		
		try {
			System.out.println(System.getProperty("user.dir"));
			File directory = new File("");// 参数为空
	        String courseFile = directory.getCanonicalPath();
			System.out.println(courseFile);
			
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			// File configFile = new File("D:\\work\\proj\\git\\mayi\\mayi-datasource-service\\src\\test\\resources\\generatorConfig.xml");
			// String file = "D:\\work\\proj\\git\\mayi\\mayi-datasource-service\\src\\test\\resources\\generatorConfig3.xml";
			// String file = "E:\\mingfei.zhang\\work\\git repo\\mayi\\mayi-datasource-service\\src\\test\\resources\\generatorConfig3.xml";
			String configFileStr = System.getProperty("user.dir") + "/src/test/resources/generatorConfig3.xml";
			File configFile = new File(configFileStr);
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(configFile);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(null);
		} catch (Exception e) {
			logger.error("MBG自动生成代码发生异常", e);
		}
		
	}
	
}
