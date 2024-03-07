package com.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Spring_WebAppProgExercisesApp {

	public interface ISaySomethingService {
		public String saySomething();
	}

	@Component
	/*Legt eine generische Instanz an*/
	public class SayHelloService implements ISaySomethingService {
		@Override
		public String saySomething() {
			return "Hello!";
		}
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Spring_WebAppProgExercisesApp.class, args);
		ISaySomethingService sss = applicationContext.getBean(ISaySomethingService.class);
		System.out.println(sss.saySomething());
	}

}
