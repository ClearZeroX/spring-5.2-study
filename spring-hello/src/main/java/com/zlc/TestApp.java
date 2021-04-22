package com.zlc;

import com.zlc.bean.MyBean;
import com.zlc.bean.TestBean;
import org.junit.Test;
import org.springframework.context.annotation.*;

public class TestApp {
	@Test
	public void MyTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.zlc.bean");
//		TestBean bean = context.getBeanFactory().getBean(TestBean.class, false);
//		TestBean bean1 = (TestBean) context.getBean("testBean");
//		TestBean bean2 = (TestBean) context.getBean("testBean");
//		System.out.println(bean == bean1);
//		System.out.println(bean1 == bean2);
//		bean1.getName();

		MyBean myBean = context.getBean("myBean", MyBean.class);
//		MyBean myBean2 = context.getBean("myBean", MyBean.class);
//		System.out.println(myBean == myBean2);
		System.out.println(myBean);
	}
}