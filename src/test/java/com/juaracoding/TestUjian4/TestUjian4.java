package com.juaracoding.TestUjian4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.Ujian4.Ujian4;
import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;

public class TestUjian4 {
	public static WebDriver driver;
	private Ujian4 ujian4;

	@BeforeClass
	public void setUp() {
		DriverSingelton.getInstance("Chrome");
		driver = DriverSingelton.getDriver();

		String url = "https://shop.demoqa.com/my-account/";
		driver.get(url);

	}

	@BeforeMethod
	public void pageObjectTwo() {
		ujian4 = new Ujian4();
	}

	@Test
	public void testUjian4() {

		delay(3);
		scroll(700);
		ujian4.Reguser();
		ujian4.Regemail();
		ujian4.Regpassword();
		ujian4.Regbtn();
		System.out.println("You have successfully Registered a New Account.");

		delay(3);
		ujian4.Loginuser();
		ujian4.Loginpassword();
		ujian4.Loginbtn();
		System.out.println("Your newly created account is successfully logged in.");

		delay(3);
		ujian4.Orderbtn();
		System.out.println("You're entering your order page.");
		ujian4.Browbtn();
		System.out.println("Do you wish to browse to other products?");
		ujian4.Searchbtn();
		ujian4.SearchInput();
		System.out.println("You're successfully search of your keyword");

		delay(3);
		ujian4.CompareOne();
		System.out.println("You have added a product to compare list.");
		delay(3);
		ujian4.CloseWindow();

		delay(3);
		ujian4.ClickProduct();
		System.out.println("You are looking on Product detail page.");

		scroll(700);

		delay(3);
		ujian4.CompareTwo();
		System.out.println("You have added product 2 to compare list.");

		delay(3);
		driver.switchTo().frame(driver.findElement(By.cssSelector("#cboxLoadedContent > iframe")));

		delay(3);
		ujian4.PilihProduct();
		System.out.println("You have selected a product detail.");

		delay(3);
		scroll(700);
		ujian4.AddCart();
		System.out.println("You have added a product to a cart.");
		ujian4.viewCart();
		System.out.println("You viewed your cart.");

		scroll(700);
		ujian4.Checkout();
		System.out.println("You proceed your cart to Check out.");
		delay(3);

		scroll(700);
		ujian4.FirstName();
		ujian4.LastName();
		ujian4.Company();
		scroll(300);

		delay(3);
//		postTestNineteen.selectIndo();

		delay(3);
		ujian4.NumberHouse();
		ujian4.SuiteUnit();
		ujian4.TownCity();

		delay(3);
		ujian4.SelectProvince();
		ujian4.Province();

		delay(3);
		ujian4.PostCode();
		ujian4.PhoneNumber();
		ujian4.Note();
		System.out.println("You have successfully entered you billing detail.");

		delay(3);
		scroll(-300);
		ujian4.AgreeBox();

		delay(3);
		ujian4.btnplaceorder();
		System.out.println("Congratulation! your order was successfully created.");

		delay(5);

	}

	@AfterClass
	public void closeBrowser() {
		delay(3);
		driver.quit();
	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + vertical + ")");
	}
}
