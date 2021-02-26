package edu.bit.ex.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		return "home";
	}
	
	@GetMapping("/user/userHome")
	public void userHome() {
		logger.info("userHome");
	}
	
	@GetMapping("admin/adminHome")
	public void adminHome() {
		logger.info("adminHome");
	}
	
	@GetMapping("/login/accessDenied")
	public void accessDenied() {
		logger.info("accessDenied");
	}
	
	@GetMapping("/login/loginForm")
	public String loginForm() {
		logger.info("welcome login form");
		
		return "login/loginForm2";
	}
}
