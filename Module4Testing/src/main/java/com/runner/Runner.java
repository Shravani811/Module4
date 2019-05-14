package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\home\\eclipse-workspace\\Module4Testing\\src\\main\\java\\feature\\register.feature",
					glue = {"com.stepDefinition" })
public class Runner {

}
