package com.juaracoding.pageoject.drivers.Drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.juaracoding.pageoject.drivers.Strategis.DriverStrategy;
import com.juaracoding.pageoject.drivers.Strategis.DriverStrategyImplementer;

public class DriverSingelton {

	private static DriverSingelton instance = null;
	private static WebDriver driver;
	
	public DriverSingelton(String driver) {
		// TODO Auto-generated constructor stub
	}
	private void DriverSingleton(String driver) {
		instatiate(driver);
	}
	public WebDriver instatiate(String strategy) {		
		DriverStrategy driverStrategy = DriverStrategyImplementer.chooseStrategy(strategy);
		driver = driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
	public static DriverSingelton getInstance(String driver) {
		if( instance == null) {
			instance = new DriverSingelton(driver);
		}
		return instance;
	}
	public static WebDriver getDriver() {
		return driver;
		
	}
	

}
