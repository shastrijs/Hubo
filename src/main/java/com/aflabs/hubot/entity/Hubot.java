package com.aflabs.hubot.entity;

import org.apache.log4j.Logger;

public class Hubot extends AnimateSubjectEntity {
	
	boolean gender;
	
	private static Logger logger = Logger.getLogger("com.aflabs.hubot.entity.Hubot");

	public Hubot() {}

	public Hubot(String name, String description) {	
		super(name, description);
	}
	
	public String toString() {
		return "Hubot: [" + super.toString()+ "]";
	}

	public static void main(String[] args) {
		Hubot hubot = new Hubot("H1", "Adam");
		logger.info(hubot.toString());
	}

}
