package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Value("${greetings.message}")
	private String message;
	
	@Value(value = "shree varshan")
	private String myName;
	
    @GetMapping("/")
    public String getMessage(){
        return message + " " + myName;
    }
}
