package opencart.Assertions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import opencart.webpage.AddNewProductPage;

public class Loginassertions 
{
	
	public static void verifyDashboardIsVisible(WebElement dashboard)
	{
		Assert.assertTrue(dashboard.isDisplayed(),"Login-Failed dashboard is not found");
	}
	public static void verifyEditcatoryIsDisplayed(WebElement editCatoryPage)
	{
		
		Assert.assertTrue(editCatoryPage.isDisplayed(),"Clicking od edit icon is failed");
	}
	public static void verifyAddProductheadingTitle(AddNewProductPage AddNewProductPage,String expectedtitle)
	{
		Assert.assertEquals(AddNewProductPage.getheadingPage(),expectedtitle,"Add new Product page heading missmatch");
	}
	
}
