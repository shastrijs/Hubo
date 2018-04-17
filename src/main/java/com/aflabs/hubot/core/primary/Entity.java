package com.aflabs.hubot.core.primary;

import com.aflabs.hubot.core.omniject.aspects.DNA;
import com.aflabs.hubot.core.primary.behavior.IEntity;

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
