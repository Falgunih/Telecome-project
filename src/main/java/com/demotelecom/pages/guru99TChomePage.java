package com.demotelecom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.demotelecom.base.TestBase;

public class guru99TChomePage extends TestBase {

	@FindBy(linkText = "Add Customer")
	private WebElement addcustomerlink;
	@FindBy(linkText="Add Tariff Plan to Customer")
	private WebElement addTariffPlanToCustlink;
	@FindBy(linkText="Add Tariff Plan")
	private WebElement addTariffPlanlink;
	@FindBy(linkText="Pay Billing")
	private WebElement paybillinglink;
	@FindBy(linkText="Guru99 telecom")
	private WebElement hplogo;
	@FindBy(xpath="//img[@src='images/pic01.jpg']")
	private WebElement hpimg;
	

	
	public guru99TChomePage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyHPaddcustomerlink() {
		addcustomerlink.click();
	}
	public void verifyHPaddTariffPlanToCustlink() {
		addTariffPlanToCustlink.click();
	}

	public void verifyHPaddTariffPlanlink() {
		addTariffPlanlink.click();
	}

	public void verifyHPpaybillinglink() {
		paybillinglink.click();
	}
	public void verifyHPlogo(){
		Assert.assertTrue(hplogo.isDisplayed());
		String text = hplogo.getText();
		System.out.println(text);
		
		
	}

	public void verifyHPimg() {
		Assert.assertTrue(hpimg.isDisplayed());

	}
	public void veerifyhpalllink(){
		
		Assert.assertTrue(addcustomerlink.isEnabled(),"notvisible");
		Assert.assertTrue(addTariffPlanToCustlink.isEnabled(),"notvisible");
		Assert.assertTrue(addTariffPlanlink.isEnabled(),"notvisible");
		Assert.assertTrue(paybillinglink.isEnabled(),"notvisible");
	}

}
