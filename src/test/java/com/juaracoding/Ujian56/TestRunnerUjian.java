package com.juaracoding.Ujian56;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = ""
							,features = "/com.juaracoding.pageoject/src/test/resources/features/LoginUjian.feature"
							,glue = "")

public class TestRunnerUjian extends AbstractTestNGCucumberTests {

}
