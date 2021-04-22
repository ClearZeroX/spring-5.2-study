package com.zlc.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TestBean {
	@Autowired
	TestBeanAutowired testBeanAutowired;

	private String name = "hehe";

	public TestBean(String name) {
		this.name = name;
	}

	public TestBean() {
		System.out.println("construct 实例化");
	}

	@Override
	public String toString() {
		return "bean.TestBean{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		System.out.println(testBeanAutowired.getName());
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}