package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class GooglePagePO extends BasePage {

	public GooglePagePO(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(name="q")
	private WebElement srchTxtBx;
	public WebElement srchTxtBx()
	{
		return srchTxtBx;	
	}
	
	public void Search(String str)
	{
		srchTxtBx().sendKeys(str);
		srchTxtBx().sendKeys(Keys.ENTER);
	}

}
