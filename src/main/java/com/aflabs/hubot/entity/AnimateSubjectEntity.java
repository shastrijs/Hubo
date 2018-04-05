package com.aflabs.hubot.entity;

import com.aflabs.hubot.entity.behavior.IAnimateSubjectEntity;

public class AnimateSubjectEntity extends SubjectEntity implements IAnimateSubjectEntity{
	
	public AnimateSubjectEntity() {}

	public AnimateSubjectEntity(String name, String description) {	
		super(name, description);
	}
	
	public String toString() {
		return "AnimateSubjectEntity: [" + super.toString()+ "]";
	}

	public static void main(String[] args) {
		AnimateSubjectEntity ase = new AnimateSubjectEntity("ASE1", "Desc");
		System.out.println(ase.toString());
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
