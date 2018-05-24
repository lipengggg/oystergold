package com.itoystergold.test;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.dubbo.common.json.JSON;
import com.itoystergold.service.DemoUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
public class Test {

	@Autowired
	private DemoUserService demoUserService;
	
	@org.junit.Test
	public void test() throws IOException {
		
		System.out.println(JSON.json(demoUserService.selectUser()));
	}
}
