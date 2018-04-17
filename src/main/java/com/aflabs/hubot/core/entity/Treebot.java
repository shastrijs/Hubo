package com.aflabs.hubot.core.entity;

import org.apache.log4j.Logger;

public class Treebot extends AnimateSubjectEntity {
	
	boolean gender;
	
	private static Logger logger = Logger.getLogger("com.aflabs.hubot.entity.Treebot");

	public Treebot() {}

	public Treebot(String name, String description) {	
		super(name, description);
	}
	
	public String toString() {
		return "Treebot: [" + super.toString()+ "]";
	}

	public static void main(String[] args) {
		Treebot treebot = new Treebot("T1", "Adam");
		logger.info(treebot.toString());
	}

}
