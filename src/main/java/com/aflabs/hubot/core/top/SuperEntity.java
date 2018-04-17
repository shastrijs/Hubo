package com.aflabs.hubot.core.top;

public class SuperEntity {	
	String name;
	String description;

	public SuperEntity() {		
	}
	
	public SuperEntity(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String toString() {
		return "[" + name + ((description != null && !"".equals(description))?(", " + description + "]"):"] ");
	}

}
