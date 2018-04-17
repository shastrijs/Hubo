package com.aflabs.hubot.core.context;

import org.apache.log4j.Logger;

import com.aflabs.hubot.core.context.behavior.IOmnijectContext;
import com.aflabs.hubot.core.top.Context;

public class OmnijectContext extends Context implements IOmnijectContext{
	
	private static Logger logger = Logger.getLogger("com.aflabs.hubot.context.OmnijectContext");

	public OmnijectContext() {}

	public OmnijectContext(String name, String description) {
		super(name, description);
	}
	
	@Override
	public String toString() {
		return "OmnijectContext: [" + super.toString()+ "]";
	}

	public static void main(String[] args) {
		OmnijectContext omnijectContext = new OmnijectContext("SC1", "SC Desc");
		logger.info(omnijectContext.toString());	
	}

}
