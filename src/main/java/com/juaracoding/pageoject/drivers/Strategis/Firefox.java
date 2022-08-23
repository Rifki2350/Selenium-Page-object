package com.juaracoding.pageoject.drivers.Strategis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {

	public WebDriver setStrategy() {
	System.setProperty("WebDriver.gecko.driver", "D://");
	WebDriver driver = new FirefoxDriver();
	return driver;
	}

}
