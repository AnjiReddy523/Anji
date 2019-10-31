package io.javabrains.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.DispatcherServlet;

@RestController
public class Controller extends DispatcherServlet{
    @RequestMapping("/hello")
	public String hello() {
		return "hi";
	}
}
