package com.dammetruyen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DammetruyenApplication {

	public static void main(String[] args) {
		SpringApplication.run(DammetruyenApplication.class, args);
		System.out.println("localhost : http://127.0.0.1:8080/api/users");
	}

}
