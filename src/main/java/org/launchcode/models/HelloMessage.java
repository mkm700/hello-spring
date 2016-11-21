package org.launchcode.models;

public class HelloMessage {
	public static String getMessage(String name, String language) {
		String greeting;
		if (language.equalsIgnoreCase("english")) {
			greeting = "Hello";
		}
		else if (language.equalsIgnoreCase("spanish")) {
			greeting = "Hola";
		}
		else if (language.equalsIgnoreCase("french")) {
			greeting = "Salut";
		}
		else {
			greeting = "Ciao";
		}	
		
		return greeting + ", " + name + "!";
	}
}
