package com.springboot.restaurant.restapi;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.springboot.restaurant.entity.User;
import com.springboot.restaurant.repository.UserRepository;

@SpringBootApplication
 
public class RestapiApplication {
	
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
		
		
		
		System.out.println("Application start");
	}
	
	
	 @PostConstruct
	 protected void init() {
		 
		 User user=new User();
		 
		 user.setUserName("Shubham rana");
		 user.setEmail("shubham@gmail.com");
		 user.setPhoneNumber("7488388989");
		 user.setPassword(passwordEncoder.encode("Shubham123"));
		 
		 
		 userRepository.save(user);
			
	 }
	 
	
	
		 

}
