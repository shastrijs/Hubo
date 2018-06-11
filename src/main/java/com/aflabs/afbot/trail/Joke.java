package com.aflabs.afbot.trail;

import java.util.concurrent.ThreadLocalRandom;

public class Joke
{
  public static void main(String[] args) {	  
	  randomConvergence();
   
  }
  
  private static void randomConvergence() {
	  int iter = 0;
	  int min = 1;
	  int max = 1000000000;
	  int a,b;
	  for (int i = 0; i <100; i++) {		  
		  a = randInt(min, max);
		  b = randInt(min, max);
		  min = Math.min(a, b);
		  max = Math.max(a, b);
		  System.out.println("Iteration : " + ++iter + " Min : " + min + "   Max : " + max + "   Diff : " + (max-min));
		  if (min == max){
			  break;
		  }		  
	  }
  }
  
  public static int randInt(int min, int max) {
	  return ThreadLocalRandom.current().nextInt(min, max);
  }
  
}

