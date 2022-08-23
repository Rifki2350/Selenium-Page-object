package com.juaracoding.pageoject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.pages.Modal;
import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

public class TestForm {

	
	public static WebDriver driver;
	private SampleForm sampleform;

	@BeforeClass

		public void setUp() {
			DriverSingelton.getInstance("Chrome");
			driver = DriverSingelton.getDriver();
			String url= "https://demoqa.com/automation-practice-form";
			driver.get(url);
		}

	@BeforeMethod
	public void pageobject() {
		sampleForm = new SampleForm();
	}
	
	@Test
	public void testForm() {
	
	}
	
	@AfterClass
	public void closeBrowser() {
		delay(3);
		driver.quit();
	}
	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO: handle exception
		e.printStackTrace();
		}
	
	
}
