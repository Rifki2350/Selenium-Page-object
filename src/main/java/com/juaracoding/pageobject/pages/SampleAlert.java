package com.juaracoding.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

public class SampleAlert {

private WebDriver driver;
	
	public SampleAlert() {
		this.driver = DriverSingelton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='confirmButton']" )
	private WebElement btnClickMe;
	
	@FindBy(xpath = "//button[@id='promtButton']" )
	private WebElement btnClickMeTwo;
	
	@FindBy(xpath = "//span[@id='confirmResult']")
	private WebElement txtConfirmResult;
	
	@FindBy(xpath = "//span[@id='promtButton']")
	private WebElement txtPromptResult;
	
	
	
	public void clickMe() {
		btnClickMe.click();
	}
	public void clickMeTwo() {
		btnClickMeTwo.click();
	}
	
	public String getTXTConfirmResult() {
		return txtConfirmResult.getText();
	}
	
	public String getTXTPromptResult() {
		return txtPromptResult.getText();
	}

	
	
	
	
}
