package com.aflabs.hubot.core.top;

import com.aflabs.hubot.core.top.behavior.IRules;

public class Rules extends SuperEntity implements IRules{

	public Rules() {}
	
	public Rules (String name, String description) {	
		super(name, description);
	}
	
	public String toString() {
		return "RuleSet: " + super.toString();
	}

}
