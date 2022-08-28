package com.juaracoding.pageoject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

import io.cucumber.java.en.Given;

import com.juaracoding.pageobject.pages.LoginPagee;

public class TestLogin {

	public static WebDriver driver;
	private LoginPagee loginPagee;
	
	
	@BeforeClass
	public void setUp() {
		DriverSingelton.getInstance("Chrome");
		driver = DriverSingelton.getDriver();
		String url= "https://opensource-demo.orangeharlive.com/";
		driver.get(url);
	}
	@BeforeMethod
	 public void pageobject() {
		loginPagee=new LoginPagee();
	}
	
	@Test
	public void testInvalidLogin() {
		loginPagee.login("Admin","admin1234");
		assertEquals(loginPagee.msgInvalid(), "Invalid credentials");
	}
	
	@Test
	public void testValidLogin() {
		loginPagee.login("Admin","admin1234");
		assertEquals(loginPagee.getTxtDashboard(), "Dashboard");
	}
	
	
	@AfterClass
	public void closeBrowser() {
		delay(3);
		driver.quit();
	}
	
	@Given("User go to Web HRM")
	
	
	
	
	
	
	
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO: handle exception
		e.printStackTrace();
		}
	}
}
