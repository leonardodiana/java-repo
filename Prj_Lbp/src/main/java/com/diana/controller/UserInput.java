package com.diana.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserInput {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String userInput() {
		return "UserInput";
	}
	
	@RequestMapping(value="/submit", method = RequestMethod.POST)
	public String userResponse(String testo) {
		System.out.println(testo);
		return "UserResponse";
	}
}
