package com.aflabs.hubot.entity;

import com.aflabs.hubot.core.Entity;
import com.aflabs.hubot.core.Event;
import com.aflabs.hubot.utility.DNAGenerator;

public class OmnijectEntity extends Entity {

	public OmnijectEntity() {}

	public OmnijectEntity(String name, String description) {
		super(name, description);		
		super.dna = DNAGenerator.generateOmnijectDNA();
	}

	@Override
	public String toString() {
		return "OmnijectEntity: [" + super.toString()+ "]";
	}

	public static void main(String[] args) {
		OmnijectEntity omnijectEntity = new OmnijectEntity("Name", "Desc");
		System.out.println(omnijectEntity.toString());		
	}
	
	@Override
	public void doEvent(Event event) {}

}
