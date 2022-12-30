package com.sgtesting.pageobjectAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProject {
	public CreateProject(WebDriver obrowser)
	{
		PageFactory.initElements(obrowser, this);
    }
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement tasks;
	public WebElement gettasks()
	{
		return tasks;
	}
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnew;
	public WebElement getaddnew()
	{
		return addnew ;
	}
	
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement newproject;
	public WebElement getnewproject()
	{
		return newproject ;
	}
	
	
	private WebElement projectPopup_projectNameField;
	public WebElement getprojectname()
	{
		return projectPopup_projectNameField;
	}
	
	private WebElement projectDescriptionField;
	public WebElement getprojectdescription()
	{
		return projectDescriptionField;
	}
	
	
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createproject;
	public WebElement getcreateproject()
	{
		return createproject;
	}
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement editproject;
	public WebElement geteditproject()
	{
		return editproject;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement projectactions;
	public WebElement getprojectactions()
	{
		return projectactions;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement deleteproject;
	public WebElement getdeleteproject()
	{
		return deleteproject;
	}
	
	private WebElement projectPanel_deleteConfirm_submitTitle ;
	public WebElement getconfirmdeleteproject()
	{
		return projectPanel_deleteConfirm_submitTitle ;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]")
	private WebElement projectactive;
	public WebElement getprojectactive()
	{
		return projectactive;
	}
	
	@FindBy(xpath="//div[text()='Archived']")
	private WebElement projectarchive;
	public WebElement getprojectarchive()
	{
		return projectarchive;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
	private WebElement projecteditclose;
	public WebElement getprojecteditclose()
	{
		return projecteditclose;
	}
	
	
	
	@FindBy(xpath="//div[text()='Add New Task']")
	private WebElement addtasks;
	public WebElement getaddtasks()
	{
		return  addtasks;
	}
	
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement createnewtask;
	public WebElement getcreatenewtask()
	{
		return createnewtask;
	}
	
	@FindBy(xpath="//*[@id=\'ext-gen266\']")
	private WebElement selectcustomer ;
	public WebElement getselectcustomer()
	{
		return selectcustomer ;
	}
	
	@FindBy(xpath="//*[@id=\'ext-gen424\']")
	private WebElement selectdemocust ;
	public WebElement getdemocudtomer()
	{
		return selectdemocust ;
	}
	
	@FindBy(xpath="//*[@id=\'ext-gen275\']")
	private WebElement selectproject ;
	public WebElement getselectproject()
	{
		return selectproject ;
	}
	
	@FindBy(xpath="//*[@id=\'ext-gen630\']")
	private WebElement selectdemoproject ;
	public WebElement getselectdemoproject()
	{
		return selectdemoproject ;
	}
	
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	private WebElement taskname ;
	public WebElement gettaskname()
	{
		return taskname ;
	}
	
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement createtask ;
	public WebElement getcreatetask()
	{
		return createtask;
	}
	
	@FindBy(xpath="//div[text()='DemoTask']")
	private WebElement edittask ;
	public WebElement getedittask()
	{
		return edittask;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div")
	
	private WebElement taskactions ;
	public WebElement gettaskactions()
	{
		return taskactions;
		
	} 
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
	private WebElement deletetask ;
	public WebElement getdeletetask()
	{
		return deletetask;
		
	} 
	
	private WebElement taskPanel_deleteConfirm_submitTitle ;
	public WebElement getconfirmdeletetask()
	{
		return taskPanel_deleteConfirm_submitTitle;
	}
	
	
	

	

}
