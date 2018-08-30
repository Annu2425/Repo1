package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class TwitterGoogleResultPO extends BasePage {

	public TwitterGoogleResultPO(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a")
	
	private List<WebElement> TwitterSrchBx;
	public int TwitterSrchBxSize()
	{
		return TwitterSrchBx.size();
		
	}
	
	@FindBy(xpath="//a[text()='Login on Twitter']")
	
	private WebElement TwitterResSrchBx;
	public WebElement TwitterResSrchBx()
	{
		return TwitterResSrchBx;
		
	}
	

}
