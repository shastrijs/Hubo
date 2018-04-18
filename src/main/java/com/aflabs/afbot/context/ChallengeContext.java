package com.aflabs.afbot.context;

import java.util.ArrayList;
import java.util.List;

import com.aflabs.hubot.core.object.aspects.Challenge;
import com.aflabs.hubot.core.object.aspects.Model;

public interface ChallengeContext extends Context{
	
	Challenge challenge = new Challenge<>();
	//Model model = new Model<>();
	
	public void loadChallenge();


}
