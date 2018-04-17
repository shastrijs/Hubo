package com.aflabs.hubot.core.entity;

import org.apache.log4j.Logger;

import com.aflabs.hubot.core.top.Entity;
import com.aflabs.hubot.core.top.Event;
import com.aflabs.hubot.core.utility.DNAGenerator;

public class ObjectEntity extends Entity {
	
	boolean living = false;
	//Measurable attributes - part of Object DNA?
	
	private static Logger logger = Logger.getLogger("com.aflabs.hubot.entity.ObjectEntity");

	public ObjectEntity() {}
	
	public ObjectEntity(String name, String description) {
		super(name, description);		
		super.dna = DNAGenerator.generateObjectDNA();
	}

	@Override
	public String toString() {
		return "ObjectEntity: [" + super.toString()+ "]";
	}

	public static void main(String[] args) {
		ObjectEntity objectEntity = new ObjectEntity("Name", "Desc");
		logger.info(objectEntity.toString());		
	}
	
	@Override
	public void doEvent(Event event) {}

}
