package com.arms.app.staticpages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticPagesController {
	@RequestMapping("/help")
	public String help() {
		return "static/help";
	}
	@RequestMapping("/about")
	public String about() {
		return "static/about";
	}
	@RequestMapping("/contact")
	public String contact() {
		return "static/contact";
	}
}