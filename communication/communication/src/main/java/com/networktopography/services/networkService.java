package com.networktopography.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.networktopography.models.DataStore;
import com.networktopography.models.Device;

@Service
public class networkService {

	public List<Device> fetchAllDevices() {
		// TODO Auto-generated method stub
		List<Device> devList = new ArrayList<>();
		devList = DataStore.getInstance().getAllDevices();
		return devList;

	}

	public String addDevices(Device d) {
		// TODO Auto-generated method stub
		String devName = d.getName();
		String devType = d.getType();
		DataStore.getInstance().putDevice(new Device(devType, devName, d.getSrc(), d.getDest(), d.getValue()));
		String status = "Success";
		return status;
	}

	public String modifyStrength(String name, int strength) {
		// TODO Auto-generated method stub
		System.err.println(name + "*******" + strength);
		System.out.println("**********f" + DataStore.getInstance().getDevice(name));
		System.out.println("8" + DataStore.getInstance());
		Device device1 = DataStore.getInstance().getDevice(name);
		device1.setValue(strength);
		String status = "Success";

		return status;
	}

}
