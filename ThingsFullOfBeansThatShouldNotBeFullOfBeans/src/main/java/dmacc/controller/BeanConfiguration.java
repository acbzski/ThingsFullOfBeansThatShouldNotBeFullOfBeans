package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Beans;
import dmacc.beans.Farm;

@Configuration
public class BeanConfiguration {

	@Bean
	public Beans beans() {
		Beans bean = new Beans();
		bean.setColor("white");
		bean.setType("Pinto");
		return bean;
	}
	
	@Bean
	public Farm farm() {
		Farm bean = new Farm("", "Honesdale", "PA");
		return bean;
	}
}
