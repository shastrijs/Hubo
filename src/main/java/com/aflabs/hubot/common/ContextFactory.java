package com.aflabs.hubot.common;

import com.aflabs.hubot.context.ObjectContext;
import com.aflabs.hubot.context.OmnijectContext;
import com.aflabs.hubot.context.SubjectContext;
import com.aflabs.hubot.core.Context;

public class ContextFactory {
	
	public static Context createDomainContext(String contextType)
	  {
	    if ( contextType.equals("SubjectContext") )
	      return new SubjectContext("SC", "SC Desc");
	    else if ( contextType.equals("ObjectContext") )
	      return new ObjectContext("OC", "OC Desc");
	    else if ( contextType.equals("OmnijectContext") )
		      return new OmnijectContext("OMC", "OMC Desc");

	    return null;
	  }
}