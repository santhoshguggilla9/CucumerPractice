package toscaStepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;

public class ToscaStepDef {

	WebDriver driver;
	LoginPage log = null;
	HomePage home = null;
	LogoutPage out = null;
	
	@Before
	public void setDriver()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		log = new LoginPage(driver);
		home = new HomePage(driver);
		out = new LogoutPage(driver);
	}
	
	@Given("user should go to the valid url")
	public void user_should_go_to_the_valid_url() {
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	}
	
	@When("user click on login button")
	public void user_click_on_login_button() 
	{
	    log.clickIntialLoginButton();
	}
	@When("^user enters (.*) and (.*)$")
	public void user_enters_email_and_password(String uname, String pwd) {
	   log.enterCreds(uname, pwd);
	}
	@When("user should click on login button")
	public void user_should_click_on_login_button() {
	   log.clickLogin();
	}
	@Then("user should navigate to the homepage")
	public void user_should_navigate_to_the_homepage() {
	    home.validateLink();
	}
	@Then("user should click on logout")
	public void user_should_click_on_logout() {
	    out.logout();
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
}
