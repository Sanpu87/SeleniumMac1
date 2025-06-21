package opencart.webpage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import opencart.Assertions.Loginassertions;
import utility.Configreader;

public class Baseclass 
{
	
	protected WebDriver driver;
	@BeforeMethod
	
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(Configreader.get("url"));
		
	}
	@AfterMethod
	public void tearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}	
	}
	public void userLogin()
	{
		Loginpage lp=new Loginpage(driver);
		lp.login(Configreader.get("username"), Configreader.get("password"));
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement dashboard = lp.getDashboardHeading();
		wait.until(ExpectedConditions.visibilityOf (dashboard));
		Loginassertions.verifyDashboardIsVisible(dashboard);
	}
}
