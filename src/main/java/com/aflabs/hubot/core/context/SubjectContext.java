package com.aflabs.hubot.core.context;

import org.apache.log4j.Logger;

import com.aflabs.hubot.core.context.behavior.ISubjectContext;
import com.aflabs.hubot.core.primary.Context;

public class SubjectContext extends Context implements ISubjectContext{

	private static Logger logger = Logger.getLogger("com.aflabs.hubot.context.SubjectContext");
	
	public SubjectContext() {}
	
	public SubjectContext(String name, String description) {
		super(name, description);
		loadInstincts();
		loadBeliefs();
		loadAssumptions();
		loadKnowledge();
		loadPatterns();
		loadFacts();
		loadStereotypes();
	}
	
	@Override
	public String toString() {
		return "SubjectContext: [" + super.toString()+ "]" + instincts;
	}

	public static void main(String[] args) {
		SubjectContext subjectContext = new SubjectContext("SC1", "SC Desc");
		logger.info(subjectContext.toString());	
	}
	
	public void loadInstincts() {
		instincts.add(30);
		instincts.add("Test");
		instincts.add(2.345);
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
