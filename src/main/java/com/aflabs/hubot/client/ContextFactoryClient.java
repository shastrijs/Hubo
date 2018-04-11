package com.aflabs.hubot.client;

import org.apache.log4j.Logger;

import com.aflabs.hubot.common.ContextFactory;
import com.aflabs.hubot.core.Context;

public class ContextFactoryClient {
	
	private static Logger logger = Logger.getLogger("com.aflabs.hubot.client.ContextFactoryClient");
	
	private static Context context;
	
	  public static void main(String[] args)
	  {	    
	    context = ContextFactory.createDomainContext("SubjectContext", "SC", "SC Desc");	    
	    logger.info(context);	   
	    
	    context = ContextFactory.createDomainContext("ObjectContext", "OC", null);	    
	    logger.info(context);
	    
	    context = ContextFactory.createDomainContext("OmnijectContext", "OMC", "OMC Desc");	    
	    logger.info(context);
	  }
}
