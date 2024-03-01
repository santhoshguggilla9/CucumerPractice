package stepDefenitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstCucumberStepDef 
{

	WebDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@After
	public void teardown()
	{
		System.out.println("Test case executed successfully");
		driver.close();
	}
	
	@Given("user should give valid url")
	public void user_should_give_valid_url() 
	{
		
	   driver.manage().window().maximize();
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	}

	@When("^user enter search key is (.*)$")
	public void user_enter_search_key_is_testing(String str) throws InterruptedException 
	{
			driver.findElement(By.name("q")).sendKeys(str);
			Thread.sleep(60);
			System.out.println(str + "Passed");
	}

	@Then("user should get the results page")
	public void user_should_get_the_results_page() 
	{
		 System.out.println("user entered in results page");
		 
	}

}
