package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser1;
import pom.SwagLabAddToCartPage;
import pom.SwagLabLoginPage;
import pom.SwagLabProductSearchPage;

public class SwagLabProductSearchPageTest extends BaseTest {
	
	
	@BeforeMethod
	public void openBrowser() {
		driver=LaunchBrowser1.openBrowser();
		
	}
	
	@Test
	public void verifyingProductAddedToCart() {
		SwagLabLoginPageTest swagLabLoginPageTest = new SwagLabLoginPageTest();
		swagLabLoginPageTest.loginWithStandardUser();
		SwagLabProductSearchPage swagLabProductSearchPage = new SwagLabProductSearchPage(driver);
		swagLabProductSearchPage.clickOnAddToCartButton(0);
		String title1=swagLabProductSearchPage.getProductTitle(0);
		double price1 = swagLabProductSearchPage.getProductPrice(0);
		swagLabProductSearchPage.clickOnAddToCartButton(0);
		String title2=swagLabProductSearchPage.getProductTitle(1);
		double price2=swagLabProductSearchPage.getProductPrice(1);
		swagLabProductSearchPage.clickOnAddToCartIcon();
		SwagLabAddToCartPage swagLabAddToCartPage = new SwagLabAddToCartPage(driver);
		Assert.assertEquals(title1, swagLabAddToCartPage.getAddToCartProductTitle(0));
		Assert.assertEquals(title2, swagLabAddToCartPage.getAddToCartProductTitle(1));
		
	}
	

}
