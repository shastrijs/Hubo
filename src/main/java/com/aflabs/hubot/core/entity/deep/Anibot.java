package com.aflabs.hubot.core.entity.deep;

import org.apache.log4j.Logger;

public class Anibot extends AnimateSubjectEntity {
	
	boolean gender;
	
	private static Logger logger = Logger.getLogger("com.aflabs.hubot.entity.Anibot");

	public Anibot() {}

	public Anibot(String name, String description) {	
		super(name, description);
	}
	
	public String toString() {
		return "Anibot: [" + super.toString()+ "]";
	}

	public static void main(String[] args) {
		Anibot anibot = new Anibot("A1", "Adam");
		logger.info(anibot.toString());
	}

}
