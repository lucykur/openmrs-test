package org.openmrs.test.parameter;


public class Host {

	public String getAddress() {
		return System.getProperty("host.address","localhost");
	}
}
