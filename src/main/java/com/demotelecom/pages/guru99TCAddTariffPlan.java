package com.demotelecom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.demotelecom.base.TestBase;

public class guru99TCAddTariffPlan extends TestBase{

	@FindBy(xpath="//input[@ id='rental1']")
	private WebElement monthlyrent;
	@FindBy(xpath="//input [@id='local_minutes']")
	private WebElement freelocalminute;
	@FindBy(xpath="//input [@id='inter_minutes']")
	private WebElement freeinternationalminute;
	@FindBy(xpath="//input[@id='sms_pack'] ")
	private WebElement freesmspack;
	@FindBy(xpath="//input [@id='minutes_charges']")
	private WebElement localperminutecharge;
	@FindBy(xpath="//input[@id='inter_charges'] ")
	private WebElement interNchargeperminute;
	@FindBy(xpath="//input [@id='sms_charges'] ")
	private WebElement smscharges;
	@FindBy(xpath="//input[@name='submit' and @value='submit']")
	private WebElement submitATP;
	
	
	public guru99TCAddTariffPlan(){
		PageFactory.initElements(driver, this);
	}
	public void verifyaddtariffplanpage(){
		monthlyrent.sendKeys("123");
		freelocalminute.sendKeys("12");
		freeinternationalminute.sendKeys("123");
		freesmspack.sendKeys("12");
		localperminutecharge.sendKeys("123");
		interNchargeperminute.sendKeys("12");
		smscharges.sendKeys("123");
		submitATP.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}


