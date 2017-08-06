package com.mfzhang.mayi.datasource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mfzhang.mayi.datasource.config.WebConfig;

/**
 * 测试类-基类
 * 
 * @author mingfei.zhang 2017年8月6日 上午10:34:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={WebConfig.class})
public abstract class BaseTest {

}
