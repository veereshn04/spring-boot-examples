package com.javahangout.springboot.basic.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Veeresh Naidu
 *
 */
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String sayGreeting(@RequestParam String name) {
		return "Hello.... " + name;
	}

}
