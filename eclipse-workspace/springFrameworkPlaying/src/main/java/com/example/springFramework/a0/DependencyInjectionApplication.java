package com.example.springFramework.a0;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



//@SpringBootApplication

@Component
class BusinessLogic{
	//field Injection
//	@Autowired
//	private Dependency1 dependency1;
//	
//	@Autowired
//	private Dependency2 dependency2;
	
	
	private Dependency1 dependency1;
	
	
	private Dependency2 dependency2;

	@Override
	public String toString() {
		return "BusinessLogic [dependency1=" + dependency1 + ", dependency2=" + dependency2 + "]";
	}

	
	
	//setter Injection

//	public Dependency1 getDependency1() {
//		return dependency1;
//	}
//
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("setter injection");
//		this.dependency1 = dependency1;
//	}
//
//	public Dependency2 getDependency2() {
//		return dependency2;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("setter injection dependency2");
//		this.dependency2 = dependency2;
//	}
	
	
	
	//constructor Injection
	//@Autowired is not mandatory
	public BusinessLogic(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("constructor injection");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	

}

@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}
@Configuration
@ComponentScan
public class DependencyInjectionApplication {
	
	


	public static void main(String[] args) {
		
		
		
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DependencyInjectionApplication.class);
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

	}

}
