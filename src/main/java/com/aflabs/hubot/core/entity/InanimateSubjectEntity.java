package com.aflabs.hubot.core.entity;

import org.apache.log4j.Logger;

public class InanimateSubjectEntity extends SubjectEntity {
	
	private static Logger logger = Logger.getLogger("com.aflabs.hubot.entity.InanimateSubjectEntity");

	public InanimateSubjectEntity() {}

	public InanimateSubjectEntity(String name, String description) {	
		super(name, description);
	}
	
	public String toString() {
		return "InanimateSubjectEntity: [" + super.toString()+ "]";
	}

	public static void main(String[] args) {
		InanimateSubjectEntity ise = new InanimateSubjectEntity("ISE1", "Desc");
		logger.info(ise.toString());
	}

}
