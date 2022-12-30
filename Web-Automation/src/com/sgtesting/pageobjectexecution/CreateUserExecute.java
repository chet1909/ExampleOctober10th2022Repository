package com.sgtesting.pageobjectexecution;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgtesting.pageobjectAssignment.ActiTimeLogin;
import com.sgtesting.pageobjectAssignment.CreateUser;

public class CreateUserExecute {
	
	public static WebDriver obrowser=null;
	public static CreateUser ouser=null;
	public static ActiTimeLogin opage=null;
	
	public static void main(String[] args) {
  
		launchBrowser();
		navigate();
		login();
		minimize();
		Create();
		logout();
		closeApp();

	}
	private static void launchBrowser()
	
	{
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\GitRepository\\DemoWorkSpace\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			obrowser=new ChromeDriver();
			ouser=new CreateUser(obrowser);
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
	private static void minimize()
	{
		try {
			opage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Create()
	{
		try 
		{
			ouser.getUsers().click();
		    Thread.sleep(2000);

		    ouser.getAdduser().click();
		    Thread.sleep(2000);
		    ouser.getfirstName().sendKeys("demo1");
		    ouser.getlastName().sendKeys("user1");
		    ouser.getemail().sendKeys("User1@gmail.com");
		    ouser.getUsername().sendKeys("demo1user1");
		    ouser.getpassword().sendKeys("welcome1");
		    ouser.getretypepassword().sendKeys("welcome1");
		    ouser.getcreateuser().click();
		    Thread.sleep(2000);
		    
		    //delete user1
		    ouser.getuser1().click();
		    Thread.sleep(2000);
		    ouser.getdeleteuser1().click();
		    Thread.sleep(5000);
		    Alert oalert=obrowser.switchTo().alert();
			  Thread.sleep(1000);
			  String message=oalert.getText();
			  System.out.println(message);
			  oalert.accept();
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
			opage.getLogout().click();
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeApp()
	{
		try
		{
			obrowser.close();
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
