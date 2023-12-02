package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
	
public class LoginStep {

	WebDriver driver;


	@Given("User is on the facebook page")
	public void user_is_on_the_facebook_page() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("User enter {string} and {string}")
	public void user_enter_and(String email, String pass) {
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(email);

		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(pass);

	}
	
	@When("User click login button")
	public void user_click_login_button() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}
	@Then("User should verify after login success message")
	public void user_should_verify_after_login_success_message() {
		System.out.println("Hi");
	}

}
