package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.genericfunctions.GenericFunctions;

public class AdminPage extends GenericFunctions
{
	@FindBy(how = How.XPATH,using = "//a[text()='Admin Home']")
	public static WebElement Admin_AdminPage;
	
	@FindBy(how = How.XPATH,using = "//a[text()='Change password']")
	public static WebElement Admin_ChangePassword;
	
	
	
	public static boolean clickAdminHomePage()
	{
		teststatus=true;
		try 
	{
	Admin_AdminPage.click();
	System.out.println("Successfully clicked on Admin Page");
	} 
	catch (Exception e) 
	{
		teststatus=false;
		System.out.println(e.getMessage());
	}
		return teststatus;
	
	}
	
	
	
	public static boolean clickChangePassword()
	{
		teststatus=true;
		try 
	{
	Admin_ChangePassword.click();
	System.out.println("Successfully clicked on Change Password");
	} 
	catch (Exception e) 
	{
		teststatus=false;
		System.out.println(e.getMessage());
	}
		return teststatus;
		
	}
	
	
	
}
