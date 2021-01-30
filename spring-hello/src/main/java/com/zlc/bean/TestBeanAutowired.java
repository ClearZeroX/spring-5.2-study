package com.zlc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBeanAutowired {

	@Autowired
	TestBean testBean;
	private String name = "hehe";


	@Override
	public String toString() {
		return "bean.TestBean{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}