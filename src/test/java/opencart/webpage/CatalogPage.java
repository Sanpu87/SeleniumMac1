package opencart.webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CatalogPage 
{
	WebDriver driver;
	public CatalogPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By catalogFields= By.xpath("//li[@id='menu-catalog']//a[@href='#collapse1']");
	private By catagoryies =By.xpath("//li[@id='menu-catalog']//li//a[.='Categories']");
	private By productss=By.xpath("//li[@id='menu-catalog']//li//a[.='Products']");
	
	private By editCatofryHeading =By.xpath("//div[@id='content']//h3//i");
	
	
	public WebElement editCatoryPage()
	{
		return driver.findElement(editCatofryHeading);
	}
	
	public void clickOncatalogFields()
	{
		driver.findElement(catalogFields).click();
	}
	public WebElement clickOncatagoryies()
	{
		return driver.findElement(catagoryies);
	}
	
	public void  clickOnEditIcon(String categoryName)
	{
		String editIcon="//td[text()='" + categoryName + "']/following-sibling::td//a[@data-original-title='Edit']";
		driver.findElement(By.xpath(editIcon)).click();
	}
	public void clickOnProductsCatalog()
	{
		driver.findElement(productss).click();
	}
	
	

}
