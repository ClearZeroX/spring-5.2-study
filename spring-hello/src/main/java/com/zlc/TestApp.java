package com.zlc;

import com.zlc.bean.TestBean;
import org.junit.Test;
import org.springframework.context.annotation.*;

public class TestApp {
	@Test
	public void MyTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.zlc.bean");
		TestBean bean = context.getBeanFactory().getBean(TestBean.class, false);
		System.out.println(bean.getName());
	}
}