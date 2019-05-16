package com.chungfung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class UtilEhcacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilEhcacheApplication.class, args);
	}

}
