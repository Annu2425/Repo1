package testScripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePagePO;
import pom.TwitterGoogleResultPO;

public class TwitterTest extends BaseTest {
	
	@Test
	public void twitTest()
	{
		driver.get(TEST_URL);
		GooglePagePO googlePagePO = new GooglePagePO(driver);
		googlePagePO.srchTxtBx().sendKeys("Twitter");
		googlePagePO.srchTxtBx().sendKeys(Keys.ENTER);
		
		TwitterGoogleResultPO twPo = new TwitterGoogleResultPO(driver);
		int count=twPo.TwitterSrchBxSize();
		System.out.println(count);
		
		twPo.TwitterResSrchBx().click();
		
		/*try {
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		} catch (InterruptedException e) {

		}*/
		
		try {
			String eTitle="Login on Twitter";
			String aTitle=driver.getTitle();
			Assert.assertEquals(eTitle, aTitle);
		} catch (Exception e) {
			
			Reporter.log("Exception Generated",true);
			Assert.fail();
		}
		
		
	}

}
