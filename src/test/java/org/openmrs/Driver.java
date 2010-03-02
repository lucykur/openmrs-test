package org.openmrs;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class Driver {

	public String getClazz() {
		return System.getProperty("driver.clazz",HtmlUnitDriver.class.getName());
	}

}
