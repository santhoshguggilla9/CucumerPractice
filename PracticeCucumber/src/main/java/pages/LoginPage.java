package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(xpath="//a[@class='ico-login']")
	WebElement btnLogin;
	
	@FindBy(id="Email")
	WebElement txtEmail;
	
	@FindBy(id="Password")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement login;
	
//By btnLogin = By.xpath("//a[@class='ico-login']");
	
//	By txtEmail = By.id("Email");
//	By txtPassword = By.id("Password");
//	By login = By.xpath("//input[@value='Log in']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickIntialLoginButton()
	{
		btnLogin.click();
	}
	public void enterCreds(String uname,String pwd)
	{
		txtEmail.sendKeys(uname);
		txtPassword.sendKeys(pwd);
	}
	public void clickLogin()
	{
		login.click();
	}
}
