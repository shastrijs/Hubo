package com.aflabs.hubot.entity;

import org.apache.log4j.Logger;

import com.aflabs.hubot.core.primary.Entity;
import com.aflabs.hubot.core.primary.Event;
import com.aflabs.hubot.entity.behavior.ISubjectEntity;
import com.aflabs.hubot.subject.aspects.BirthDetails;
import com.aflabs.hubot.subject.aspects.Feeling;
import com.aflabs.hubot.subject.aspects.Instinct;
import com.aflabs.hubot.subject.aspects.SubjectVitals;
import com.aflabs.hubot.utility.DNAGenerator;

public class SubjectEntity extends Entity implements ISubjectEntity{
	
	boolean living = true;
	BirthDetails birthDetails;
	SubjectVitals[] vitals; // Dynamic vitals that impact and are impacted by Feelings, Instincts, 
	Instinct[] instincts; //Acquired or habitual ones from empirical experience/ UniversalEmperic 	
	Feeling[] feelings;
	
	//Freewill
	//Measuring instinct
	//Top down and Bottoms up instincts
	
	private static Logger logger = Logger.getLogger("com.aflabs.hubot.entity.SubjectEntity");

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
		logger.info(subjectEntity.toString());		
	}

	@Override
	public void birth() {
		
	}

	@Override
	public void death() {
		
	}

	@Override
	public void burnEnergy() {
		
	}
	
	@Override
	public void doEvent(Event event) {
		
	}

}
