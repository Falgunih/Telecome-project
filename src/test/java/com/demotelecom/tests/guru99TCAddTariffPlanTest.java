package com.demotelecom.tests;

import org.testng.annotations.Test;

public class guru99TCAddTariffPlanTest extends TestDriver {
	
	public guru99TCAddTariffPlanTest(){
		super();
	}

	@Test
	public void verifyguru99TCAddTariffPlanTest(){
		ghp.verifyHPaddTariffPlanlink();
		gatp.verifyaddtariffplanpage();
		gatpsmsg.verifyguru99TCATPpage();
		
	}
}
