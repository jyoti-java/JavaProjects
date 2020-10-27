package com.networktopography.models;

public class Device {

	private String type;
	private String name;
	private String src;
	private String dest;
	private int value;

	public Device() {

	}

	public Device(String type, String name, String src, String dest, int value) {
		super();
		this.type = type;
		this.name = name;
		this.src = src;
		this.dest = dest;
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
