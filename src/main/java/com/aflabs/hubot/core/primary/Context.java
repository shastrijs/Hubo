package com.aflabs.hubot.core.primary;

import com.aflabs.hubot.core.primary.behavior.IContext;

public class Context extends SuperEntity implements IContext{
	
	public Context() {}
	
	public Context (String name, String description) {	
		super(name, description);
	}
	
	public String toString() {
		return "Context: " + super.toString();
	}

	public static void main(String[] args) {

	}
}