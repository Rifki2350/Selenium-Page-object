package com.juaracoding.pageobject.Postest18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

public class PostTestSearch {
		private WebDriver driver;
			
			public PostTestSearch() {
				this.driver = DriverSingelton.getDriver();
				PageFactory.initElements(driver, this);
			}
			@FindBy(xpath = "//a[@class='noo-search']")
			private WebElement src;	
			
			@FindBy(xpath = "//input[@type='search']")
			private WebElement srcform;
			
			@FindBy(css = ".add_to_wishlist.single_add_to_wishlist[href='?add_to_wishlist=1485&_wpnonce=59f93f1fd6']")
			private WebElement btnsrch;
			
			@FindBy(css = ".add_to_wishlist.single_add_to_wishlist[href='?add_to_wishlist=1441&_wpnonce=59f93f1fd6']")
			private WebElement btnscrhtwo;
			
			@FindBy(xpath = "//a[normalize-space()='quay australia x jlo reina white sunglasses']")
			private WebElement baju;
			
			
			@FindBy(xpath = "//i[@class='icon_plus']")
			private WebElement plus;

			@FindBy(xpath = "//button[normalize-space()='Add to cart']")
			private WebElement btn;
			
			public void btnsearch() {
				src.click();
				
			}
			public void txtsearch() {
				srcform.sendKeys("White" +"\n");
			}
			public void btnsrch() {
				btnsrch.click();
			}
			public void btnsrchtwo() {
				btnscrhtwo.click();
			}
			public void btnbaju() {
				baju.click();
			}
			public void btnplus() {
				plus.click();
			}
			public void btn() {
				btn.click();
			}
			
			
}
