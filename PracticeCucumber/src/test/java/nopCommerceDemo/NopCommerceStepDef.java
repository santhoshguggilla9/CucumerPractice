package nopCommerceDemo;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NopCommerceStepDef {

	WebDriver driver;
	
	@Given("user should enter into the login page")
	public void user_should_enter_into_the_login_page() 
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String uname, String pwd) 
	{
	   driver.findElement(By.id("user-name")).sendKeys(uname);
	   driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@When("user should click on login button")
	public void user_should_click_on_login_button() 
	{
	 driver.findElement(By.id("login-button")).click();  
	}
	
	@Then("user should enter into the homepage")
	public void user_should_enter_into_the_homepage() 
	{
	    WebElement head = driver.findElement(By.linkText("Sauce Labs Backpack"));
	    
	    String actual = head.getText();
	    String expected = "Sauce Labs Backpack";
	    
	    Assert.assertEquals(expected, actual);
	    
	    driver.close();
	}
}
