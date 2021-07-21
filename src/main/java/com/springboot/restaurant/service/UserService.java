package com.springboot.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.restaurant.repository.UserRepository;


@Service
public class UserService implements UserDetailsService {
	
	
	
	@Autowired
	UserRepository  userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 
            UserDetails user= userRepository.findByUserName(username);
		
		       if(null==user) {
			                  throw new UsernameNotFoundException(username+"not valid username");
		   }
		        return user;
	}

}
