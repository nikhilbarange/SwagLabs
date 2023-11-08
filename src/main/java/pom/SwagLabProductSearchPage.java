package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabProductSearchPage {
	
	@FindBy (xpath="//div[@class='inventory_item_name ']")private List<WebElement> productTitle;
	
	@FindBy (xpath="//button[@class='btn btn_primary btn_small btn_inventory ']")private List<WebElement> addToCartButton;
	
	@FindBy (xpath="//div[@class='inventory_item_price']")private List<WebElement> productPrice;
	
	@FindBy (xpath="//a[@class='shopping_cart_link']")private WebElement addToCartIcon;
	
	
	public SwagLabProductSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getProductTitle(int index) {
		return productTitle.get(index).getText();
		
	}
	
	public void clickOnAddToCartButton(int index) {
		addToCartButton.get(index).click();
		
	}
	
	public double getProductPrice(int index) {
		String pp= productPrice.get(index).getText().replace("$", "");
		double priceProduct=Double.parseDouble(pp);
		return priceProduct;
	}
	
	public void clickOnAddToCartIcon() {
		addToCartIcon.click();
	}
	

}
