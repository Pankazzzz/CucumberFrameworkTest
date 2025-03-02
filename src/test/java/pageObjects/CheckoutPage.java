package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutPage {
	public WebDriver driver;

	public CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	By cartBag = By.cssSelector("[alt='Cart']");
	By checkOutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoBtn = By.cssSelector(".promoBtn");
	By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");
	By checkCartBy=By.xpath("//li//p[@class='product-name']");
	
	public void CheckoutItems()
	{
		driver.findElement(cartBag).click();
		driver.findElement(checkOutButton).click();
	}
	
	public Boolean VerifyPromoBtn()
	{
		return driver.findElement(promoBtn).isDisplayed();
	}
	
	public Boolean VerifyPlaceOrder()
	{
		return driver.findElement(placeOrder).isDisplayed();
	}
	
	public String verifyProduct()
	{
		return driver.findElement(checkCartBy).getText().split("-")[0].trim();
	}
		
}
