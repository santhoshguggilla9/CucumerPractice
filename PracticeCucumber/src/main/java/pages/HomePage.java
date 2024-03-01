package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	WebDriver driver;
	
	@FindBy(linkText="Shopping cart")
	WebElement shoppingCart;
	
	//By shoppingCart = By.linkText("Shopping cart");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void validateLink()
	{
		String textShoping =shoppingCart.getText();
		
		if(textShoping.equalsIgnoreCase("Shopping cart"))
		{
			System.out.println("User navigated to homepage successfully!!");
		}
	}
}
