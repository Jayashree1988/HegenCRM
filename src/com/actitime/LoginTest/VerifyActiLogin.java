package com.actitime.LoginTest;

import org.testng.annotations.Test;

import com.actitime.genericLib.BaseTest;
import com.actitime.genericLib.FileLib;
import com.actitime.genericLib.WebDriverCommonLib;
import com.actitive.Pages.LoginPage;

public class VerifyActiLogin extends BaseTest{
	LoginPage lp;
	FileLib flib;
	WebDriverCommonLib wlib;
	
	@Test
	public void verifyActiValidLoginTest() throws Throwable
	{
		
		wlib=new WebDriverCommonLib();
		flib=new FileLib();
		
		String un = flib.getPropKeyValue(PROP_PATH, "username");
		String pwd = flib.getPropKeyValue(PROP_PATH, "password");
		System.out.println(un);
		System.out.println(pwd);
		lp=new LoginPage();
		
		
		wlib.verify(wlib.getTitle(), "actiTIME - Login", "Login Page is Displayed");
		
		lp.login(un, pwd);
		wlib.waitForTitleContains("Enter");
		wlib.verify(wlib.getTitle(), "actiTIME - Enter Time-Track", "Home Page is Displayed");
	}
	
	
	
	public void verifyActiInvalidLoginTest() {
		
	}
	
}


