package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class FacebookGoogleResultPO extends BasePage {

	public FacebookGoogleResultPO(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//a")
	
	private List<WebElement> allFbLinks;
	public int allFbLinksSize()
	{
		return allFbLinks.size();
		
	}
	
	/*public WebElement getAllFbLinks(int i)
	{
		return allFbLinks.get(i);
		
	}
	*/
	@FindBy(xpath="//a[text='")
	
	
	private WebElement fbSrcResLink;
	public WebElement fbSrcResLink()
	{
		return fbSrcResLink;
	}
	
	
	
	

	
	

	
}
