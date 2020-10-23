package com.javainuse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.services.ConcurrentDataProcessingService;

@RestController
public class ConcurrentDataProcessingController {

	@Autowired
	private ConcurrentDataProcessingService notificationService;

	/**
	 * 
	 * 
	 * @return String
	 */
	@GetMapping("/start")
	public String startApi() {

		String status = notificationService.startApi();

		return status;
	}

	/**
	 * 
	 * @return String
	 */
	@GetMapping("/stop")
	public String stopApi() {
		notificationService.stopApi();

		return "stopped";
	}

}
