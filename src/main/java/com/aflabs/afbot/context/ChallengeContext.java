package com.aflabs.afbot.context;

import java.util.ArrayList;
import java.util.List;

import com.aflabs.hubot.core.concepts.Challenge;
import com.aflabs.hubot.core.concepts.Model;

public interface ChallengeContext extends Context{
	
	Challenge challenge = new Challenge<>();
	//Model model = new Model<>();
	
	public void loadChallenge();


}
