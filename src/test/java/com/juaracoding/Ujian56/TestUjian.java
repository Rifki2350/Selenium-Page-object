package com.juaracoding.Ujian56;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Constans;

public class TestUjian {

	public static WebDriver driver;
	private SearchShop searchshop;
	private CheckOutShop checkoutshop;
	Boolean istDone;
	
	@Before
	public void setup() {
		DriverSingelton.getInstace("Chrome");
		searchshop = new SearchShop();
		checkoutshop = new CheckOutShop();
	}
	
	@After
	public void closeBrowser() {
		delay(3);
		if(istDone) {
			driver.close();
		}
	}
	
	@Given("User go to web shop")
	public void User_go_to_web_shop() {
		driver = DriverSingelton.getDriver();
		driver.get(Constans.URL);
	}
	
	@When("User click search first item")
	public void User_click_search_first_item() {
		searchshop.SearchItem("pink drop");
		delay(2);
	}
	
	@And("User add first item to cart")
	public void User_add_first_item_to_cart() {
		scroll(500);
		searchshop.SelectColorSize(1, 1);
		delay(3);
	}
	@Then( "click search second cart")
	public void User_click_search_second_cart() {
		searchshop.SearchItem("denim");
	}
	
	@And("User add second item to cart")
	public void User_add_second_item_to_cart() {
		scroll(500);
		searchshop.SelectColorSize(1, 1);
		delay(3);
	}
	
	@Then("User click view cart")
	public void User_click_view_cart() {
		searchshop.ViewCart();
	}
	
	@And("User click view checkout")
	public void User_click_view_checkout() {
		searchshop.checkout();
		delay(3);
	}
	
	@When("User input data")
	public void User_input_data() {
		scroll(500);
		delay(3);
		checkoutshop.InputData();
	}
	
	@And("User click place order")
	public void User_click_place_order() {
		scroll(500);
		delay(3);
		checkoutshop.placeorder();
	}
	
	@Then("User Your order has been received")
	public void User_Your_order_has_been_received() {
		assertEquals(checkoutshop.HasilAkhir(), "Thank you. Your order has been received.");
		istDone=true;
	}
	
	
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	
	static void scroll(int vertikal) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+vertikal+")");
	}
}
