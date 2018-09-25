package com.demotelecom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.demotelecom.base.TestBase;


public class  guru99TCATPTCsuccessfulpage extends TestBase
{
	
	@FindBy(xpath=".//*[@id='main']/div/h2")
	private WebElement successfulmsg;
	@FindBy(xpath=".//*[@id='main']/div/ul/li/a")
	private WebElement clickonhome;
	
	
	public guru99TCATPTCsuccessfulpage(){
		PageFactory.initElements(driver,this );
	}

	
	public void verifyguru99TCATPTCsuccessfulpage(){
		boolean flag = successfulmsg.isEnabled();
		Assert.assertTrue(flag);
		String title = driver.getTitle();
		Assert.assertEquals("Guru99 Telecom Tariff Plan", title,"title is not match");
		clickonhome.click();
	}
}
