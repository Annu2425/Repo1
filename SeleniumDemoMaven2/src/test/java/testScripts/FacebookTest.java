package testScripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.FbGoogleResultPO;
import pom.GooglePagePO;

public class FacebookTest extends BaseTest {
	
	@Test
	public void fbTest()
	{
		driver.get(TEST_URL);
		GooglePagePO goPagePO = new GooglePagePO(driver);
		goPagePO.srchTxtBx().sendKeys("facebook");
		goPagePO.srchTxtBx().sendKeys(Keys.ENTER);
		
		FbGoogleResultPO fbPo = new FbGoogleResultPO(driver);
		int count = fbPo.fbSearchLinkSize();
		System.out.println(count);
		
		fbPo.fbSearchResultLink().click();
		
		/*try {
			Thread.sleep(2000);

			System.out.println(driver.getTitle());
			//String eTitle = driver.getTitle();
			//Reporter.log(eTitle);
		} catch (InterruptedException e) {
			
		}
*/		
		try {
			String eTitle = "Facebook – log in or sign up" ;
			String aTitle= driver.getTitle();
			Assert.assertEquals(eTitle, aTitle);
			//Reporter.log(" Exception not generated",true);
		} catch (Exception e) {
			
			Reporter.log("Exception Generated", true);
			Assert.fail();
			

		}
		
		
		
		
	}

}
