package testScript;

//import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
//import org.testng.Assert;
//import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
//import net.bytebuddy.asm.Advice.Enter;
import pom.FacebookGoogleResultPO;
import pom.GooglePagePO;

public class FacebookTest extends BaseTest{
	
	@Test
	public void fbTest()
	{
		driver.get(TEST_URL);
		GooglePagePO googlePagePO = new GooglePagePO(driver);
		googlePagePO.searchTxtBx().sendKeys("facebook");
		googlePagePO.searchTxtBx().sendKeys(Keys.ENTER);
		//googlePagePO.Search("facebook");
		
		FacebookGoogleResultPO facebookGoogleResultPO = new FacebookGoogleResultPO(driver);
		 int count =  facebookGoogleResultPO.allFbLinksSize();
		 System.out.println(count);
		//Reporter.log("Total number of links" +facebookGoogleResultPO.allFbLinksSize());
		 
		facebookGoogleResultPO.fbSrcResLink().click();
		
		try {
			Thread.sleep(2000);
			
			System.out.println(driver.getTitle());
		} catch (InterruptedException e) {
			
		}
		/*
		try {
			String eTitle = "Facebook----";
			facebookGoogleResultPO.checkTitle(eTitle);
			String aTitle=driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {
			
			Reporter.log("Exception Generated", true);
			Assert.fail();
		}
		*/
		
				
		
	}
	
}

	
	

