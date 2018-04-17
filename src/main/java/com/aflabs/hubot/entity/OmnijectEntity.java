package com.aflabs.hubot.entity;

import org.apache.log4j.Logger;

import com.aflabs.hubot.core.primary.Entity;
import com.aflabs.hubot.core.primary.Event;
import com.aflabs.hubot.utility.DNAGenerator;

public class OmnijectEntity extends Entity {
	
	private static Logger logger = Logger.getLogger("com.aflabs.hubot.entity.OmnijectEntity");

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
		logger.info(omnijectEntity.toString());		
	}
	
	@Override
	public void doEvent(Event event) {}

}
