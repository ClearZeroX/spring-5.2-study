package com.zlc.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author : zlc
 * @create : 2021-04-22 14:30
 * @desc :
 **/
@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition testBean = beanFactory.getBeanDefinition("myBean");
		System.out.println(testBean.toString());
		// 可以对BeanDefinition进行一些操作, 比如设置scope等
//		testBean.setScope(BeanDefinition.SCOPE_PROTOTYPE);
		System.out.println(testBean.toString());

		String beanClassName = testBean.getBeanClassName();
		System.out.println(beanClassName);

		String s = testBean.getPropertyValues().toString();
		System.out.println(s);

	}
}
