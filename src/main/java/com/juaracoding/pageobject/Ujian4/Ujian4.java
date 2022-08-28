package com.juaracoding.pageobject.Ujian4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

public class Ujian4 {
private WebDriver driver;
	
	public Ujian4() {
	this.driver = DriverSingelton.getDriver();
	PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath = "//input[@id='reg_username']")
	private WebElement Reguser;
	
	@FindBy(xpath = "//input[@id='reg_email']")
	private WebElement Regemail;
	
	@FindBy(xpath = "//input[@id='reg_password']")
	private WebElement Regpassword;
	
	@FindBy(xpath = "//button[@name='register']")
	private WebElement Regbtn;
	
	//Login
	@FindBy(xpath = "//input[@id='user_login']")
	private WebElement Loginuser;
	
	@FindBy(xpath = "//input[@id='user_pass']")
	private WebElement Loginpassword;
	
	@FindBy(xpath = "//input[@id='wp-submit']")
	private WebElement Loginbtn;
	
	//order
	@FindBy(xpath = "//a[normalize-space()='Orders']")
	private WebElement Orderbtn;
	
	@FindBy(xpath = "//a[@class='woocommerce-Button button']")
	private WebElement Browbtn;
	
	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement Searchbtn;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement SearchInput;
	
	@FindBy(xpath = "//div[@class='noo-product-inner']//a[normalize-space()='white milkmaid hook and eye bodycon midi dress']")
	private WebElement Scrollwhite;
	
	@FindBy(xpath = ".compare.button[href='https://shop.demoqa.com?action=yith-woocompare-add-product&id=1485']")
	private WebElement CompareOne;
	
	@FindBy(xpath = "//*[@id=\\\"cboxClose\\\"]")
	private WebElement CloseWindow;
	
	@FindBy(xpath = "//a[normalize-space()='quay australia x jlo reina white sunglasses']")
	private WebElement ClickProduct;
	
	@FindBy(xpath = "\"//div[@class='summary entry-summary']//a[@class='compare button'][normalize-space()='Compare']\"")
	private WebElement CompareTwo;
	
	@FindBy(xpath = "a[aria-label='Select options for “quay australia x jlo reina white sunglasses”']")
	private WebElement PilihProduct;
	
	@FindBy(xpath = "//select[@id='pa_color']")
	private WebElement pilihColor;
	
	@FindBy(xpath = "//select[@id='pa_size']")
	private WebElement pilihSize;
	
	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
	private WebElement btnAddToCart;
	
	@FindBy(xpath = "//a[@class='button wc-forward']")
	private WebElement viewCart;
	
	@FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
	private WebElement CheckOut;
	
	@FindBy(xpath = "//input[@id='billing_first_name']")
	private WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='billing_last_name']")
	private WebElement LastName;
	
	@FindBy(xpath = "//input[@id='billing_company']")
	private WebElement Company;
	
	@FindBy(xpath = "#billing_address_1")
	private WebElement NumberHouse;
	
	@FindBy(xpath = "//input[@id='billing_address_2']")
	private WebElement SuiteUnit;
	
	@FindBy(xpath = "//input[@id='billing_city']")
	private WebElement TownCity;
	
	@FindBy(xpath = "#select2-billing_state-container")
	private WebElement SelectProvince;
	
	@FindBy(xpath = "//input[@role='combobox']")
	private WebElement Province;
	
	@FindBy(xpath = "//input[@id='billing_postcode']")
	private WebElement PostCode;
	
	@FindBy(xpath = "//input[@id='billing_phone']")
	private WebElement PhoneNumber;
	
	@FindBy(xpath = "//textarea[@id='order_comments']")
	private WebElement Note;
	
	@FindBy(xpath = "//input[@id='terms']")
	private WebElement AgreeBox;
	
	@FindBy(xpath = "//input[@id='terms']")
	private WebElement Btnplaceorder;
	
	//pengganti
	
	public void Reguser () {
		Reguser.sendKeys("rifki2399");
	}
	
	public void Regemail () {
		Regemail.sendKeys("fomenzae@gmail.com");
	}
	
	public void Regpassword() {
		Regpassword.sendKeys("Rifki1234!");
	}
	
	public void Regbtn() {
		Regbtn.click();
	}
	
	public void Loginuser() {
		Loginuser.sendKeys("rifki2399");
	}
	
	public void Loginpassword() {
		Loginpassword.sendKeys("Rifki1234!");
	}
	
	public void Loginbtn() {
		Loginbtn.click();
	}
	
	public void Orderbtn() {
		Orderbtn.click();
	}
	
	public void Browbtn() {
		Browbtn.click();
	}
	
	public void Searchbtn() {
		Searchbtn.click();
	}
	
	public void SearchInput() {
		SearchInput.sendKeys("White" +"\n");;
	}
	
	public void CompareOne() {
		CompareOne.click();
	}
	
	public void CloseWindow() {
		CloseWindow.click();
	}
	
	public void ClickProduct() {
		ClickProduct.click();
	}
	
	public void CompareTwo() {
		CompareTwo.click();
	}
	
	public void PilihProduct() {
		PilihProduct.click();
	}
	
	public void AddCart() {
		Select select = new Select(pilihColor);
		select.selectByValue("white");
		delay(3);
		pilihColor.click();
		
		Select selectOne = new Select(pilihSize);
		selectOne.selectByValue("one");
		delay(3);
		pilihSize.click();
		btnAddToCart.click();
	}
	
	public void viewCart() {
		viewCart.click();
	}
	
	public void Checkout() {
		CheckOut.click();
	}
	
	public void FirstName() {
		FirstName.sendKeys("Muhammad Rifky ");
	}
	
	public void LastName() {
		LastName.sendKeys("Saiful Qadr");
	}
	
	public void Company() {
		Company.sendKeys("PT. DIKA" );
	}
	
	public void NumberHouse() {
		NumberHouse.sendKeys("15Z");
	}
	
	public void SuiteUnit() {
		SuiteUnit.sendKeys("Blok AZ");
	}
	
	public void TownCity() {
		TownCity.sendKeys("Bandung");
	}
	
	public void SelectProvince() {
		SelectProvince.click();
	}
	
	public void Province() {
		Province.sendKeys("Jawa Barat");
	}
	
	public void PostCode() {
		PostCode.sendKeys("40531");
	}
	
	public void PhoneNumber() {
		PhoneNumber.sendKeys("081313079644");
	}
	
	public void Note() {
		Note.sendKeys("Pakai Kardus yang tebal");
	}
	
	public void AgreeBox() {
		AgreeBox.click();
	}
	
	public void btnplaceorder() {
		Btnplaceorder.click();
	}
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	