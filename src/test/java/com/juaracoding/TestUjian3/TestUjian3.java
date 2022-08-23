package com.juaracoding.TestUjian3;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.juaracoding.pageobject.Ujian3.LoginUjian;
import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

public class TestUjian3 {
	public static WebDriver driver;
	private LoginUjian loginujian;
	
	
	@BeforeClass
	public void setUp() {
		DriverSingelton.getInstance("Chrome");
		driver = DriverSingelton.getDriver();
		String url= "https://shop.demoqa.com/my-account/";
		driver.get(url);
	}
	@BeforeMethod
	 public void pageobject() {
		loginujian=new LoginUjian();
	}
	
	@Test
	public void testInvalidLogin() {
		loginujian.login("rifkisq","Rifkiy1234!");
		assertEquals(loginujian.msgInvalid(), "ERROR: The username or password you entered is incorrect. Lost your password?");
	}
	
	@Test
	public void testValidLogin() {
		loginujian.login("rifkisq","Rifki1234!");
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
