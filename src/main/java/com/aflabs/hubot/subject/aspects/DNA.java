package com.aflabs.hubot.subject.aspects;

public class DNA {
	
	//(Gender- 1 male, 2 female, 3 bi (for inanimate subjects like plants)
	// Basal Health - 3 digits - 1st digit (scale of 1-9) Strength indicator
	// Basal Health - 2nd and 3rd - 100 possible abnormalities
	String dna;

	public DNA() {
		dna = "1-600-";
	}
	
	public String toString() {
		return "[" + dna + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
