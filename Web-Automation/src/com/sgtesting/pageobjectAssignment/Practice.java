package com.sgtesting.pageobjectAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Practice {
	
	public Practice(WebDriver obrowser)
	{
		PageFactory.initElements(obrowser, this);
	}
     
	@FindBy(xpath="//a[text()='Mobiles']")
	private WebElement Mobiles;
	public WebElement getMobiles()
	{
		return Mobiles;
	}
	
	@FindBy(xpath="//span[text()='Mobiles & Accessories']")
	private WebElement MandA;
	public WebElement getMandA()
	{
		return MandA;
	}
	
}


