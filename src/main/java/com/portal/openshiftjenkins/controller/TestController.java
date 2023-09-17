package com.portal.openshiftjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hello")
	public String ping() {
		return "Openshift Pipe Line Jenkins Good,job! Testing!! Thank you. Kikumura,Izumi";
	}
}
