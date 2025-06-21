package opencart.test;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import opencart.Assertions.Loginassertions;
import opencart.webpage.Baseclass;
import opencart.webpage.Loginpage;
import utility.Configreader;

public class LogintoOpenCart extends Baseclass
{
	@Test
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
