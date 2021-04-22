package com.zlc.bean;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : zlc
 * @create : 2021-04-22 14:44
 * @desc :
 **/
//@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
@Component
public class MyBean {

	private Integer age = 18;
	private String name;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyBean{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}
}
