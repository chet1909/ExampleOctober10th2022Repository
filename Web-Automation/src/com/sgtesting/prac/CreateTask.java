
package com.sgtesting.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CreateTask {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		login();
		CreateUser();
		createProject();
		NewTask();
		deleteTask();
		Deleteproject();
		deleteCustomer();
		close();
		
		
	
		}
	private static void launchbrowser()
	{
		try 
		{
			obrowser=new FirefoxDriver();
			obrowser.get("http://localhost:81/login.do");
		 	
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
   private static void login() {
	
		try 
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
		    obrowser.findElement(By.name("pwd")).sendKeys("manager");
		    obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		    Thread.sleep(2000);
		    obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		    Thread.sleep(2000);
		
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
   private static void CreateUser(){
	   
  
   try {
	   obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]")).click();
	   Thread.sleep(2000);
	   obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
	   Thread.sleep(2000);
	   obrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
	   Thread.sleep(2000);
	   obrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Customer1");
	   Thread.sleep(2000);
	   obrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("construction firm");
	   obrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
	   Thread.sleep(3000);
	  
   }catch (Exception e)
   {
	   e.printStackTrace();
   }
   }
    
   private static void createProject()
   {
	   try {
		   obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
		   Thread.sleep(2000);
           obrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
           Thread.sleep(2000);
           obrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("demoproject");
           
           obrowser.findElement(By.xpath("//*[@id=\'ext-gen44\']")).click();
           Thread.sleep(2000);
           obrowser.findElement(By.xpath("//*[@id=\'ext-gen125\']")).click();
           Thread.sleep(2000);
          
           obrowser.findElement(By.name("projectDescriptionField")).sendKeys(" it is a demo project");
           obrowser.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
           Thread.sleep(2000);
		   
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   private static void NewTask()
   {
	   try {
		   obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click();
		   Thread.sleep(2000);
		   obrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
		   Thread.sleep(2000);
		   obrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).sendKeys("DemoTask1");
		   Thread.sleep(2000);
		   obrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_commitBtn\']/div/span")).click();
		   Thread.sleep(3000);
		    
	   }catch (Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   private static void deleteTask()
   {
	   try {
		   obrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")).click();
		   Thread.sleep(3000);
           obrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
           Thread.sleep(2000);
           obrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[3]/div[4]/div/div[3]/div")).click();
           Thread.sleep(2000);
           obrowser.findElement(By.xpath("//*[@id=\'taskPanel_deleteConfirm_submitTitle\']")).click();
           Thread.sleep(2000);
           
		   
	   }catch (Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   private static void Deleteproject() {
	   try {
		   obrowser.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
		   Thread.sleep(3000);
		   obrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
		   Thread.sleep(3000);
		   obrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[4]/div/div[3]/div")).click();
		   Thread.sleep(3000);
		   obrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
		   Thread.sleep(4000);
	   }catch (Exception e) {
		   e.printStackTrace();
	   }
   }
   
   
 private static void deleteCustomer()
 
 {
	 try {
		
				 
		 
		 obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		 Thread.sleep(4000);
		 obrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
		 obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
		 Thread.sleep(3000);
		 obrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();
		 Thread.sleep(4000);
		 
		 //logout
		 obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
		 Thread.sleep(2000);
		 
		 //
		 
		 
	 }catch (Exception e)
	 {
		 e.printStackTrace();
	 }
 }
  
	private static void close()
	
	{
		try {
			obrowser.close();
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	
	
}
