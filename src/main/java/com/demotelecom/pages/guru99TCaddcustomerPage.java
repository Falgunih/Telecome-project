package com.demotelecom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.demotelecom.base.TestBase;


public class guru99TCaddcustomerPage extends TestBase {
	
	
	
	//filling the form for add customer
	@FindBy(xpath="//input [@id='done']") WebElement backgroudcheckDone;
	
	@FindBy(xpath="//input [@id='pending']") WebElement backgroudcheckPending;
	
	@FindBy(id="fname") WebElement firstname;
	
	@FindBy(id="lname")WebElement lastname;

	@FindBy(id="email")WebElement email;
	
	@FindBy(xpath="//textarea [@id='message']")WebElement addressmessage;
	 
	@FindBy(id="telephoneno")WebElement telephoneno;

	@FindBy (xpath="//input [@name='submit']")WebElement submit;
	 
    @FindBy(xpath="//a [text()='Home'][@class='button']")WebElement Home;
  
	
	
	
	public guru99TCaddcustomerPage(){
	PageFactory.initElements(driver, this);
	}

	
	
	public void verifyaddcustomerTitle(){
		String actualtitle = driver.getTitle();
		String expectedtitle = "Guru99 Telecom Add Customer";
		Assert.assertEquals(expectedtitle, actualtitle);
		
	}
	
	
	public void addcustomerForm(String fn,String ln,String em,String add,String mob){
		backgroudcheckDone.click();
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		email.sendKeys(em);
		addressmessage.sendKeys(add);
		telephoneno.sendKeys(mob);
		
		submit.click();
		
		
		
	}
	public void gobacktohome(){
		Home.click();
		
	}



	
	}




