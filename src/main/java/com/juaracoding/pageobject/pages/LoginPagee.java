package com.juaracoding.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

public class LoginPagee {

	private WebDriver driver;

	public LoginPagee() {
		this.driver = DriverSingelton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='txtUsername']")
	private WebElement username;

	@FindBy(xpath = "//*[@id='txtPassword']")
	private WebElement password;

	@FindBy(xpath = "//*[@id='btnLogin']")
	private WebElement btn;

	@FindBy(xpath = "//span[@id='spanMessage']")
	private WebElement msgEror;

	@FindBy(xpath = "//h1[normalize-space()='Dashboard']")
	private WebElement txtDashboard;

	// Actual
	public String msgInvalid() {
		return msgEror.getText();
	}

	public String getTxtDashboard() {
		return txtDashboard.getText();
	}

	public void login(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(username);
		btn.click();
	}

}
