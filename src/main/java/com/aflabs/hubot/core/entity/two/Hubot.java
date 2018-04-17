package com.aflabs.hubot.core.entity.two;

import org.apache.log4j.Logger;

import com.aflabs.hubot.core.entity.one.AnimateSubjectEntity;

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
