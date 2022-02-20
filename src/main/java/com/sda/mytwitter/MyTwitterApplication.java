package com.sda.mytwitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MyTwitterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyTwitterApplication.class, args);
	}

}
