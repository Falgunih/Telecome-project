package com.demotelecom.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.demotelecom.Utils.guru99utils;
import com.demotelecom.base.TestBase;
import com.demotelecom.pages.guru99TCATPTCsuccessfulpage;
import com.demotelecom.pages.guru99TCAddTariffPlan;
import com.demotelecom.pages.guru99TCAddTariffPlanSmsgpage;
import com.demotelecom.pages.guru99TCAddTariffPlanToCust;
import com.demotelecom.pages.guru99TCPayBilllPage;
import com.demotelecom.pages.guru99TCaddcustomerPage;
import com.demotelecom.pages.guru99TChomePage;

public class TestDriver  extends TestBase{
	
	
	guru99utils gu;
	guru99TChomePage ghp;
	guru99TCaddcustomerPage gac;
	guru99TCAddTariffPlanToCust gatptc;
	guru99TCATPTCsuccessfulpage gatptcsuccessmsg;
	guru99TCAddTariffPlan gatp;
	guru99TCAddTariffPlanSmsgpage gatpsmsg;
	guru99TCPayBilllPage gpb;
	
	@BeforeMethod
	public void setup() {
		init();
		gac = new guru99TCaddcustomerPage();
		gu=new guru99utils();
		ghp =new guru99TChomePage();
		gatptc =new guru99TCAddTariffPlanToCust();
		gatptcsuccessmsg=new guru99TCATPTCsuccessfulpage();
		gatp =new guru99TCAddTariffPlan();
		gatpsmsg=new guru99TCAddTariffPlanSmsgpage();
		gpb =new guru99TCPayBilllPage();
	}

	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
