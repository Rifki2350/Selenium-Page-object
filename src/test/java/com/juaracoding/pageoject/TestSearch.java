package com.juaracoding.pageoject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.Postest18.PostTestAdd;
import com.juaracoding.pageobject.Postest18.PostTestSearch;
import com.juaracoding.pageobject.pages.LoginPagee;
import com.juaracoding.pageobject.pages.SampleAlert;
import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

public class TestSearch {

	public static WebDriver driver;
	private PostTestAdd Search;
	
	
	@BeforeClass
	public void setUp() {
		DriverSingelton.getInstance("Chrome");
		driver = DriverSingelton.getDriver();
		String url= "https://shop.demoqa.com/ ";
		driver.get(url);
	}
	@BeforeMethod
	 public void pageobject() {
		Search = new PostTestAdd();
	}
	
	@Test
	public void testSearch() {
		Search.search();
		Search.searchInput();
		Search.wishlist();
		Search.wishlistTwo();
		scroll(400);
		Search.wishlistList();
		Search.getTxtBlackOne();
		Search.getTxtBlackTwo();
		
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
