package org.springframework.samples.petclinic.system;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class LoginController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	// @GetMapping("/login")
	// public String showloginpage(HttpSession session, Model model) {
	// String username = (String) session.getAttribute("username");
	// model.addAttribute("username", username);
	// return "login";
	// }

}
