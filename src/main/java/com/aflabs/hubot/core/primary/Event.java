package com.aflabs.hubot.core.primary;

import com.aflabs.hubot.core.primary.behavior.IEvent;

public class Event extends SuperEntity implements IEvent{	
	
	Event[] subEvents;
	Event[] causes;
	Event[] effects;
	
	public Event() {}
	
	public Event (String name, String description) {	
		super(name, description);
	}
	
	public String toString() {
		return "Event: " + super.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
