package testScripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePagePO;
import pom.LinkinGoogleResultPO;

public class LinkedinTest extends BaseTest{
	
	@Test
	public void linkedinTest()
	{
		driver.get(TEST_URL);
		GooglePagePO googlePagePO = new GooglePagePO(driver);
		googlePagePO.srchTxtBx().sendKeys("Linkdein");
		googlePagePO.srchTxtBx().sendKeys(Keys.ENTER);
		
		LinkinGoogleResultPO liPo = new LinkinGoogleResultPO(driver);
		int count=liPo.linkinSrchBxSize();
		System.out.println(count);
		
		liPo.linkinResSrchBx().click();
		/*
		try {
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		} catch (InterruptedException e) {
			
		}
		*/
		
		try {
			String eTitile="LinkedIn: Log In or Sign Up";
			String aTitle=driver.getTitle();
			Assert.assertEquals(eTitile, aTitle);
		} catch (Exception e) {
			Reporter.log("Exception Generated",true);
			Assert.fail();
		}
		
	}

}
