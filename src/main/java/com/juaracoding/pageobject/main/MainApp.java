package com.juaracoding.pageobject.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver; 
import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;
import com.juaracoding.pageobject.Ujian3.LoginUjian;
import com.juaracoding.pageobject.Ujian3.RegisterUjian;

public class MainApp {

	public static void main(String[] args) {
		
		DriverSingelton.getInstance("Chrome");
		WebDriver driver = DriverSingelton.getDriver();
		String url="https://shop.demoqa.com/my-account/";
		driver.get(url);
		
		LoginUjian LoginUjian = new LoginUjian();
		LoginUjian.login("rifkisq","Rifki123");
		
//		scroll(700);
		
		RegisterUjian Register = new RegisterUjian();
		Register.register("rifkisq","saifulqadrm23@gmail.com","Rifki1234!");
		
		
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
//	static void scroll(int vertical) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,700)");
//	}

}