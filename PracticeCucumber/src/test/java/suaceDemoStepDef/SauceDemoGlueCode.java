package suaceDemoStepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoGlueCode {

	WebDriver driver;
	
	@Before("@sanitytest")
	public void test_purpose()
	{
		System.out.println("it is for testing hools and tags");
	}
	@Given("user should enter the loginpage")
	public void user_should_enter_the_loginpage() 
	{
	   
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	}
	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String uname, String pwd) 
	{
		
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	}
	@When("user should click on login button")
	public void user_should_click_on_login_button() 
	{
		  driver.findElement(By.xpath("//input[@id='login-button']")).click();   
	}
	@Then("user should see the homepage")
	public void user_should_see_the_homepage() {
	    
		System.out.println("User entered homepage successfully");
		
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
		driver.close();
	}
}
