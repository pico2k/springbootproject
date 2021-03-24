package com.pico.service;

import java.util.Collections;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SpringUserService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = null;
		
		
		if (username.equals("admin")) {
			user = new User("admin",new BCryptPasswordEncoder().encode("admin"),Collections.EMPTY_LIST);
		} else {
			throw new UsernameNotFoundException("Username is wrong.");
		}
		
		return user;
	}

}
