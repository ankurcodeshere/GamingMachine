package com.iml.controller;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iml.dto.inputDataDto;
import com.iml.response.ApiResponse;
import com.iml.service.gameService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class gameMachineController {
	
	private final gameService gameService;
	
	@PostMapping(path = "/enterCoins")
	public ApiResponse<String> registerMachine(@RequestBody inputDataDto inputDataDto) {
		
		LocalTime hours= gameService.registerMachine(inputDataDto);
		if(hours==null) 
			return new ApiResponse<String>("Enter Valid Data", "");
		else
		return new ApiResponse<String>("Welcome to gaming, your subscription is active till  " + hours ,
				"returned change = ");
	}

}
