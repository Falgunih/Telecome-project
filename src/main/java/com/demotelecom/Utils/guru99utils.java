package com.demotelecom.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.demotelecom.base.TestBase;

public class guru99utils extends TestBase{
	@Test
	public void screenshot(String testname){
		TakesScreenshot tsc = (TakesScreenshot)driver;
		 Date date = new Date() ;
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
		 File src = tsc.getScreenshotAs(OutputType.FILE);
		File tgt = new File("C:/S2_Framwork_demoguru/com.demotelecom/screenshot/screenshot_"+testname+"_"+dateFormat.format(date)+".png");
		try {
			FileUtils.copyFile(src, tgt);
		} catch (IOException e) {
			
			System.out.println("screenshot is not taken");
		}
		 
	}}
	
	