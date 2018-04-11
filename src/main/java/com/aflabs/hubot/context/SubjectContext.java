package com.aflabs.hubot.context;

import org.apache.log4j.Logger;

import com.aflabs.hubot.context.behavior.ISubjectContext;
import com.aflabs.hubot.core.Context;

public class SubjectContext extends Context implements ISubjectContext{

	private static Logger logger = Logger.getLogger("com.aflabs.hubot.context.SubjectContext");
	
	public SubjectContext() {}
	
	public SubjectContext(String name, String description) {
		super(name, description);
	}
	
	@Override
	public String toString() {
		return "SubjectContext: [" + super.toString()+ "]";
	}

	public static void main(String[] args) {
		SubjectContext subjectContext = new SubjectContext("SC1", "SC Desc");
		logger.info(subjectContext.toString());	
	}
	
	public void loadInstincts() {
		
	}
	public void loadBeliefs() {
		
	}
	public void loadAssumptions() {
		
	}
	public void loadKnowledge() {
		
	}
	public void loadFacts()	{
		
	}
	public void loadPatterns() {
		
	}
	public void loadStereotypes() {
		
	}

}
