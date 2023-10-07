package com.cp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DetailController {

	@GetMapping("/kice_detail")
	private String Zone() {
		return "Kice";
	}

}
