package com.example.springFramework.helloWorld;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("address"));
		
		System.out.println(context.getBean("person2MethodCall"));
		
		System.out.println(context.getBean("person3Param"));
		
		//System.out.println(context.getBeanDefinitionNames());
		
		System.out.println(context.getBean(Address.class));
		
		System.out.println(context.getBean(Person.class));
		
		
		//No qualifying bean of type 'com.example.springFramework.Address' available: expected single matching bean but found 2: address,address3
		
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
