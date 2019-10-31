package io.javabrains.springboot.object;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddObjects {
	@RequestMapping("/topic")
	public List<topics> getAllTopics(){
		return Arrays.asList(
				new topics("gdgfg","gopi","anji"),
				new topics("venky","software","vijayawada"),
				new topics("navin","hardware","navaluru")				
				);
				
	}
}
