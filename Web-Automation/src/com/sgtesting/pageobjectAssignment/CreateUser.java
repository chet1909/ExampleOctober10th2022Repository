package com.sgtesting.pageobjectAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateUser {
	public CreateUser(WebDriver obrowser)
	{
		PageFactory.initElements(obrowser, this);
	}
	
	@FindBy(xpath="//span[text()='Start exploring actiTIME']")
	private WebElement explore;
	public WebElement getexplore()
	{
		return explore;
	}
	
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement ouser;
	public WebElement getUsers()
	{
		return ouser;
	}
	
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement oadduser;
	public WebElement getAdduser()
	{
		return oadduser;
	}
	
	 private WebElement firstName;
	 public WebElement getfirstName()
		{
			return firstName;
		}
	 
	 private WebElement lastName;
	 public WebElement getlastName()
		{
			return lastName;
		}
	 
	 private WebElement email;
	 public WebElement getemail()
		{
			return email;
		}
	 
	 private WebElement userDataLightBox_usernameField;
	 public WebElement getUsername()
		{
			return userDataLightBox_usernameField;
		}
	 
	 private WebElement userDataLightBox_passwordField;
	 public WebElement getpassword()
		{
			return userDataLightBox_passwordField;
		}
	 
	 private WebElement userDataLightBox_passwordCopyField;
	 public WebElement getretypepassword()
		{
			return userDataLightBox_passwordCopyField;
		}
	 
	 @FindBy(xpath="//span[text()='Create User']")
	 private WebElement ocreateuser;
		public WebElement getcreateuser()
		{
			return ocreateuser;
		}
	@FindBy(xpath="//span[text()='user1, demo1']")
     private WebElement user1;
	  public WebElement getuser1()
		{
			return user1;
		}
	  
	 @FindBy(xpath="//span[text()='user2, demo2']")
	     private WebElement user2;
		  public WebElement getuser2()
			{
				return user2;
			}
		  
    @FindBy(xpath="//span[text()='user3, demo3']")
		     private WebElement user3;
			  public WebElement getuser3()
				{
					return user3;
				}		  
			  
	@FindBy(xpath="//span[text()='Save Changes']")	
	private WebElement savechanges;
	public WebElement getsavechanges()
	{
		return savechanges;
	}
	
		
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdeleteuser1()
			{
				return userDataLightBox_deleteBtn;
				       
			}
	 
	 
	 
}
