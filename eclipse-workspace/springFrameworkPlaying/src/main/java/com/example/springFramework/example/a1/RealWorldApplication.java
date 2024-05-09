package com.example.springFramework.example.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



//@SpringBootApplication
@Component
interface DataService{
	int[] retrieveData();
}
@Component
@Primary
class MongoDbDataService implements DataService {
	public int[] retrieveData() {
		return new int[] { 11, 22, 33, 44, 55 };
	}
}

@Component
class MySqlDataService implements DataService {
	public int[] retrieveData() {
		return new int[] { 1, 2, 3, 4, 5 };
	}
}

@Configuration
@ComponentScan
public class RealWorldApplication {
	
	


	public static void main(String[] args) {
		
		
		
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(RealWorldApplication.class);
		
		System.out.println(context.getBean(BusinessCalculationService.class).findMax());

	}

}
