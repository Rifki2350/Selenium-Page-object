package com.juaracoding.Ujian56;

import org.openqa.selenium.WebDriver;

import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import utils.Constans;

public class TestHookUjain5 {

	public static WebDriver driver;
	
	@Before
	public void methodBefore() {
		DriverSingelton.getInstace(Constans.CHROME);
		driver = DriverSingelton.getDriver();
	}
	
	@AfterAll
	public static void methodAfter() {
		delay(3);
		DriverSingelton.CloseObjectInstance();
	}
	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
