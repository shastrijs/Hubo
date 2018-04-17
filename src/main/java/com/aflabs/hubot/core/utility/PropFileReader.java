package com.aflabs.hubot.core.utility;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class PropFileReader {
	
	private static Logger log = Logger.getLogger("com.aflabs.hubot.utility.PropFileReader");

	public PropFileReader(String file) {
		readPropFile(file);
	}
	
	public static Properties readPropFile(String file) {		
    	Properties prop = new Properties();
    	
    	try {
    		log.info("Loading Props file : " + file);
			prop.load(PropFileReader.class.getClassLoader().getResourceAsStream(file));			
		} catch (IOException e) {			
			e.printStackTrace();
			log.error(e);
		}
    	
    	return prop;
	}

	 public static void main( String[] args ){
		 System.out.println(readPropFile("object.properties").getProperty("report.archival.path"));
	 }
}
