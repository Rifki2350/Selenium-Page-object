package com.juaracoding.pageoject;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.pages.SampleAlert;
import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

public class TestAlert {
	public static WebDriver driver;
	private SampleAlert sampleAlert;
	
	
	@BeforeClass
	public void setUp() {
		DriverSingelton.getInstance("Chrome");
		driver = DriverSingelton.getDriver();
		String url= "https://demoqa.com/alerts";
		driver.get(url);
	}
	@BeforeMethod
	 public void pageobject() {
	sampleAlert = new SampleAlert();
	}
	
	@Test
	public void testAlertOne() {
		scroll(700);
		sampleAlert.clickMe();
		delay(2);
//		driver.switchTo().alert().accept();
		String txtAlert = driver.switchTo().alert().getText();
		delay(1);
		driver.switchTo().alert().dismiss();
		System.out.println(sampleAlert.getTXTConfirmResult());
		System.out.println(txtAlert);
		String txt = sampleAlert.getTXTConfirmResult();
		assertTrue(txt.contains("Cancel"));
}
	
	@Test
	public void testAlertTwo() {
		scroll(700); 
		sampleAlert.clickMeTwo();
		delay(1);
		driver.switchTo().alert().sendKeys("Test");
		String txtAlert = driver.switchTo().alert().getText();
		delay(1);
		driver.switchTo().alert().accept();
		System.out.println(sampleAlert.getTXTPromptResult());
		System.out.println(txtAlert);
		String txt = sampleAlert.getTXTPromptResult();
		assertTrue(txt .contains("Test"));
	
	}
	
	@AfterClass
	public void closeBrowser() {
		delay(3);
		driver.quit();
	}
	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			// TODO: handle exception
		e.printStackTrace();
		}
	}
	static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
	}
}