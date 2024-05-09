package com.example.springFramework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age,Address address) {
	
}

record Address(String fname,String lname) {
	
}
@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Sravani";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("Sai",23,new Address("fname","lname"));
	}

	
	@Bean
	@Primary
	public Address address() {
		return new Address("fname","lname");
	}
	
	@Bean("address3")
	
	@Qualifier("address4")
	public Address address2() {
		return new Address("fname","lname");
	}
	
@Bean("address3qualifier")
	
	
	public Address address4() {
		return new Address("fname","lname");
	}
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(),address());
	}
	
	@Bean
	public Person person3Param(String name,int age,Address address3) {
		return new Person(name(),age(),address());
	}
	
	@Bean
	@Primary
	public Person person4Param(String name,int age,Address address4) {
		return new Person(name(),age(),address());
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
		//name,age,address2
		return new Person(name, age, address); //name, age		
	}
}
