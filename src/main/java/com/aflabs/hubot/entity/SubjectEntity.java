package com.aflabs.hubot.entity;

import com.aflabs.hubot.core.Entity;
import com.aflabs.hubot.entity.behavior.ISubjectEntity;
import com.aflabs.hubot.subject.aspects.BirthDetails;

public class SubjectEntity extends Entity implements ISubjectEntity{
	
	boolean living = true;
	BirthDetails birthDetails;

	public SubjectEntity() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void birth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void death() {
		// TODO Auto-generated method stub
		
	}

}
