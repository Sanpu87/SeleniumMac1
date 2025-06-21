package opencart.test;

import org.testng.annotations.Test;

import opencart.Assertions.Loginassertions;
import opencart.webpage.AddNewProductPage;
import opencart.webpage.Baseclass;
import opencart.webpage.CatalogPage;

public class AddProducts extends Baseclass
{
	@Test
	public void addNewProducts() 
	{
		userLogin();
		CatalogPage cp=new CatalogPage(driver);
		cp.clickOncatalogFields();
		cp.clickOnProductsCatalog();
		AddNewProductPage ap=new AddNewProductPage(driver);
		ap.clickonAddNew();
		Loginassertions.verifyAddProductheadingTitle(ap, "Add Product");
		ap.enterproductName("SanProduct");
		ap.enterMegaTageTitle("sanTitle");
		ap.clickOndataMenuBar();
		ap.enterModel("SanModel");
		ap.ClicksaveAButton();
		
		
	}
	

}
