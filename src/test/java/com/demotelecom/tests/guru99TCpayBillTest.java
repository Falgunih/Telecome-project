package com.demotelecom.tests;

import org.testng.annotations.Test;

public class guru99TCpayBillTest extends TestDriver {
	
	public guru99TCpayBillTest(){
		super();//to initialize the super classor parent class constructor
		
	}
	@Test
	public  void verifyguru99TCpaBillTest(){
		ghp.verifyHPpaybillinglink();
		gpb.verifytitlepaybill();
		gpb.verifycustpaybilling();
		gu.screenshot("paybill");
		
		
	}

}
