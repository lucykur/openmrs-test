package org.openmrs;


public class Host {

	public String getAddress() {
		return System.getProperty("host.address","localhost");
	}
}
