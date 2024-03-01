package suaceDemoStepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDef {
	
	WebDriver driver;
	@Given("user should enter google url")
	public void user_should_enter_google_url() {
	   driver =new ChromeDriver();
	   
	   driver.get("https://www.google.com");
	}

	@When("user enters the search key")
	public void user_enters_the_search_key() {
	  driver.findElement(By.name("q")).sendKeys("testing" +Keys.ENTER);
	}

	@Then("user should see the results")
	public void user_should_see_the_results() {
	   driver.close();
	}
}
