package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class InstaGoogleResultPO extends BasePage {

	public InstaGoogleResultPO(WebDriver driver) {
		super(driver);
		
	}
	
	// How many links in the webpage
	
	@FindBy(xpath="//a")
	
	private List<WebElement> instalink;
	public int instalinkSize()
	{
		return instalink.size();
	}
	
	// To click on first link in the web page
	
	@FindBy(xpath="//a[text()='Instagram']")
	private WebElement InstaSrchResLink;
	public WebElement InstaSrchResLink()
	{
		return InstaSrchResLink;
		
	}

}