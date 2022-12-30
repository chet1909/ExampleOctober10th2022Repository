package com.sgtesting.pageobjectexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgtesting.pageobjectAssignment.ActiTimeLogin;

public class ActiTimeLoginLogout {
	
	public static WebDriver obrowser=null;
	public static ActiTimeLogin opage=null;
	
	public static void main(String[] args) {
  
		launchBrowser();
		navigate();
		login();
		logout();
		closeApp();

	}
	private static void launchBrowser()
	
	{
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\GitRepository\\DemoWorkSpace\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			obrowser=new ChromeDriver();
			opage=new ActiTimeLogin(obrowser);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			obrowser.navigate().to("http://localhost:81/login.do;jsessionid=14ed0h7cga2hn");
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			opage.getUserName().sendKeys("admin");
			opage.getpwd().sendKeys("manager");
			opage.getLogin().click();
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void logout()
	{
		try
		{
			opage.getLogout().click();
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeApp()
	{
		try
		{
			obrowser.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
