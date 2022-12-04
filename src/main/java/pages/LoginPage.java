package pages;

import java.awt.Button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameBox;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordBox;
	
	@FindBy(xpath = "//button[text()='login']")
    private WebElement Login;
	
	
	public LoginPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	public void enterCred(String username,String password)
	{
		usernameBox.sendKeys("Admin");
		passwordBox.sendKeys("admin123");
	}
	public void LoginClick()
	{
		Login.click();
	}
}
