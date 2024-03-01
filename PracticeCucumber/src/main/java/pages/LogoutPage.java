package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	WebDriver driver;
	
	@FindBy(xpath="//a[@class='ico-logout']")
	WebElement logout;
	
	//By logout= By.xpath("//a[@class='ico-logout']");
	
	
	public LogoutPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logout()
	{
		logout.click();
	}
}
