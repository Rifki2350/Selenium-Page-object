package com.juaracoding.pageoject.PostTest26;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.pageoject.drivers.Drivers.DriverSingelton;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Constans;
import utils.TestScenario;
import utils.Utils;

public class TestHook26 {
	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports("target/extent-report.html");

	@Before
	public void methodBefore() {
		DriverSingelton.getInstance(Constans.CHROME);
		driver = DriverSingelton.getDriver();
		TestScenario[] tests = TestScenario.values();
		extentTest = reports.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			String screenshotpath = Utils.getScreenshot(driver, scenario.getName().replace(" ","_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
			+extentTest.addScreenCapture(screenshotpath));
		}
	}
	
	@After
	public void closeObejct() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
	@AfterAll
	public static void methodAfter() {
		delay(3);
		DriverSingelton.CloseObjectInstance();;
	}
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	static void scroll(int vertikal) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+vertikal+")");
	}
}
