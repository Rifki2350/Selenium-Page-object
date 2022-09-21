package com.juaracoding.pageoject.drivers.Drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.juaracoding.pageoject.drivers.Strategis.DriverStrategy;
import com.juaracoding.pageoject.drivers.Strategis.DriverStrategyImplementer;

public class DriverSingelton {

	private static DriverSingelton instance = null;
	private static WebDriver driver;
	
	private DriverSingelton(String driver) {
		instantiate(driver);
	}
	
	public WebDriver instantiate(String strategy) {		
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
	public static void CloseObjectInstance() {
		driver.close();
	}
	public static void getInstace(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
