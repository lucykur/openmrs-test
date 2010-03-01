package org.openmrs;

public class User {

	public String getUsername() {
		return System.getProperty("user.name");
	}

	public String getPassword() {
		return System.getProperty("user.password");
	}

}
