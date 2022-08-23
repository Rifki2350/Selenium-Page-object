package com.juaracoding.pageoject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.pages.Modal;
import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TestModal {

	public static WebDriver driver;
	private Modal modal;

	@BeforeClass

		public void setUp() {
			DriverSingelton.getInstance("Chrome");
			driver = DriverSingelton.getDriver();
			String url= "https://demoqa.com/modal-dialogs";
			driver.get(url);
		}
		
		@BeforeMethod
		public void pageobject() {
			modal = new Modal();
		}
		
		@Test
		public void testModal() {
			modal.clickSmallModal();
			System.out.println(modal.getTitleModal());
			System.out.println(modal.getBodyModal());
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

