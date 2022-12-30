package com.sgtesting.pageobjectexecution;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgtesting.pageobjectAssignment.ActiTimeLogin;
import com.sgtesting.pageobjectAssignment.CreateCustomer;
import com.sgtesting.pageobjectAssignment.CreateProject;


public class CreateTaskExecution {
	
	public static WebDriver obrowser=null;
	public static ActiTimeLogin opage=null;
	public static CreateProject otasks=null;
	public static CreateCustomer ocustomer=null;


	public static void main(String[] args) {

		launchBrowser();
		 navigate();
		 login();
		 minimize();
		 createcustomer();
		 createproject();
		 createtask();
		 deletetask();
		 Deletecustomer();
		 logout();
		 closeApp();
	
	}

private static void launchBrowser()
	
	{
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\GitRepository\\DemoWorkSpace\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			obrowser=new ChromeDriver();
			opage=new ActiTimeLogin(obrowser);
		    otasks=new CreateProject(obrowser);
			ocustomer=new CreateCustomer(obrowser);
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
	
	private static void createcustomer()
	{
		try {
			ocustomer.getTasks().click();
			Thread.sleep(2000);
			ocustomer.getaddnew().click();
			Thread.sleep(2000);
			ocustomer.getaddcustomer().click();
			Thread.sleep(2000);
			ocustomer.getcustomername().sendKeys("DemoCustomer");;
			Thread.sleep(2000);
			ocustomer.getcreatecustomer().click();
			Thread.sleep(2000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	private static void createproject()
	{
		try {
			//otasks.gettasks().click();
			//Thread.sleep(2000);
			otasks.getaddnew().click();
			Thread.sleep(2000);
			otasks.getnewproject().click();
			Thread.sleep(2000);
			otasks.getprojectname().sendKeys("DemoProject");
			otasks.getprojectdescription().sendKeys("It is a demo project");
			otasks.getcreateproject().click();
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createtask()
	{
		try {
			otasks.getaddtasks().click();
			Thread.sleep(2000);
			otasks.getcreatenewtask().click();
			Thread.sleep(2000);
			//otasks.getselectcustomer().click();
			//Thread.sleep(2000);
			//otasks.getdemocudtomer().click();
			//Thread.sleep(2000);
			//otasks.getselectproject().click();
			//Thread.sleep(2000);
			//otasks.getselectdemoproject().click();
			//Thread.sleep(2000);
			otasks.gettaskname().sendKeys("DemoTask");
			otasks.getcreatetask().click();
			Thread.sleep(2000);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}	
		
	}
	
	private static void deletetask()
	{
		try {
			otasks.getedittask().click();
			Thread.sleep(2000);
			otasks.gettaskactions().click();
			Thread.sleep(2000);
			otasks.getdeletetask().click();
			Thread.sleep(2000);
			otasks.getconfirmdeletetask().click();
			Thread.sleep(2000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	private static void Deletecustomer()
	{
		try
		{
			ocustomer.geteditcustomer().click();
			Thread.sleep(2000);
			ocustomer.getcustomeractions().click();
			Thread.sleep(2000);

			ocustomer.getdeletecustomer().click();
			Thread.sleep(2000);
			ocustomer.getconfirmdelete().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
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
