package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private CustomUserService userDetailsService;
	
	@Bean
	public SecurityFilterChain securityFilterChain1(HttpSecurity http) throws Exception {

		final String PUBLIC_URL[] = { 

		};

	
		http
        .authorizeRequests()
            .requestMatchers(PUBLIC_URL).permitAll() // Publicly accessible URLs
            .anyRequest().authenticated() // All other URLs require authentication
            .and()
        .formLogin() // Enable form-based authentication
            .permitAll() // Allow access to the login page
            .and()
        .logout()
            .permitAll();
		return http.build();
	}

	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider(UserDetailsService CustumUserDetails) {

		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(passwordEncoder());
		return provider;
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationManager authenticationManagerBean(AuthenticationConfiguration configuration) throws Exception {

		return configuration.getAuthenticationManager();
	}
}
