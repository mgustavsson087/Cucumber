package com.teliacarrier.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features", glue={"com.teliacarrier.stepdefination"})
public class Runner {

	public static void main(String[] args) throws Throwable {

	}

}
