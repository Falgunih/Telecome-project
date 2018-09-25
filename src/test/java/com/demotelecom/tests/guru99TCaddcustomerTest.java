package com.demotelecom.tests;

import org.testng.annotations.Test;

public class guru99TCaddcustomerTest extends TestDriver {

	public guru99TCaddcustomerTest() {
		super();

	}

	@Test
	public void verifyaddcusomerpageTest() {
		ghp.verifyHPaddcustomerlink();
		gac.verifyaddcustomerTitle();
		gac.addcustomerForm("fal", "p", "123@123.com", "address1", "1235675678");
		gu.screenshot("g99TAC");
		gac.gobacktohome();
	}

}
