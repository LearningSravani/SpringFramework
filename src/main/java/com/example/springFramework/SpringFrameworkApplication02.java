package com.example.springFramework;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.springFramework.game.GameRunner;
import com.example.springFramework.game.GamingConsole;

@SpringBootApplication
public class SpringFrameworkApplication02 {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(GamingConfiguration.class);
		
		context.getBean(GamingConsole.class).up();
		
		
		context.getBean(GameRunner.class).run();

	}

}
