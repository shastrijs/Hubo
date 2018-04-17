package com.aflabs.hubot.context.behavior;

import java.util.ArrayList;
import java.util.List;

import com.aflabs.hubot.core.primary.behavior.IContext;

public interface ISubjectContext extends IContext {
	
	List<Object> instincts = new ArrayList<Object>();	
	List<Object> beliefs = new ArrayList<Object>();
	List<Object> assumptions = new ArrayList<Object>();
	List<Object> knowledge = new ArrayList<Object>();
	List<Object> facts = new ArrayList<Object>();
	List<Object> patterns = new ArrayList<Object>();
	List<Object> stereotypes = new ArrayList<Object>();
	
	public void loadInstincts();
	public void loadBeliefs();
	public void loadAssumptions();
	public void loadKnowledge();
	public void loadFacts();	
	public void loadPatterns();
	public void loadStereotypes();

}
