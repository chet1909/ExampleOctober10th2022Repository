package com.sgtesting.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ownprac {

	public static WebDriver obrowser=null;
	public static void main(String[] args) {
       
		launchBrowser();
		OpenMobiles();
		
		

	}
	private static void  launchBrowser()
	{
		try {
			obrowser=new FirefoxDriver();
			//open amazon
		    obrowser.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_dd92859bae2bd30479e0de78ed31fe11c5c37f6810d661b10abbd0b7&mfadid=adm");
    		Thread.sleep(2000);

		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
    private static void OpenMobiles()
    {
    	try {
    		obrowser.findElement(By.xpath("//a[text()='Mobiles']")).click();
    		Thread.sleep(2000);
    		//open one plus
    		obrowser.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[5]/div/section/div/div/div[1]/div[2]/div/ol/li[1]/a/div[1]/img")).click();
    		Thread.sleep(2000);
    		//explore all products
    		obrowser.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[3]/div/div/div/div/div[3]/div/div/div/a/img")).click();
    		Thread.sleep(3000);
    		//see all results
    		obrowser.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[3]/div/div/a/span")).click();
    		Thread.sleep(3000);
    	
    		
    		
    		
    		
    	}catch (Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
