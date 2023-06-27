package com.example.redhat.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RedhatOpenshiftApplication {



	@GetMapping("/")
	public String getMessage()
	{
		return "Hurray !! deployed on redhat";
	}


	@GetMapping("/{name}")
	public String getMessage(@PathVariable String name)
	{
		return "Your name is "+name;
	}

	public static void main(String[] args) {
		SpringApplication.run(RedhatOpenshiftApplication.class, args);
	}

}
