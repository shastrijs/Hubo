package com.aflabs.hubot.entity;

import com.aflabs.hubot.core.Entity;
import com.aflabs.hubot.utility.DNAGenerator;

public class ObjectEntity extends Entity {
	
	boolean living = false;

	public ObjectEntity() {}
	
	public ObjectEntity(String name, String description) {
		super(name, description);		
		super.dna = DNAGenerator.generateObjectDNA();
	}

	public static void main(String[] args) {

	}

}
