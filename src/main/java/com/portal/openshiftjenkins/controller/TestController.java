package com.portal.openshiftjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hello")
	public String ping() {
		return "Openshift Good,job! Testing!! Thank you!! kikumuraCloudTec!!";
	}
}
