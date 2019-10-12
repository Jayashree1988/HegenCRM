package com.actitime.genericLib;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConsts{
	public static WebDriver driver;
	FileLib fLib;
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		fLib=new FileLib(); 
		String browserValue = fLib.getPropKeyValue(PROP_PATH, "browser");
		if(browserValue.equalsIgnoreCase("chrome"))
		{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		driver=new FirefoxDriver();
		}
		else 
		{
			Reporter.log("Enter Valid Browser",true);
		}
		driver.manage().window().maximize();
		driver.get(fLib.getPropKeyValue(PROP_PATH, "url"));
	}
	@AfterClass
	public void closeBrowser()
	{
		
		driver.quit();
	}

}
