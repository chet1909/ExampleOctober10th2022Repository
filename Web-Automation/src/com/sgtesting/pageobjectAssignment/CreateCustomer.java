package com.sgtesting.pageobjectAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomer {
	public CreateCustomer(WebDriver obrowser)
	{
		PageFactory.initElements(obrowser, this);
	}
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement tasks;
	public WebElement getTasks()
	{
		return tasks;
	}
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnew;
	public WebElement getaddnew()
	{
		return addnew ;
	}
	
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement addcustomer;
	public WebElement getaddcustomer()
	{
		return addcustomer ;
	}
	
	private WebElement customerLightBox_nameField;
	public WebElement getcustomername()
	{
		return customerLightBox_nameField ;
	}
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createcustomer;
	public WebElement getcreatecustomer()
	{
		return createcustomer ;
	}
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement editcustomer;
	public WebElement geteditcustomer()
	{
		return editcustomer ;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement customeractive;
	public WebElement getcustomeractive()
	{
		return customeractive ;
	}
	
	@FindBy(xpath="//div[text()='Archived']")
	private WebElement customerarchive;
	public WebElement getcustomerarchive()
	{
		return customerarchive ;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
	private WebElement closecustomeredit;
	public WebElement getclosecustomeredit()
	{
		return closecustomeredit ;
	}
	
	@FindBy(xpath="//div[text()='ACTIONS']")
	private WebElement customeractions;
	public WebElement getcustomeractions()
	{
		return customeractions ;
	}
	
	
	
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement deletecustomer;
	public WebElement getdeletecustomer()
	{
		return deletecustomer;
	}
	
	@FindBy(xpath="//span[text()='Delete permanently']")
	private WebElement confirmdelete ;
	public WebElement getconfirmdelete()
	{
		return confirmdelete ;
	}
	
	
	

}
