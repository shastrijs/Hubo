package com.aflabs.hubot.core.entity.one;

import org.apache.log4j.Logger;

import com.aflabs.hubot.core.entity.SubjectEntity;
import com.aflabs.hubot.core.entity.one.behavior.IAnimateSubjectEntity;

public class AnimateSubjectEntity extends SubjectEntity implements IAnimateSubjectEntity{
	
	private static Logger logger = Logger.getLogger("com.aflabs.hubot.entity.AnimateSubjectEntity");
	
	public AnimateSubjectEntity() {}

	public AnimateSubjectEntity(String name, String description) {	
		super(name, description);
	}
	
	public String toString() {
		return "AnimateSubjectEntity: [" + super.toString()+ "]";
	}

	public static void main(String[] args) {
		AnimateSubjectEntity ase = new AnimateSubjectEntity("ASE1", "Desc");
		logger.info(ase.toString());
	}

	@Override
	public void locomote() {
		// TODO Auto-generated method stub		
	}

	@Override
	public void feeling() {
		// TODO Auto-generated method stub
		
	}

}
