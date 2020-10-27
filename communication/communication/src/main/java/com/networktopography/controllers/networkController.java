package com.networktopography.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.networktopography.models.Device;

@RestController
@RequestMapping(value = "/ajiranet/process")
public class networkController {

	@Autowired
	private com.networktopography.services.networkService networkService;

	/**
	 * 
	 * 
	 * @return List of Devices
	 */
	@RequestMapping(value = "/getAllDevices", method = RequestMethod.GET)
	public List<Device> fetchDevices() {
		List<Device> devList = new ArrayList<>();
		devList = networkService.fetchAllDevices();

		return devList;

	}

	/**
	 * 
	 * @param Object of type Device
	 * @return String
	 */
	@RequestMapping(value = "/CREATE /devices", method = RequestMethod.POST)
	public String addDevices(@RequestBody Device d) {
		// List<Device> devList = new ArrayList<>();
		networkService.addDevices(d);

		return "OK";
	}

	/**
	 * 
	 * @PathVariable name of String type,Strength of int type
	 * @return String
	 */
	@RequestMapping(value = "MODIFY /devices/{name}/{strength}", method = RequestMethod.POST)
	public String modifyStrength(@PathVariable String name, @PathVariable int strength) {
		// List<Device> devList = new ArrayList<>();

		networkService.modifyStrength(name, strength);

		return "OK";
	}

}
