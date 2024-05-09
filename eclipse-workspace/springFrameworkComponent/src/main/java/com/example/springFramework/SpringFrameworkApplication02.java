package com.example.springFramework;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.springFramework.game.GameRunner;
import com.example.springFramework.game.GamingConsole;
import com.example.springFramework.game.PacmanGame;

//@SpringBootApplication

@Configuration
@ComponentScan("com.example.springFramework.game")
public class SpringFrameworkApplication02 {
	
	
    //Manual Creation of Beans
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}


	public static void main(String[] args) {
		
		
		
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringFrameworkApplication02.class);
		
		context.getBean(GamingConsole.class).up();
		
		
		context.getBean(GameRunner.class).run();

	}

}
