package com.juaracoding.pageobject.Postest18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

public class PostTestAdd {
	private WebDriver driver;

	public PostTestAdd() {
		this.driver = DriverSingelton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement btnSearch;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchInput;

	@FindBy(css = ".add_to_wishlist.single_add_to_wishlist[href='?add_to_wishlist=1485&_wpnonce=1c6417cf84']")
	private WebElement wishlist;

	@FindBy(css = ".add_to_wishlist.single_add_to_wishlist[href='?add_to_wishlist=1441&_wpnonce=1c6417cf84']")
	private WebElement wishlistTwo;

	@FindBy(xpath = "//div[contains(@class,'yith-wcwl-add-to-wishlist add-to-wishlist-1441 exists wishlist-fragment on-first-load')]//a[contains(text(),'Browse Wishlist')]")
	private WebElement wishlistList;

	@FindBy(css = "tr[id='yith-wcwl-row-1441'] td[class='product-name'] a")
	private WebElement blackOne;

	@FindBy(css = "tr[id='yith-wcwl-row-1485'] td[class='product-name'] a")
	private WebElement blackTwo;

	public void search() {
		btnSearch.click();
	}

	public void searchInput() {
		this.searchInput.sendKeys("black" + "\n");
	}

	public void wishlist() {
		wishlist.click();
	}

	public void wishlistTwo() {
		wishlistTwo.click();
	}

	public void wishlistList() {
		wishlistList.click();

	}

	public String getTxtBlackOne() {
		return blackOne.getText();
	}

	public String getTxtBlackTwo() {
		return blackTwo.getText();
	}
}

