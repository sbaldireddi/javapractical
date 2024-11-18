package com.course.practicaljava.api.server;

import java.time.LocalTime;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DefaultRestApi {

	@GetMapping("/welcome")
	public String welcome() {

		var text = StringUtils.join("Hi ", "Welcome ", "to Spting boot ", "api");
		System.out.println(text);

		return "Welcome to Spring Boot";
	}

	@GetMapping("/time")
	public String time() {
		return LocalTime.now().toString();
	}

}
