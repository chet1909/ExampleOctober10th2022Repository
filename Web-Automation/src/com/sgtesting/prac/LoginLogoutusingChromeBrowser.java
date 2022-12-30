package com.sgtesting.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutusingChromeBrowser {
  public static WebDriver obrowser=null;
  
  
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		password();
		loginbutton();
		minimize();
		logout();
		close();
	}
   private static void launchBrowser()
   {
	   try
	   {
		   System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
	       obrowser=new ChromeDriver();
	   }catch (Exception e)
	     {
		   e.printStackTrace();
	     }
   }
	private static void navigate()
	{
		try
		{
			obrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch (Exception e)
          {
			e.printStackTrace();
          }
	
   }
   
   private static void login()
   {
	   try
	   {
		   obrowser.findElement(By.id("username")).sendKeys("admin");
		   
		   Thread.sleep(2000);
	   }catch (Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   
   private static void password()
   {
	   try
	   {
		   obrowser.findElement(By.name("pwd")).sendKeys("manager");
		   Thread.sleep(2000);
	   }catch (Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   private static void loginbutton()
   {
	   try
	   {
		   obrowser.findElement(By.id("loginButton")).click();
		   Thread.sleep(2000);
	   }catch (Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   private static void minimize()
   {
	   try
	   {
		   obrowser.findElement(By.xpath("/'gettingStartedShortcutsPanelId']")).click();
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
		   obrowser.findElement(By.id("logoutLink")).clear();
		   Thread.sleep(2000);
	   }catch (Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   private static void close()
   {
	   try
	   {
		   obrowser.close();
	   }catch (Exception e)
	   {
		   e.printStackTrace();
	   }
   }
}

