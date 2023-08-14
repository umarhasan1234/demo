package com.example.demo.security;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CreateAccount;
import com.example.demo.repository.SignUpRepository;


@Service
public class CustomUserService implements UserDetailsService {

	@Autowired
	private SignUpRepository userRepository;

	@Override
	public CustomUserDetails loadUserByUsername(String username) {

		Optional<CreateAccount> userOptional = userRepository.findByUsername(username);

		return new CustomUserDetails(userOptional.get());
	}

}