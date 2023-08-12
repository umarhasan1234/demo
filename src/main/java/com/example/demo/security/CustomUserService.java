package com.example.demo.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Login;
import com.example.demo.repository.SignUpRepository;


@Component
public class CustomUserService implements UserDetailsService {

	@Autowired
	private SignUpRepository userRepository;

	@Override
	public CustomUserDetails loadUserByUsername(String username) {

		Optional<Login> userOptional = userRepository.findByUsername(username);

		return new CustomUserDetails(userOptional.get());
	}

}