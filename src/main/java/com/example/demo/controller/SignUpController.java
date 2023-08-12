package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.entity.Login;
import com.example.demo.serviceImpl.SignUpInterfaceImpl;

@Controller
public class SignUpController {

	@Autowired
	private SignUpInterfaceImpl signUpInterfaceimpl;

	@RequestMapping("/")
	public RedirectView LoginPageDemo() {
		return new RedirectView("auth-login-basic.html");
	}

	@RequestMapping("/signup")
	public RedirectView SignUpPage(@ModelAttribute("signup") Login lp) {
		signUpInterfaceimpl.SignUpAccount(lp);
		return new RedirectView("index.html");
	}
	
	@RequestMapping("/signIn")
	public RedirectView SignInPage(@ModelAttribute("signIn") Login lp) {
		signUpInterfaceimpl.SignInAccount(lp);
		return new RedirectView("index.html");
	}

}
