package com.actitive.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(name="username") private WebElement unTB;
	public void setUsername(String un)
	{
		unTB.sendKeys(un);
	}
	
	public WebElement getUnTB() {
		return unTB;
	}
	public WebElement getPwTB() {
		return pwTB;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getUsernameTB()
	{
		return unTB;
		
	}
	@FindBy(name="pwd") private WebElement pwTB;
	public void setPassword(String pwd)
	{
		pwTB.sendKeys(pwd);
	}
	
	@FindBy(xpath="//div[.='Login ']") private WebElement loginBtn;
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	
	
	public void login(String un,String pwd)
	{
		unTB.sendKeys(un);
		pwTB.sendKeys(pwd);
		loginBtn.click();
	}

}
