package com.mfzhang.mayi.dubbo.consumer.service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mfzhang.mayi.dubbo.consumer.config.AppConfig;

/**
 * 测试基类
 * 
 * @author mingfei.zhang 2017年9月12日 下午5:53:17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public abstract class BaseServiceTest {

}
