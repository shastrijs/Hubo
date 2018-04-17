package com.aflabs.hubot.core.primary;

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
