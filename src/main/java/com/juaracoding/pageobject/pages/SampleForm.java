package com.juaracoding.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

public class SampleForm {

		private SampleForm() {
		this.driver = DriverSingelton.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	@FindBy("id:genterWrapper")
	private List<WebElement> pilihGender;
	
	
}
