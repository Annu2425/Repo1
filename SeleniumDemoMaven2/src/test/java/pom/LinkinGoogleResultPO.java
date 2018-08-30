package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class LinkinGoogleResultPO extends BasePage {

	public LinkinGoogleResultPO(WebDriver driver) {
		super(driver);
		
	}
	
	// To find all links
	@FindBy(xpath="//a")
	
	private List<WebElement> linkinSrchBx;
	public int linkinSrchBxSize()
	{
		return linkinSrchBx.size();
	}
	
	// To find first link
	
	@FindBy(xpath="//a[text()='LinkedIn: Log In or Sign Up']")
	private WebElement linkinResSrchBx;
	public WebElement linkinResSrchBx()
	{
		return linkinResSrchBx;
		
	}
}
