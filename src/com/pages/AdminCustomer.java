package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.genericfunctions.GenericFunctions;

public class AdminCustomer extends GenericFunctions
{
	@FindBy(how = How.XPATH,using = "")
	public static WebElement Admin_AddCustomer;
	
	@FindBy(how = How.XPATH,using = "")
	public static WebElement Admin_EditCustomer;
	
	@FindBy(how = How.XPATH,using = "")
	public static WebElement Admin_DeleteCustomer;
	
	
	
	public static boolean clickAddCustomer()
	{
	teststatus=true;
		try 
		{
		Admin_AddCustomer.click();
		System.out.println("Successfully clicked on Add Customer");
		} 
		catch (Exception e) 
			{
			teststatus=false;
			System.out.println(e.getMessage());
			}
	return teststatus;	
	}
	
	
	public static boolean clickEditCustomer()
	{
		teststatus=true;
		try 
		{
			Admin_EditCustomer.click();
			System.out.println("Successfully clicked on Edit Customer");
		} 
			catch (Exception e) 
			{
				teststatus=false;
				System.out.println(e.getMessage());
			}
		return teststatus;
	}
	
	
	
	public static boolean clickDeleteCustomer()
	{
		teststatus=true;
		try 
		{
			Admin_DeleteCustomer.click();
			System.out.println("Successfully clicked on Delete Customer");
		} 
			catch (Exception e) 
			{
				teststatus=false;
				System.out.println(e.getMessage());
			}
		return teststatus;
	
	}
	
}
