package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.entity.CreateAccount;
import com.example.demo.serviceImpl.SignUpInterfaceImpl;

@Controller
public class SignUpController {

	@Autowired
	private SignUpInterfaceImpl signUpInterfaceimpl;
	
	@RequestMapping("/create")
	public String defaultMethod() {
		return "auth-register-basic";
	}

//	@RequestMapping("/create")
//	public RedirectView defaultMethod() {
//		return new RedirectView("index");
//	}

//	@RequestMapping("/index.html")
//	public RedirectView SignUpPage(@ModelAttribute("signup") CreateAccount lp) {
//		signUpInterfaceimpl.SignUpAccount(lp);
//		return new RedirectView("index.html");
//	}
	
//	@RequestMapping("/signIn")
//	public RedirectView SignInPage(@ModelAttribute("signIn") CreateAccount lp) {
//		signUpInterfaceimpl.SignInAccount(lp);
//		return new RedirectView("index.html");
//	}

}
