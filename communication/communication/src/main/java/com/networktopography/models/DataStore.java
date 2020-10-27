package com.networktopography.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DataStore {

	// Map of names to Device instances.
	private Map<String, Device> deviceMap = new HashMap<>();

	// this class is a singleton and should not be instantiated directly!
	private static DataStore instance = new DataStore();

	public static DataStore getInstance() {
		return instance;
	}

	private DataStore() {
		// dummy data
		deviceMap.put("A", new Device("A", "jyoti", "c", "d", 1));

	}

	public List<Device> getAllDevices() {
		List<Device> l1 = new ArrayList<Device>();
		for (Entry<String, Device> device : deviceMap.entrySet()) {
			l1.add(device.getValue());

		}
		return l1;

	}

	public Device getDevice(String name) {
		return deviceMap.get(name);

	}

	public void putDevice(Device device) {
		deviceMap.put(device.getName(), device);

	}

}
