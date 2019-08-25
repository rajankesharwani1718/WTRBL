package org.mvs.waterboll.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class TestController {

	@RequestMapping(value = "sayHello", method = RequestMethod.GET)
	public String hello() {
		return "Hello";
	}
}
