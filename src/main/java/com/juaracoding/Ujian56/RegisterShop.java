package com.juaracoding.Ujian56;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

public class RegisterShop {
private WebDriver driver;
	
	public RegisterShop() {
		this.driver = DriverSingelton.getDriver();
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//a[@class='woocommerce-store-notice__dismiss-link']")
	private WebElement btnAlert;	
	@FindBy(xpath = "//a[@href='https://shop.demoqa.com/my-account/']")
	private WebElement btnAccount;	
	@FindBy(xpath = "//input[@id='reg_username']")
	private WebElement username;	
	@FindBy(xpath = "//input[@id='reg_email']")
	private WebElement email;	
	@FindBy(xpath = "//input[@id='reg_password']")
	private WebElement Password;	
	@FindBy(xpath = " //button[@name='register']")
	private WebElement btnRegister;	
	@FindBy(xpath = "//input[@id='user_login']")
	private WebElement usernamemsk;	
	@FindBy(xpath = "//input[@id='user_pass']")
	private WebElement passwordmsk;
	@FindBy(xpath = "//input[@id='wp-submit']")
	private WebElement btnLogin;

	public void register (String username, String email, String password) {
		btnAlert.click();
		btnAccount.click();
		delay(3);
		this.username.sendKeys(username);
		this.email.sendKeys(email);
		this.Password.sendKeys(password);
		btnRegister.click();
	}
	
	public void login(String username, String password) {
		usernamemsk.sendKeys(username);
		passwordmsk.sendKeys(password);
		btnLogin.click();
	}
	
	public void DismissAlert() {
		btnAlert.click();
	}
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
}
}
