package edu.bit.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.bit.ex.service.UserService;
import edu.bit.ex.vo.UserVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/user/userForm")
	public void userForm() {
		log.info("welcome userForm");
	}
	
	@PostMapping("/user/addUser")
	public String addUser(UserVO userVO) {
		log.info("post register");
		
		userService.addUser(userVO);
		
		return "redirect:/";
	}
}
