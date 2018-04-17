package com.aflabs.hubot.core.common;

import com.aflabs.hubot.core.context.ObjectContext;
import com.aflabs.hubot.core.context.OmnijectContext;
import com.aflabs.hubot.core.context.SubjectContext;
import com.aflabs.hubot.core.primary.Context;

public class ContextFactory {
	
	public static Context createDomainContext(String contextType, String name, String desc){
	    if ( contextType.equals("SubjectContext") )
	      return new SubjectContext(name, desc);
	    else if ( contextType.equals("ObjectContext") )
	      return new ObjectContext(name, desc);
	    else if ( contextType.equals("OmnijectContext") )
		      return new OmnijectContext(name, desc);
	    return null;
	}
}