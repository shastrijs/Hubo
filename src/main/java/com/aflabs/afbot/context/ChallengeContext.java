package com.aflabs.afbot.context;

import java.util.ArrayList;
import java.util.List;

import com.aflabs.hubot.core.secondary.Challenge;
import com.aflabs.hubot.core.secondary.Model;

public interface ChallengeContext extends Context{
	
	Challenge challenge = new Challenge<>();
	//Model model = new Model<>();
	
	public void loadChallenge();


}
