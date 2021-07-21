package com.springboot.restaurant.restapi.securityconfg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.springboot.restaurant.service.UserService;
 

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter  {
	
	
	
	@Autowired 
	UserService userService;
	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		 
		//auth.inMemoryAuthentication().withUser("Shubham").password (passwordEncoder().encode("rana")).authorities("USER","ADMIN");
		
		auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
		
		
	}
	
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		 
		return super.authenticationManager();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().anyRequest().authenticated();
		http.formLogin();
		http.httpBasic();
	 
	 
	}
	
	
}
