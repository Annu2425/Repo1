package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class FbGoogleResultPO extends BasePage {

	public FbGoogleResultPO(WebDriver driver) {
		super(driver);

	}
	
	// How many links are there in the web page
	@FindBy(xpath="//a")
	
	private List<WebElement> fbSearchLink;
	public int fbSearchLinkSize()
	{
		return fbSearchLink.size();	
	}
	
	
	// TO slect the first link in the webpage
	
	@FindBy(xpath="//a[text()='Facebook - Log In or Sign Up']")
		
	private WebElement fbSearchResultLink;
	public WebElement fbSearchResultLink()
	{
		return fbSearchResultLink;
		
	}
	

	
}
