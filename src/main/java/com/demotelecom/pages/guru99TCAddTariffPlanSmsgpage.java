package com.demotelecom.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.demotelecom.base.TestBase;

public class guru99TCAddTariffPlanSmsgpage  extends TestBase{
	@FindBy(xpath="//h2[text()='Congratulation you add Tariff Plan']")
	private WebElement congomsgatp;
	@FindBy(xpath="//a[@class='button' and text()='Home']")
	private WebElement homebtnatp;
	
	
	public guru99TCAddTariffPlanSmsgpage(){
		PageFactory.initElements(driver, this);
	}
	
	public void verifyguru99TCATPpage(){
		boolean flag2 = congomsgatp.isDisplayed();
		Assert.assertTrue(flag2,"pass");
		homebtnatp.click();
	}
}
