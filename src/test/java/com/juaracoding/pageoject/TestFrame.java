package com.juaracoding.pageoject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.juaracoding.pageobject.pages.SampleFrame;
import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

public class TestFrame {

	public static WebDriver driver;
	private SampleFrame sampleframe;
	
	
	@BeforeClass
	public void setUp() {
		DriverSingelton.getInstance("Chrome");
		driver = DriverSingelton.getDriver();
		String url= "https://demoqa.com/frames";
		driver.get(url);
	}
	@BeforeMethod
	 public void pageobject() {
	sampleframe = new SampleFrame();
	}
	
	@Test
	public void testFrame() {
		System.out.println(sampleframe.getTxtOutFrame());
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		System.out.println(sampleframe.getTxtFrame());
		String txtFrame = sampleframe.getTxtFrame();
		assertTrue(txtFrame.contains("simple page"));
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
	
	
	
	
	
	
	
	
	
}