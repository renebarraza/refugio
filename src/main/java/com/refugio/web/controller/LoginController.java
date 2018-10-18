package com.refugio.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	
	@GetMapping("/login")
	public String login(Model model,
			@RequestParam(value="error", required=false) String error) {
		
		if(error!=null) {
			model.addAttribute("error", "Credenciales invalidas");
		}
		
		return "login.html";
	}
	
}
