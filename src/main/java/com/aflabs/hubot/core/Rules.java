package com.aflabs.hubot.core;

import com.aflabs.hubot.core.behavior.IRules;

public class Rules extends Supreme implements IRules{

	public Rules() {}
	
	public Rules (String name, String description) {	
		super(name, description);
	}
	
	public String toString() {
		return "RuleSet: " + super.toString();
	}

}
