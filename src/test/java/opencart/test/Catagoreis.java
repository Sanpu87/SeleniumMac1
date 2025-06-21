package opencart.test;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import opencart.Assertions.Loginassertions;
import opencart.webpage.Baseclass;
import opencart.webpage.CatalogPage;

public class Catagoreis extends Baseclass
{
	@Test
	public void editCatgory() throws InterruptedException
	{
		userLogin();
		CatalogPage cp = new CatalogPage(driver);
		cp.clickOncatalogFields();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement catagories = cp.clickOncatagoryies();
		wait.until(ExpectedConditions.visibilityOf(catagories));
		catagories.click();
		cp.clickOnEditIcon("Desktops");
		Loginassertions.verifyEditcatoryIsDisplayed(cp.editCatoryPage());
	}

}
