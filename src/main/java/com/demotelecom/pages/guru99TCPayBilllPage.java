package com.demotelecom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.demotelecom.base.TestBase;

public class guru99TCPayBilllPage extends TestBase {
	@FindBy(xpath="//input [@id='customer_id' and @name ='customer_id']")
	private WebElement custidpaybill;
	@FindBy(xpath="//input[@name='submit' and @value ='submit']")
	private WebElement submitpaybilll;

	public guru99TCPayBilllPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void verifytitlepaybill(){
		String actualtitle = driver.getTitle();
		String expectedtitle = "Guru99 Telecom Billing";
		Assert.assertEquals(expectedtitle, actualtitle);
	}
	public void verifycustpaybilling(){
		custidpaybill.sendKeys(prop.getProperty("customerid"));
		submitpaybilll.click();
	}
	
	
	
}
