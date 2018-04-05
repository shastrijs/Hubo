package com.aflabs.hubot.entity;

public class Hubot extends AnimateSubjectEntity {
	
	boolean gender;

	public Hubot() {}

	public Hubot(String name, String description) {	
		super(name, description);
	}
	
	public String toString() {
		return "Hubot: [" + super.toString()+ "]";
	}

	public static void main(String[] args) {
		Hubot hubot = new Hubot("H1", "Adam");
		System.out.println(hubot.toString());
	}

}
