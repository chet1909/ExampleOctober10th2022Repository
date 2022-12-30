package com.sgtesting.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutusingFirefox {
	public static WebDriver oBrowser =null;

	public static void main(String[] args) {
		launchBrowser();
		Navigate();
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
		  oBrowser=new FirefoxDriver(); 
		 oBrowser.get("http://localhost:81/login.do"); 
	  }catch (Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  private static void Navigate()
  {
	  try
	  {
		  oBrowser.get("http://localhost:81/login.do");
	  }catch (Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  
  private static void login()
  {
	  try
	  {
		  oBrowser.findElement(By.id("username")).sendKeys("admin");
		  Thread.sleep(3000);
	  }catch (Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  
  private static void password()
  {
	  try
	  {
		  oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		  Thread.sleep(3000);
	  }catch (Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  
  private static void loginbutton()
  {
	  try
	  {
		  oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		  Thread.sleep(3000);
	  }catch (Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  
  private static void minimize()
  {
	  try
	  {
		  oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		  Thread.sleep(3000);
	  }catch (Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  
  private static void logout()
  {
	  try
	  {
		  oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
		  Thread.sleep(3000);
	  }catch (Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  
  private static void close()
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
