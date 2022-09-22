package com.juaracoding.pageoject.PostTest26;

import org.openqa.selenium.WebDriver;
import com.juaracoding.Ujian56.SearchShop;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Constans;

public class TestSelectItem {
	public static WebDriver driver;
	private static ExtentTest extentTest;
	private SearchShop searchshop = new SearchShop();
	
	
	public TestSelectItem() {
		driver = TestHook26.driver;
		extentTest = TestHook26.extentTest;
	}
	
	@When("User go to web shop")
	public void user_go_to_web_shop() {
		driver.get(Constans.URL);
		extentTest = TestHook26.extentTest;
		System.out.println("Masuk ke website");
		extentTest.log(LogStatus.PASS,"User go to web Shop");
	}
	
	
	@And("User click search first item")
	public void user_click_search_first_item() {
		searchshop.SearchItem("pink drop");
		System.out.println("Mencari item pertama");
		extentTest.log(LogStatus.PASS,"User click Search first item");
		TestHook26.delay(2);
	}
	
	@And("User add first item to cart")
	public void user_add_first_item_to_cart() {
		TestHook26.scroll(500);
		searchshop.SelectColorSize(1, 1);
		System.out.println("Memasukan item pertama kekeranjang ");
		extentTest.log(LogStatus.PASS,"User add first item to cart");
		TestHook26.delay(3);
	}
	
	@Then("User click search second cart")
	public void User_click_Search_second_cart() {
		searchshop.SearchItem("denim");
		System.out.println("Mencari item kedua");
		extentTest.log(LogStatus.PASS,"User click Search second cart");
		TestHook26.delay(2);
	}
	
	@And("User add second item to cart")
	public void user_add_second_item_to_cart() {
		TestHook26.scroll(500);
		searchshop.SelectColorSize(1, 1);
		System.out.println("Memasukan item kedua kekeranjang");
		extentTest.log(LogStatus.PASS,"User add Second item to cart");
		TestHook26.delay(3);
	}
	
	@Then("User click view cart")
	public void user_click_view_cart() {
		searchshop.ViewCart();
		System.out.println("Lihat keranjang");
		extentTest.log(LogStatus.PASS,"User click view cart");
	}
	
	@And("User click view Checkout")
	public void user_click_view_Checkout() {
		searchshop.checkout();
		System.out.println("Pindah kehalaman check Out");
		extentTest.log(LogStatus.PASS,"User click view Checkout");
		TestHook26.delay(3);
	}
}
