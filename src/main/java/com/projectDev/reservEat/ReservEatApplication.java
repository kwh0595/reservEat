package com.projectDev.reservEat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ReservEatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservEatApplication.class, args);
	}
}
