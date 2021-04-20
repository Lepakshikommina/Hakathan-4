package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductAvbl extends PageBase {
	@FindBy(xpath="//*[@id=\"search\"]/input")
	WebElement SearchBox;
	@FindBy(xpath="//*[@id=\"search\"]/span/button")
	WebElement SearchButton;
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]/span")
	WebElement AddtoCart;
	@FindBy(xpath="//*[@id=\"cart-total\"]")
	WebElement Cart;
	@FindBy(xpath="//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong")
	WebElement CheckOut;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input")
	WebElement QuntityBox;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[1]/i")
	WebElement Refresh;
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[2]/a")
	WebElement CheckOutOption;

	public ProductAvbl(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void CheckOutProduct() {
		SearchBox.sendKeys("iphone");
		SearchButton.click();
		AddtoCart.click();
		Cart.click();
		CheckOut.click();
		QuntityBox.sendKeys("2");
		Refresh.click();
		CheckOutOption.click();

		
	}
	
	

}
