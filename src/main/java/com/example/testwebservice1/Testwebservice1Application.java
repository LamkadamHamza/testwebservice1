package com.example.testwebservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class Testwebservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(Testwebservice1Application.class, args);
	}


	@Scheduled(fixedDelay = 2000)
	public  void scheduledRun(){
		System.out.println("current scheduled time :"+ new Date());
	}

}
