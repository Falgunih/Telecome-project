package com.demotelecom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.demotelecom.base.TestBase;

public class guru99TCAddTariffPlanToCust  extends TestBase{
	
	@FindBy(id="customer_id")
	private WebElement ATPCcustomerid;
	@FindBy(xpath="//input[@name='submit']")
	private WebElement ATPCsubmit;
	@FindBy(xpath=".//*[@id='main']/div/marquee/h3")
	private WebElement msgonATPTC;
	
	
	@FindBy(xpath=".//*[@id='main']/div/form/div[1]/table/tbody/tr/td[1]")
	private WebElement selectTP;
	@FindBy(xpath="//input[@name='submit' and @value='Add Tariff Plan to Customer']")
	private WebElement clickonATPTC;
	
	
	
	
	public guru99TCAddTariffPlanToCust(){
		PageFactory.initElements(driver, this);
	}
    
	public void verifyATPCtitlepage(){
		
		String actualtitle = driver.getTitle();
		String expectedtitle = "Guru99 Add Tariff Plan to Customer";
		Assert.assertEquals(expectedtitle, actualtitle,"Fail");
		
	}

	public void verifyATPTCpage() {

		ATPCcustomerid.sendKeys(prop.getProperty("customerid"));
		ATPCsubmit.click();

	}

	public void verifymsgonATPTC() {

		selectTP.click();

		clickonATPTC.click();

	}
	/*public boolean verifymsgonATPTCassert(){
		Assert.assertTrue(selectTP.isSelected());
		Assert.assertTrue(msgonATPTC.isDisplayed());
		return verifymsgonATPTCassert();
	}
*/
}