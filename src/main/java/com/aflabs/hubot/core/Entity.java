package com.aflabs.hubot.core;

import com.aflabs.hubot.core.behavior.IEntity;

public class Entity extends Supreme implements IEntity{	

	public Entity() {}
	
	public Entity(String name, String description) {	
		super(name, description);
	}
	
	public String toString() {
		return "Entity: " + super.toString();
	}

	public static void main(String[] args) {
		Entity en = new Entity("abcd",null);		
		System.out.println(en.toString());
	}

	@Override
	public void doEvent(Event event) {
		// TODO Auto-generated method stub
		
	}
}
