/**
 * 
 */
package com.aflabs.hubot.core;

import com.aflabs.hubot.core.behavior.IContext;

public class Context extends Supreme implements IContext{
	
	public Context() {}
	
	public Context (String name, String description) {	
		super(name, description);
	}
	
	public String toString() {
		return "Context: " + super.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}