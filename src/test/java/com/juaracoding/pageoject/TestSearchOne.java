package com.juaracoding.pageoject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.Postest18.PostTestAdd;
import com.juaracoding.pageobject.Postest18.PostTestSearch;
import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

public class TestSearchOne {
	public static WebDriver driver;
	private PostTestSearch Search;
	
	
	@BeforeClass
	public void setUp() {
		DriverSingelton.getInstance("Chrome");
		driver = DriverSingelton.getDriver();
		String url= "https://shop.demoqa.com/ ";
		driver.get(url);
	}
	@BeforeMethod
	 public void pageobject() {
		Search = new PostTestSearch();
	}
	
	@Test
	public void testSearch() {
		Search.btnsearch();
		Search.txtsearch();
		Search.btnsrch();
		Search.btnsrchtwo();
		Search.btnsrchtwo();
		scroll(700);
		Search.btnbaju();
		Search.btn();
		
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
	static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
	}
}
