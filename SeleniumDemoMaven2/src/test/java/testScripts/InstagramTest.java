package testScripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePagePO;
import pom.InstaGoogleResultPO;

public class InstagramTest extends BaseTest{
	
	@Test
	public void InstaTest()
	{
		driver.get(TEST_URL);
		GooglePagePO googlePagePO = new GooglePagePO(driver);
		googlePagePO.srchTxtBx().sendKeys("Instagram");
		googlePagePO.srchTxtBx().sendKeys(Keys.ENTER);
		
		// To find no of links in the webpage
		
		InstaGoogleResultPO inGoogleResultPO = new InstaGoogleResultPO(driver);
		int count = inGoogleResultPO.instalinkSize();
		System.out.println(count);
		
		inGoogleResultPO.InstaSrchResLink().click();
		
		/*try {
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		} catch (InterruptedException e){

		}*/
		
		try {
			String eTitle="Instagram";
			String aTitle=driver.getTitle();
			Assert.assertEquals(eTitle, aTitle);
		} catch (Exception e) {
			
			Reporter.log("Exception Generated",true);
			Assert.fail();
		}
		
	}

}
