package com.example.world.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hi")
	    public String first(Model model){
			model.addAttribute("away", "안녕!");
			return "index";
	    }

}
