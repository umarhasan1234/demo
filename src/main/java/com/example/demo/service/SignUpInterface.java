package com.example.demo.service;


import org.springframework.stereotype.Component;
import com.example.demo.entity.CreateAccount;

@Component
public interface SignUpInterface {
	public void SignUpAccount(CreateAccount lp);

}
