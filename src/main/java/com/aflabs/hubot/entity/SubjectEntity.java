package com.aflabs.hubot.entity;

import com.aflabs.hubot.core.Entity;
import com.aflabs.hubot.entity.behavior.ISubjectEntity;
import com.aflabs.hubot.subject.aspects.BirthDetails;
import com.aflabs.hubot.subject.aspects.Feeling;
import com.aflabs.hubot.subject.aspects.Instinct;
import com.aflabs.hubot.subject.aspects.SubjectVitals;
import com.aflabs.hubot.utility.DNAGenerator;

public class SubjectEntity extends Entity implements ISubjectEntity{
	
	boolean living = true;
	BirthDetails birthDetails;
	SubjectVitals[] subjectVitals; // Dynamic vitals that impact and are impacted by Feelings, Instincts, 
	Instinct[] instincts; //Acquired or habitual ones from empirical experience/ UniversalEmperic 	
	Feeling[] feelings;

	public SubjectEntity() {}
	
	public SubjectEntity(String name, String description) {	
		super(name, description);
		super.dna = DNAGenerator.generateSubjectDNA();
	}
	
	@Override
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
