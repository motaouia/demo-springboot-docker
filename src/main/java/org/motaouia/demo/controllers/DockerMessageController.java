package org.motaouia.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class DockerMessageController  {
	
	@GetMapping
	public String hello() {
		return "Hello from Docker !!";
	}

}