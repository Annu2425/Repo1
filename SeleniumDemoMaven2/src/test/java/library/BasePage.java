package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public BasePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, 20);	
	}
	
	public void isTitle(String title)
	{
		try {
			wait.until(ExpectedConditions.titleIs(title));
			Reporter.log("Title is matching", true);
		} catch (Exception e) {
			Reporter.log("Title is not matching",true);
			}
		
		
	}
	
	public void isWebElement(WebElement element)
	{
		try {
			wait.until(ExpectedConditions.invisibilityOf(element));
			Reporter.log("WebElement is present", true);
		} catch (Exception e) {
			Reporter.log("WebElement not present", true);
			
			}
		
	}
}



