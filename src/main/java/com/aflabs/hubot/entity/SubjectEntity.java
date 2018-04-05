package com.aflabs.hubot.entity;

import com.aflabs.hubot.core.Entity;
import com.aflabs.hubot.entity.behavior.ISubjectEntity;
import com.aflabs.hubot.subject.aspects.BirthDetails;
import com.aflabs.hubot.subject.aspects.Instinct;

public class SubjectEntity extends Entity implements ISubjectEntity{
	
	boolean living = true;
	BirthDetails birthDetails;
	Instinct[] instincts;

	public SubjectEntity() {}
	
	public SubjectEntity(String name, String description) {	
		super(name, description);
	}
	
	public String toString() {
		return "SubjectEntity: [" + super.toString()+ "]";
	}

	public static void main(String[] args) {
		SubjectEntity subjectEntity = new SubjectEntity("Name", "Desc");
		System.out.println(subjectEntity.toString());
	}

	@Override
	public void birth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void death() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void burnEnergy() {
		// TODO Auto-generated method stub
		
	}

}
