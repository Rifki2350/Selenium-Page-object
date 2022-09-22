package com.juaracoding.pageoject.PostTest26;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.juaracoding.Ujian56.CheckOutShop;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestPlaceOrder {
	public static WebDriver driver;
	private static ExtentTest extentTest;
	private CheckOutShop checkoutshop = new CheckOutShop();
	
	public TestPlaceOrder() {
		driver = TestHook26.driver;
		extentTest = TestHook26.extentTest;
	}
	
	@When("User input data")
	public void user_input_data() {
		TestHook26.delay(2);
		TestHook26.scroll(700);
		TestHook26.delay(2);
		checkoutshop.InputData();
		System.out.println("Memasukan data");
		extentTest.log(LogStatus.PASS,"User input data");
	}
	
	@And("User click place order")
	public void user_click_place_order() {
		checkoutshop.placeorder();
		System.out.println("Submit pesanan");
		extentTest.log(LogStatus.PASS,"User click place order");
	}
	
	@Then("User your order has been received")
	public void user_your_order_has_been_received() {
		assertEquals(checkoutshop.HasilAkhir(), "Thank you. Your order has been received.");
		System.out.println("Pesanan berhasil");
		extentTest.log(LogStatus.PASS,"User Your order has been received");
	}	
}
