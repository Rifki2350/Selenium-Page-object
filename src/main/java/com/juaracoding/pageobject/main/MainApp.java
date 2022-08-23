package com.juaracoding.pageobject.main;

import org.openqa.selenium.WebDriver; 
import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;
import com.juaracoding.pageobject.pages.LoginPagee;

public class MainApp {

	public static void main(String[] args) {
		DriverSingelton.getInstance("Chrome");
		WebDriver driver = DriverSingelton.getDriver();
		String url="https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		
		LoginPagee LoginPagee=new LoginPagee();
		LoginPagee.login("Admin","admin1234");
		delay(3);
		driver.quit();
	
	}
	static void delay(int detik) {
	try {
		Thread.sleep(1000 * detik);
	} catch (InterruptedException e) {
		// TODO: handle finally clause
		e.printStackTrace();
	}
	}

}