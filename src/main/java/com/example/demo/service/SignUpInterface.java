package com.example.demo.service;


import org.springframework.stereotype.Component;
import com.example.demo.entity.Login;

@Component
public interface SignUpInterface {
	public void SignUpAccount(Login lp);

}
