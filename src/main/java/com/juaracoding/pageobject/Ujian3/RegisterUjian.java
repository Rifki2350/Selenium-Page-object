package com.juaracoding.pageobject.Ujian3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

public class RegisterUjian {

private WebDriver driver;

public RegisterUjian() {
	this.driver = DriverSingelton.getDriver();
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//input[@id='reg_username']")
private WebElement regusername;	

@FindBy(xpath = "//input[@id='reg_email']")
private WebElement regemail;

@FindBy(xpath = "//input[@id='reg_password']")
private WebElement regpassword;


@FindBy(xpath = "//form[@class='woocommerce-form woocommerce-form-register register']//span[@class='show-password-input']")
private WebElement btn;

@FindBy(xpath = "//button[@name='register']")
private WebElement button;



public void register(String regusername, String regemail, String regpassword ) {
	this.regusername.sendKeys(regusername);
	this.regemail.sendKeys(regemail);
	this.regpassword.sendKeys(regpassword);
	btn.click();
	button.click();
}

}

