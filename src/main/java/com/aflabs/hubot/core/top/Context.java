package com.aflabs.hubot.core.top;

import com.aflabs.hubot.core.top.behavior.IContext;

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