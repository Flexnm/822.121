package com.example.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.beans.User;

@Configuration
public class WebConfig {

	@Bean
	public Map<String, User> sessions(){
		return new HashMap<String, User>();
	}
}
