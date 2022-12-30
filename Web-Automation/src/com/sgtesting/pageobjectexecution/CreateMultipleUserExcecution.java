package com.sgtesting.pageobjectexecution;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgtesting.pageobjectAssignment.ActiTimeLogin;
import com.sgtesting.pageobjectAssignment.CreateUser;

public class CreateMultipleUserExcecution {
	
	public static WebDriver obrowser=null;
	public static CreateUser ouser=null;
	public static ActiTimeLogin opage=null;
	
	public static void main(String[] args) {
  
		launchBrowser();
		navigate();
		login();
		 minimize();
		CreateUser();
		logoutasAdmin();
		loginwithNewUsers();
		ModifyPassword();
		loginWithNewPassword();
		loginAsAdminModifyPwd();
		loginAgainwithNewUsers();

		DeleteAllUsers();
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
	private static void CreateUser()
	{
		try 
		{
			ouser.getUsers().click();
		    Thread.sleep(2000);

		    //add user1
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
		    
		    //add user2
		    ouser.getAdduser().click();
		    Thread.sleep(2000);
		    ouser.getfirstName().sendKeys("demo2");
		    ouser.getlastName().sendKeys("user2");
		    ouser.getemail().sendKeys("User2@gmail.com");
		    ouser.getUsername().sendKeys("demo2user2");
		    ouser.getpassword().sendKeys("welcome2");
		    ouser.getretypepassword().sendKeys("welcome2");
		    ouser.getcreateuser().click();
		    Thread.sleep(2000);
		    
		    //add user3
		    ouser.getAdduser().click();
		    Thread.sleep(2000);
		    ouser.getfirstName().sendKeys("demo3");
		    ouser.getlastName().sendKeys("user3");
		    ouser.getemail().sendKeys("User3@gmail.com");
		    ouser.getUsername().sendKeys("demo3user3");
		    ouser.getpassword().sendKeys("welcome3");
		    ouser.getretypepassword().sendKeys("welcome3");
		    ouser.getcreateuser().click();
		    Thread.sleep(2000);
		    
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	private static void logoutasAdmin()
	{
		try
		{
			opage.getLogout().click();
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void loginwithNewUsers()
	{
		try
		{
			//loginUSER1
			
			opage.getUserName().sendKeys("demo1user1");
			opage.getpwd().sendKeys("welcome1");
			opage.getLogin().click();
			Thread.sleep(2000);
			ouser.getexplore().click();
			Thread.sleep(3000);
			//opage.getFlyOutWindow().click();
			//Thread.sleep(2000);
			
			//logout
			
			opage.getLogout().click();
			Thread.sleep(3000);
			
			//loginUSER2
			
			opage.getUserName().sendKeys("demo2user2");
			opage.getpwd().sendKeys("welcome2");
			opage.getLogin().click();
			Thread.sleep(2000);
			ouser.getexplore().click();
		    Thread.sleep(3000);
			//opage.getFlyOutWindow().click();
			//Thread.sleep(2000);
			
			//logout2
			
			opage.getLogout().click();
			Thread.sleep(3000);
			
			//loginUSER3
			
			opage.getUserName().sendKeys("demo3user3");
			opage.getpwd().sendKeys("welcome3");
			opage.getLogin().click();
			Thread.sleep(2000);
			ouser.getexplore().click();
			Thread.sleep(3000);
			//opage.getFlyOutWindow().click();
			//Thread.sleep(2000);
			
			//logout3
			
			opage.getLogout().click();
			Thread.sleep(3000);
			
			
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	//loginUserModifyPassword
	private static void ModifyPassword()
	{
		try{
			
			//loginuser1
			opage.getUserName().sendKeys("demo1user1");
			opage.getpwd().sendKeys("welcome1");
			opage.getLogin().click();
			Thread.sleep(2000);
			// modifyuser1password
			ouser.getUsers().click();
			Thread.sleep(2000);
			ouser.getuser1().click();
			Thread.sleep(2000);
			ouser.getpassword().sendKeys("welcome11");
			ouser.getretypepassword().sendKeys("welcome11");
			ouser.getsavechanges().click();
			Thread.sleep(2000);
			//logoutuser1
			opage.getLogout().click();
			Thread.sleep(3000);
			
			//loginuser2
			opage.getUserName().sendKeys("demo2user2");
			opage.getpwd().sendKeys("welcome2");
			opage.getLogin().click();
			Thread.sleep(2000);
			// modifyuser2password
			ouser.getUsers().click();
			Thread.sleep(2000);
			ouser.getuser2().click();
			Thread.sleep(2000);
			ouser.getpassword().sendKeys("welcome22");
			ouser.getretypepassword().sendKeys("welcome22");
			ouser.getsavechanges().click();
			Thread.sleep(2000);
			//logoutuser2
			opage.getLogout().click();
			Thread.sleep(3000);
			
			//loginuser3
			opage.getUserName().sendKeys("demo3user3");
			opage.getpwd().sendKeys("welcome3");
			opage.getLogin().click();
			Thread.sleep(2000);
			// modifyuser3password
			ouser.getUsers().click();
			Thread.sleep(2000);
			ouser.getuser3().click();
			Thread.sleep(2000);
			ouser.getpassword().sendKeys("welcome33");
			ouser.getretypepassword().sendKeys("welcome33");
			ouser.getsavechanges().click();
			Thread.sleep(2000);
			//logoutuser3
			opage.getLogout().click();
			Thread.sleep(3000);
			
			
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginWithNewPassword()
	{
		try {
		//loginuser1
			opage.getUserName().sendKeys("demo1user1");
			opage.getpwd().sendKeys("welcome11");
			opage.getLogin().click();
			Thread.sleep(3000);
			opage.getLogout().click();
			Thread.sleep(3000);
			
		//loginuser2
			opage.getUserName().sendKeys("demo2user2");
			opage.getpwd().sendKeys("welcome22");
			opage.getLogin().click();
			Thread.sleep(3000);
			opage.getLogout().click();
			Thread.sleep(3000);
		
		//loginuser3
			opage.getUserName().sendKeys("demo3user3");
			opage.getpwd().sendKeys("welcome33");
			opage.getLogin().click();
			Thread.sleep(3000);
			opage.getLogout().click();
			Thread.sleep(3000);
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsAdminModifyPwd()
	{
		try
		{
			opage.getUserName().sendKeys("admin");
			opage.getpwd().sendKeys("manager");
			opage.getLogin().click();
			Thread.sleep(2000);
			opage.getFlyOutWindow().click();
			Thread.sleep(2000);
			
			//user1
			ouser.getUsers().click();
			Thread.sleep(2000);
			ouser.getuser1().click();
			Thread.sleep(2000);
			ouser.getpassword().sendKeys("welcome111");
			ouser.getretypepassword().sendKeys("welcome111");
			ouser.getsavechanges().click();
			Thread.sleep(2000);
			
     	// modifyuser2password
			ouser.getUsers().click();
			Thread.sleep(2000);
			ouser.getuser2().click();
			Thread.sleep(2000);
			ouser.getpassword().sendKeys("welcome222");
			ouser.getretypepassword().sendKeys("welcome222");
			ouser.getsavechanges().click();
			Thread.sleep(2000);	
						
						
			// modifyuser3password
			ouser.getUsers().click();
			Thread.sleep(2000);
			ouser.getuser3().click();
			Thread.sleep(2000);
			ouser.getpassword().sendKeys("welcome333");
			ouser.getretypepassword().sendKeys("welcome333");
			ouser.getsavechanges().click();
			Thread.sleep(2000);
			
			opage.getLogout().click();
			Thread.sleep(3000);
												
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAgainwithNewUsers()
	{
		try
		{
			//loginUSER1
			
			opage.getUserName().sendKeys("demo1user1");
			opage.getpwd().sendKeys("welcome111");
			opage.getLogin().click();
			Thread.sleep(2000);
			
			
			//logout
			
			opage.getLogout().click();
			Thread.sleep(3000);
			
			//loginUSER2
			
			opage.getUserName().sendKeys("demo2user2");
			opage.getpwd().sendKeys("welcome222");
			opage.getLogin().click();
			Thread.sleep(2000);
			
			
			//logout2
			
			opage.getLogout().click();
			Thread.sleep(3000);
			
			//loginUSER3
			
			opage.getUserName().sendKeys("demo3user3");
			opage.getpwd().sendKeys("welcome333");
			opage.getLogin().click();
			Thread.sleep(2000);
			
			
			//logout3
			
			opage.getLogout().click();
			Thread.sleep(3000);
			
			
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	
	private static void DeleteAllUsers()
	{
		try {
			
			
			opage.getUserName().sendKeys("admin");
			opage.getpwd().sendKeys("manager");
			opage.getLogin().click();
			Thread.sleep(2000);
			opage.getFlyOutWindow().click();
			Thread.sleep(2000);
			
			ouser.getUsers().click();
		    Thread.sleep(2000);
		    
			
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
				 
				 ouser.getuser2().click();
				 Thread.sleep(2000);
				 ouser.getdeleteuser1().click();
				 Thread.sleep(2000);
		       	oalert.accept();
				 Thread.sleep(3000);
					 
			ouser.getuser3().click();
			Thread.sleep(2000);
			ouser.getdeleteuser1().click();
			Thread.sleep(2000);
			oalert.accept();
			 Thread.sleep(3000);
			
			
			
		} catch (Exception e)
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
