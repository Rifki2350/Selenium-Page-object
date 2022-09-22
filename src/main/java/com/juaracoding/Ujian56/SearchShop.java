package com.juaracoding.Ujian56;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

public class SearchShop {
private WebDriver driver;
	
	public SearchShop() {
		this.driver = DriverSingelton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement btnSearch;
	@FindBy(xpath = "//input[@name='s']")
	private WebElement InputSearch;
	@FindBy(xpath="//select[@id='pa_color']")
	private WebElement Inputcolor;
	@FindBy(xpath="//select[@id='pa_size']")
	private WebElement Inputsize;
	@FindBy(xpath="//button[normalize-space()='Add to cart']")
	private WebElement btnAddCart;
	@FindBy(xpath="//div[@role='alert']")
	private WebElement Alert;
	@FindBy(xpath="//a[@class='button wc-forward']")
	private WebElement btnCart;
	@FindBy(xpath="//a[normalize-space()='Compare']")
	private WebElement btnCompare;
	@FindBy(xpath="//button[@id='cboxClose']")
	private WebElement btnCloseCompare;
	@FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
	private WebElement BtnCheckOut;
	
	
	public void SearchItem(String Dicari) {
		btnSearch.click();
		InputSearch.sendKeys(Dicari);
		InputSearch.sendKeys(Keys.ENTER);
	}
	
	public void SelectColorSize(int color, int size) {
		Select warna = new Select(Inputcolor);
		Select ukuran = new Select(Inputsize);
		warna.selectByIndex(color);
		ukuran.selectByIndex(size);	
		btnAddCart.click();
	}
	
	public void compare() {
		btnCompare.click();
		delay(3);
		btnCloseCompare.click();
	}	
	public void ViewCart() {
		btnCart.click();
		delay(5);	
	}
	public void checkout() {
		BtnCheckOut.click();
	}
	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}

