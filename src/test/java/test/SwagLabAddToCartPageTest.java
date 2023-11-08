package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser1;
import pom.SwagLabAddToCartPage;
import pom.SwagLabProductSearchPage;

public class SwagLabAddToCartPageTest extends BaseTest {
	
	@BeforeMethod
	public void openBrowser() {
		driver=LaunchBrowser1.openBrowser();
	}
	
	@Test
	public void verifyingProductRemovedFromCart() {
		SwagLabLoginPageTest swagLabLoginPageTest = new SwagLabLoginPageTest();
		swagLabLoginPageTest.loginWithStandardUser();
		SwagLabProductSearchPage swagLabProductSearchPage = new SwagLabProductSearchPage(driver);
		swagLabProductSearchPage.clickOnAddToCartButton(0);
		swagLabProductSearchPage.clickOnAddToCartIcon();
		SwagLabAddToCartPage swagLabAddToCartPage = new SwagLabAddToCartPage(driver);
		swagLabAddToCartPage.clickOnAddToCartRemoveButton(0);
		Assert.assertTrue(swagLabAddToCartPage.getProductSize()==0);
		
		
	}

}
