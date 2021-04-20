package com.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class AddItem extends PageBase {
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[3]/a")
	WebElement components;
	@FindBy(xpath="//*[@id=\\\"menu\\\"]/div[2]/ul/li[3]/div/div/ul/li[2]/a")
	WebElement monitors;
	@FindBy(xpath="//*[@id=\\\"content\\\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a")
	WebElement applecinema;
	@FindBy(xpath="//*[@id=\"input-option223\"]/div[1]/label/input")
	WebElement checkbox;
	@FindBy(xpath="//*[@id=\"input-option208\"]")
	WebElement text;
	@FindBy(xpath="//*[@id=\"input-option217\"]")
	WebElement selectdrpdwn;
	@FindBy(xpath="//*[@id=\"input-option209\"]")
	WebElement textarea;
	@FindBy(xpath="//*[@id=\"button-upload222\"]")
	WebElement uploadfile;
	@FindBy(xpath="//*[@id=\"product\"]/div[7]/div/span/button/i")
	WebElement selectDate;
	@FindBy(xpath="//*[@id=\"product\"]/div[8]/div/span/button/i")
	WebElement selectTime;
	@FindBy(xpath="//*[@id=\"input-quantity\"]")
	WebElement Qty;
	@FindBy(xpath="//*[@id=\"button-cart\"]")
	WebElement Addtocart;
	
	
	public AddItem(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	} 
	
	public void Add_to_cart() {
		 
	 Actions action = new Actions(driver);
	 
	  action.moveToElement(components).build().perform();
	  action.click();
	  monitors.click();
	  applecinema.click();
	}
	public void Avbl_Information() {
		
		checkbox.click();
		text.sendKeys("test");
		select = new Select(selectdrpdwn);
		select.selectByVisibleText("Blue (+$3.00)");
		textarea.sendKeys("for testing" );
		selectDate.sendKeys("09252013");
		uploadfile.sendKeys("C:\\Users\\admin\\Desktop\\download.jfif");

        //Press tab to shift focus to time field

		selectDate.sendKeys(Keys.TAB);
		
		selectTime.sendKeys("0245PM");
		Qty.sendKeys("2");
		Addtocart.click();
		uploadfile.sendKeys("C:\\Users\\admin\\Desktop\\download.jfif");

	}
	
	
}
