package com.aflabs.hubot.core;

public class Supreme {	
	String name;
	String description;

	public Supreme() {		
	}
	
	public Supreme(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String toString() {
		return "[" + name + ((description != null && !"".equals(description))?(", " + description + "]"):"] ");
	}

}
