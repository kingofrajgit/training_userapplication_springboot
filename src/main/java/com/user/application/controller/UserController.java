package com.user.application.controller;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.application.Dto.*;
import com.user.application.service.UserService;



@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping("/registartion")
	public  ResponseEntity<?> registration(@RequestBody UserDto dto) {
		String data = userService.save(dto);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
}
