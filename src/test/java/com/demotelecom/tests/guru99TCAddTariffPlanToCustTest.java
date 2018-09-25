package com.demotelecom.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demotelecom.base.TestBase;

public class guru99TCAddTariffPlanToCustTest  extends TestDriver{

	public guru99TCAddTariffPlanToCustTest(){
		super();
		
	}

	@Test
	public void verifyATPTCTest() {
		ghp.verifyHPaddTariffPlanToCustlink();
		gatptc.verifyATPCtitlepage();
		gatptc.verifyATPTCpage();
		gatptc.verifymsgonATPTC();
		gatptcsuccessmsg.verifyguru99TCATPTCsuccessfulpage();
       
	}
	
		
	
	
}
