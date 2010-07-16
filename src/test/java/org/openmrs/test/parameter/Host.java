package org.openmrs.test.parameter;


public class Host {

	public String getAddress() {
		return System.getProperty("host.address","localhost");
	}

    public String getPort() {
        return System.getProperty("host.port","8080"); 
    }
}
