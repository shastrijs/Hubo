package com.aflabs.hubot.core;

import com.aflabs.hubot.core.behavior.IEntity;
import com.aflabs.hubot.subject.aspects.DNA;

public abstract class Entity extends SuperEntity implements IEntity{	
	
	protected DNA dna;
	
	public Entity() {}
	
	public Entity(String name, String description) {	
		super(name, description);		
	}
	
	public String toString() {
		return "Entity: " + super.toString() + dna.toString();
	}

	@Override
	public void doEvent(Event event) {
		
	}
}
