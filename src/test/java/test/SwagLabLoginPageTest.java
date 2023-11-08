package test;
	
	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

import pojo.LaunchBrowser1;
import pom.SwagLabLoginPage;
import test.BaseTest;

	public class SwagLabLoginPageTest extends BaseTest {
		
		@BeforeMethod
		public void openBrowser() {
			driver=LaunchBrowser1.openBrowser();
			
		}
		
		@Test(priority = 1)
		public void loginWithStandardUser() {
			SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(driver);
			swagLabLoginPage.enterUsername("standard_user");
			swagLabLoginPage.enterPassword("secret_sauce");
			swagLabLoginPage.clickOnLoginButton();
		}
		
		@Test(priority = 2)
		public void loginWithLockedOutUser() {
			SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(driver);
			swagLabLoginPage.enterUsername("locked_out_user");
			swagLabLoginPage.enterPassword("secret_sauce");
			swagLabLoginPage.clickOnLoginButton();
		}
		
		@Test(priority = 3)
		public void loginWithProblemUser() {
			SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(driver);
			swagLabLoginPage.enterUsername("problem_user");
			swagLabLoginPage.enterPassword("secret_sauce");
			swagLabLoginPage.clickOnLoginButton();
		}
		
		@Test(priority = 4)
		public void loginWithPerformanceGlitchUser() {
			SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(driver);
			swagLabLoginPage.enterUsername("performance_glitch_user");
			swagLabLoginPage.enterPassword("secret_sauce");
			swagLabLoginPage.clickOnLoginButton();
		}
		
		@Test(priority = 5)
		public void loginWithErrorUser() {
			SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(driver);
			swagLabLoginPage.enterUsername("error_user");
			swagLabLoginPage.enterPassword("secret_sauce");
			swagLabLoginPage.clickOnLoginButton();
		}
		
		@Test(priority = 6)
		public void loginWithVisualUser() {
			SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(driver);
			swagLabLoginPage.enterUsername("visual_user");
			swagLabLoginPage.enterPassword("secret_sauce");
			swagLabLoginPage.clickOnLoginButton();
		}

	}



