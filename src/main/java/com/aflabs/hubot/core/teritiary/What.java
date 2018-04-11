package com.aflabs.hubot.core.teritiary;

import java.util.Collection;

import com.aflabs.afbot.core.utility.Actor;
import com.aflabs.afbot.core.utility.HowMuch;

public class What {

	boolean isVirtual; //Eg: False - A Market event; True - Challenge/Part of a Challenge
	Integer typeID; //Eg: If modeling an event, it is Event Type ID
	HowMuch howMuch;
	Collection<Actor> actors;
}
