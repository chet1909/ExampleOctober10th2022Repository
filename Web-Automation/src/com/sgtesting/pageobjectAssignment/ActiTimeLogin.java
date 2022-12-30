package com.sgtesting.pageobjectAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLogin {
	
	public ActiTimeLogin(WebDriver obrowser)
	{
		PageFactory.initElements(obrowser, this);
	}
	
    private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	private WebElement pwd;
	public WebElement getpwd()
	{
		return pwd;
	}

	@FindBy(xpath="//div[text()='Login ']")private WebElement oLogin;
	
	public WebElement getLogin()
	{
		return oLogin;
	}
	

    private WebElement gettingStartedShortcutsPanelId;
		
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	@FindBy(linkText = "Logout")
	private WebElement oLogout;
	
	public WebElement getLogout()
	{
		return oLogout;
	}
}
