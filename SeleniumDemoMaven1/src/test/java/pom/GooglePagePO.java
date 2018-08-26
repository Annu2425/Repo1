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
		private WebElement searchTxtBx;
		public WebElement searchTxtBx()
		{
			return searchTxtBx;
		}
		
		public void Search(String str)
		{
			searchTxtBx().sendKeys(str);
			searchTxtBx.sendKeys(Keys.ENTER);
			
			
		}
		
		
	}
	
	
	

