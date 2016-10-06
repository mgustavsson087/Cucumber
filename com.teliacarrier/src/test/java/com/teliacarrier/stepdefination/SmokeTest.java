package com.teliacarrier.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;
	
	
	@Given("^Open Facebook and start application$")
	public void Open_Facebook_and_start_application() throws Throwable {
		
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
			
		
	}

	@When("^I enter username$")
	public void I_enter_username() throws Throwable {
	    
		driver.findElement(By.id("email")).sendKeys("test@test.com");
		driver.findElement(By.id("pass")).sendKeys("pass");
	}

	@Then("^user should log in$")
	public void user_should_log_in() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	   
	}

	
	
	
}
