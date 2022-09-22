package com.juaracoding.pageoject.PostTest26;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = ""
							,features ={"src/test/resources/features/SelectItemUjian.feature"
										,"src/test/resources/features/PlaceOrderUjian.feature"}
							,glue = "com.juaracoding.pageoject.Ujian6"
							,plugin={"pretty","html:target/cucumber-reports.html"
							,"json:target/extent-report.html"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
