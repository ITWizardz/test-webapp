package com.deploy.test.DeployTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping
	public String home(Model model) {
		model.addAttribute("homepage", "This is the the homepage for the academy project! :)");
		return "Home";
	}
}
