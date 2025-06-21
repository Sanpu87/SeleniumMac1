package opencart.webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNewProductPage 
{
	WebDriver driver;
	public AddNewProductPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private By addNew= By.xpath("//div[@class='pull-right']//a[@data-original-title='Add New']");
	private By headingPage=By.xpath("(//h3[@class='panel-title'])[1]");
	private By productName=By.id("input-name1");
	private By megaTageTitle =By.id("input-meta-title1");
	private By dataMenu=By.xpath("//ul[@class='nav nav-tabs']//li//a[.='Data']");
	private By model=By.id("input-model");
	private By dateAvailable=By.xpath("//button[@class='btn btn-default']");
	private By saveApplyButtons=By.xpath("//div[@class='pull-right']//button[@data-original-title='Save']");
	
	
	
	
	public void clickonAddNew()
	{
		driver.findElement(addNew).click();
	}
	public String getheadingPage()
	{
		return driver.findElement(headingPage).getText();
	}
	public void enterproductName(String Productsname)
	{
		driver.findElement(productName).sendKeys(Productsname);
	}
	public void enterMegaTageTitle(String Title)
	{
		driver.findElement(megaTageTitle).sendKeys(Title);
	}
	public void clickOndataMenuBar()
	{
		driver.findElement(dataMenu).click();
	}
	public void enterModel(String modelName)
	{
		driver.findElement(model).sendKeys(modelName);
	}
	public void selectDateAvailable()
	{
		driver.findElement(dateAvailable).click();
	}
	public void ClicksaveAButton()
	{
		driver.findElement(saveApplyButtons).click();
	}
}
