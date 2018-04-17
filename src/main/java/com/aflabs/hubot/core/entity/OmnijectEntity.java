package com.aflabs.hubot.core.entity;

import org.apache.log4j.Logger;

import com.aflabs.hubot.core.top.Entity;
import com.aflabs.hubot.core.top.Event;
import com.aflabs.hubot.core.utility.DNAGenerator;

public class OmnijectEntity extends Entity {
	
	private static Logger logger = Logger.getLogger("com.aflabs.hubot.core.entity.OmnijectEntity");

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
