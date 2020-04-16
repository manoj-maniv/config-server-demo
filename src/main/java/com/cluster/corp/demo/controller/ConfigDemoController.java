package com.cluster.corp.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/ConfigDemo")
public class ConfigDemoController {

	@Value("${MESSAGE_TO_USER}")
	private String message;

	@GetMapping(path = "/message")
	public String printMessage() {
		return message;
	}
}
