package com.juaracoding.pageobject.Ujian3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

public class LoginUjian {

private WebDriver driver;
	
	public LoginUjian() {
		this.driver = DriverSingelton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;	
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='rememberme']")
	private WebElement rememberme;
	
	
	@FindBy(xpath = "//input[@id='rememberme']")
	private WebElement remember;

	@FindBy(xpath = "//span[@class='show-password-input']")
	private WebElement btn;

	@FindBy(xpath = "//button[@name='login']")
	private WebElement button;

	
	public void login(String username, String password ) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		rememberme.click();
		button.click();
	}


	public String msgInvalid() {
		// TODO Auto-generated method stub
		return null;
	}
}
