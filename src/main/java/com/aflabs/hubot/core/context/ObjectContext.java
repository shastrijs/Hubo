package com.aflabs.hubot.core.context;

import org.apache.log4j.Logger;

import com.aflabs.hubot.core.context.behavior.IObjectContext;
import com.aflabs.hubot.core.primary.Context;

public class ObjectContext extends Context implements IObjectContext{
	
	private static Logger logger = Logger.getLogger("com.aflabs.hubot.context.ObjectContext");

	public ObjectContext() {}

	public ObjectContext(String name, String description) {
		super(name, description);
	}
	
	@Override
	public String toString() {
		return "ObjectContext: [" + super.toString()+ "]";
	}

	public static void main(String[] args) {
		ObjectContext objectContext = new ObjectContext("SC1", "SC Desc");
		logger.info(objectContext.toString());	
	}

}
