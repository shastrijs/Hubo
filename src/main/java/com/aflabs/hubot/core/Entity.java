package com.aflabs.hubot.core;

import com.aflabs.hubot.core.behavior.IEntity;
import com.aflabs.hubot.subject.aspects.DNA;

public class Entity extends SuperEntity implements IEntity{	
	
	protected DNA dna;
	
	public Entity() {}
	
	public Entity(String name, String description) {	
		super(name, description);		
	}
	
	public String toString() {
		return "Entity: " + super.toString() + dna.toString();
	}

	public static void main(String[] args) {
		Entity en = new Entity("abcde",null);		
		System.out.println(en.toString());
	}

	@Override
	public void doEvent(Event event) {
		// TODO Auto-generated method stub
		
	}
}
