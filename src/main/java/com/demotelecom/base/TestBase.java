package com.demotelecom.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;
	File file;
	public static FileInputStream fis;

	public TestBase() {
		try {
			prop = new Properties();
			file = new File(
					"C:/S2_Framwork_demoguru/com.demotelecom/src/main/java/com/demotelecom/config/config.properties");
			fis = new FileInputStream(file);
			prop.load(fis);

		} catch (Exception e) {
			System.out.println("File is not upload");
		}

	}

	public void init() {

		String browser = prop.getProperty("Browser");
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("Webdriver.chrome.driver",
					"C:/S2_Framwork_demoguru/com.demotelecom/Browser/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
