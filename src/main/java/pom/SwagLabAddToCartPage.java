package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabAddToCartPage {
	
	@FindBy (xpath="//div[@class='inventory_item_name']")private List<WebElement> addToCartProductTitle;
	
	@FindBy (xpath="//div[@class='inventory_item_price']")private List<WebElement> addToCartProductPrice;
	
	@FindBy (xpath="//button[@class='btn btn_secondary btn_small cart_button']")private List<WebElement> addToCartRemoveButton;
	
	@FindBy (xpath="//button[@id='checkout']")private WebElement checkoutButton;
	
	@FindBy (xpath="//button[@id='continue-shopping']")private WebElement continueShoppingButton;
	
	public SwagLabAddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getAddToCartProductTitle(int index) {
		return addToCartProductTitle.get(index).getText();
		
	}
	
	public double getAddToCartProductPrice(int index) {
		String pp=addToCartProductPrice.get(index).getText().replace("$", "");
		double addToCartPriceProduct=Double.parseDouble(pp);
		return addToCartPriceProduct;
	}
	
	public void clickOnAddToCartRemoveButton(int index) {
		addToCartRemoveButton.get(index).click();
	}
	
	public void clickOnContinueShoppingButton() {
		continueShoppingButton.click();
	}
	
	public void clickOnCheckOutButton() {
		checkoutButton.click();
	}
	
	public int getProductSize() {
		return addToCartRemoveButton.size();
		
	}

}
