package com.zlc.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * https://blog.csdn.net/caihaijiang/article/details/35552859
 * BeanPostProcessor，可以在spring容器实例化bean之后，在执行bean的初始化方法前后，添加一些自己的处理逻辑。
 * 这里说的初始化方法，指的是下面两种：
 * 	1）bean实现了InitializingBean接口，对应的方法为afterPropertiesSet
 * 	2）在bean定义的时候，通过init-method设置的方法
 */
@Component
public class TestBeanPostProcessor implements BeanPostProcessor {


	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(String.format("%s初始化前", beanName));
		return bean;
	}


	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(String.format("%s初始化后", beanName));
		return bean;
	}
}