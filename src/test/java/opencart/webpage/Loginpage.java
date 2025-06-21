package opencart.webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage 
{
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By usernameField = By.name("username");
	private By passwordField = By.name("password");
	private By loginButton   = By.xpath("//button[@class='btn btn-primary']");
	private By dashboardPageheading = By.xpath("//div[@class='container-fluid']//h1");
	
	public void login(String usernaam,String pass )
	{
		driver.findElement(usernameField).sendKeys(usernaam);
		driver.findElement(passwordField).sendKeys(pass);
		driver.findElement(loginButton).click();
		
	}
	public WebElement getDashboardHeading()
	{
		return driver.findElement(dashboardPageheading);
	}
	

}
