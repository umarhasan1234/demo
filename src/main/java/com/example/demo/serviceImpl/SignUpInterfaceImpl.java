package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Login;
import com.example.demo.repository.SignUpRepository;
import com.example.demo.service.SignUpInterface;


@Service
public class SignUpInterfaceImpl implements SignUpInterface{

	@Autowired
	private SignUpRepository signUpRepository;

	@Override
	public void SignUpAccount(Login lp) {
		signUpRepository.save(lp);
	}

	public void SignInAccount(Login lp) {
		
	}
	
	

}
