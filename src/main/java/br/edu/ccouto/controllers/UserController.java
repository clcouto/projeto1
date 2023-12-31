package br.edu.ccouto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ccouto.repositories.UserRepository;

@Controller
public class UserController {
	
	
	private UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@RequestMapping("/user")
	public String getUsers(Model model) { 
		model.addAttribute("userList", this.userRepository.findAll());
			return "user";
	}

}
