package com.sgtesting.prac; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBrowserDemo {
	public static WebDriver oBrowser=null;


	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		closeapplication();
	}
	private static void LaunchBrowser()
	{
		try
		{   
			System.setProperty("webdriver.chrome.driver","D:\\GitRepository\\DemoWorkSpace\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();

		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeapplication()
	{
		try
		{
			oBrowser.close();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}




}


