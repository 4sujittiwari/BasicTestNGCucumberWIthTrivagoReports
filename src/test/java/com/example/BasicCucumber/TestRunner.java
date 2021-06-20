package com.example.BasicCucumber;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import com.codeborne.selenide.Configuration;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(plugin = { "pretty", "json:target/cucumber-reports/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		Configuration.headless = true;
		return super.scenarios();
	}

}
