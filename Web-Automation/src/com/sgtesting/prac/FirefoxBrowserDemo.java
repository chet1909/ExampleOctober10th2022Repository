package com.sgtesting.prac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxBrowserDemo {
	
	public static WebDriver oBrowser=null;
	
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeapplication();
	}
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new FirefoxDriver();
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://sgtestinginstitute.com/");
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
			e.printStackTrace();		}
	}
	
}
