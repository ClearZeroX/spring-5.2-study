package com.zlc.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean {
	@Autowired
	TestBeanAutowired testBean;

	private String name = "hehe";

	public TestBean(String name) {
		this.name = name;
	}

	public TestBean() {
		System.out.println("哈哈");
	}

	@Override
	public String toString() {
		return "bean.TestBean{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		System.out.println(testBean.getName());
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}