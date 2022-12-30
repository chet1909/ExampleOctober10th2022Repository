package com.sgtesting.prac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleUserloginlogoutTest {
	public  static WebDriver obrowser=null;

	public static void main(String[] args) {
		launch();
		navaigate();
		login();
		minimize();
		AddUSers();
		LoginLogoutAsusers();
		LoginAsUser1();
		LoginUser1ModifyPWD();
		LoginUser2ModifyPWD();
		LoginUser3ModifyPWD();
		LoginLogoutusingNewpwd();
		loginAsAdminModifyallusers();
		loginlogutAllUsersAgain();
		loginasAdminDeleteAllUsers();
	}

	private static void launch() {
		try{
			obrowser=new FirefoxDriver();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static void navaigate() {
		try{
			obrowser.get("http://localhost:81/login.do");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static void login() {
		try{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	private static void minimize() {
		try {
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void AddUSers() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			//addinguser1
			obrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();

			obrowser.findElement(By.name("firstName")).sendKeys("demo1");
			obrowser.findElement(By.name("lastName")).sendKeys("User1");
			obrowser.findElement(By.name("email")).sendKeys("demo1@orkut.com");
			obrowser.findElement(By.name("username")).sendKeys("demo1user1");
			obrowser.findElement(By.name("password")).sendKeys("Welcome1");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();    
			Thread.sleep(5000);

			//addinguser2
			obrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			obrowser.findElement(By.name("firstName")).sendKeys("demo2");
			obrowser.findElement(By.name("lastName")).sendKeys("User2");
			obrowser.findElement(By.name("email")).sendKeys("demo2@orkut.com");
			obrowser.findElement(By.name("username")).sendKeys("demo2user2");
			obrowser.findElement(By.name("password")).sendKeys("Welcome2");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome2");
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();    
			Thread.sleep(5000);

			//adding user3
			obrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			obrowser.findElement(By.name("firstName")).sendKeys("demo3");
			obrowser.findElement(By.name("lastName")).sendKeys("User3");
			obrowser.findElement(By.name("email")).sendKeys("demo2@orkut.com");
			obrowser.findElement(By.name("username")).sendKeys("demo3user3");
			obrowser.findElement(By.name("password")).sendKeys("Welcome3");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome3");
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();    
			Thread.sleep(5000);




		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LoginLogoutAsusers() {
		try {
			//logout as admin
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			//login and logout as user1
			obrowser.findElement(By.id("username")).sendKeys("demo1user1");
			obrowser.findElement(By.name("pwd")).sendKeys("Welcome1");
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			obrowser.findElement(By.xpath("/html/body/div[3]/div[3]/div/span[1]\r\n")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			//login and logout asuser2
			obrowser.findElement(By.id("username")).sendKeys("demo2user2");
			obrowser.findElement(By.name("pwd")).sendKeys("Welcome2");
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			obrowser.findElement(By.xpath("/html/body/div[3]/div[3]/div/span[1]\r\n")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			//login and logout asuser3
			obrowser.findElement(By.id("username")).sendKeys("demo3user3");
			obrowser.findElement(By.name("pwd")).sendKeys("Welcome3");
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			obrowser.findElement(By.xpath("/html/body/div[3]/div[3]/div/span[1]\r\n")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();

		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LoginAsUser1()
	{
		try 
		{
			obrowser.findElement(By.id("username")).sendKeys("demo1user1");
			obrowser.findElement(By.name("pwd")).sendKeys("Welcome1");
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("email")).clear();
			obrowser.findElement(By.name("email")).sendKeys("demo1@gmail.com");
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			
		
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void LoginUser1ModifyPWD()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("demo1user1");
			obrowser.findElement(By.name("pwd")).sendKeys("Welcomeuser1");
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(4000);
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("Welcome1");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			
			
		
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LoginUser2ModifyPWD() {
		try {

			//user2modifypwd
			obrowser.findElement(By.id("username")).sendKeys("demo2user2");
			obrowser.findElement(By.name("pwd")).sendKeys("Welcome2");
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(4000);
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("Welcomeuser2");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Welcomeuser2");
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void LoginUser3ModifyPWD() {
		try {

			//user2modifypwd
			obrowser.findElement(By.id("username")).sendKeys("demo3user3");
			obrowser.findElement(By.name("pwd")).sendKeys("Welcome3");
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(4000);
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("Welcomeuser3");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Welcomeuser3");
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void LoginLogoutusingNewpwd() {
		try {
			obrowser.findElement(By.id("username")).sendKeys("demo1user1");
			obrowser.findElement(By.name("pwd")).sendKeys("Welcome1");
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		
			Thread.sleep(6000);
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			//login and logout asuser2
			obrowser.findElement(By.id("username")).sendKeys("demo2user2");
			obrowser.findElement(By.name("pwd")).sendKeys("Welcomeuser2");
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			
			Thread.sleep(6000);
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			//login and logout asuser3
			obrowser.findElement(By.id("username")).sendKeys("demo3user3");
			obrowser.findElement(By.name("pwd")).sendKeys("Welcomeuser3");
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			
			Thread.sleep(6000);
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginAsAdminModifyallusers() {
		try {
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			//minimize
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);
			//user
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			//user1
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			obrowser.findElement(By.name("password")).sendKeys("Welcome1");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			
			//user2
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("Welcome2");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome2");
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			
			//user3
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("Welcome3");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome3");
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			//logout as Admin
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();

		

		}catch (Exception e) {
			e.printStackTrace();
		}
	}	
		private static void loginlogutAllUsersAgain()
		{
			try {
				
		
			//login and logout as user1
			obrowser.findElement(By.id("username")).sendKeys("demo1user1");
			obrowser.findElement(By.name("pwd")).sendKeys("Welcome1");
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			
			//login and logout asuser2
			obrowser.findElement(By.id("username")).sendKeys("demo2user2");
			obrowser.findElement(By.name("pwd")).sendKeys("Welcome2");
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			
			//login and logout asuser3
			obrowser.findElement(By.id("username")).sendKeys("demo3user3");
			obrowser.findElement(By.name("pwd")).sendKeys("Welcome3");
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		private static void loginasAdminDeleteAllUsers() {
			try{
				obrowser.findElement(By.id("username")).sendKeys("admin");
				obrowser.findElement(By.name("pwd")).sendKeys("manager");
				obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
				//users
				obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
				
				//delete user1
				obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				 obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
				 Alert oalert=obrowser.switchTo().alert();
				  Thread.sleep(1000);
				  String message=oalert.getText();
				  System.out.println(message);
				  oalert.accept();
				  Thread.sleep(3000);
				 //delete user2
				 obrowser.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				 obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
				 Thread.sleep(1000);
				  oalert.accept();
				 //dltuser3
				 obrowser.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				 obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
				 Thread.sleep(1000);
				  oalert.accept();
				  
				  //logout
				  obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
				  
				  
			}catch(Exception e) {
				
				e.printStackTrace();
			}
		}
		
	
	}
	
	
	
	
	
	

