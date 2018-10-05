package com.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.genericfunctions.GenericFunctions;
import com.pages.AdminStaff;
import com.pages.HomePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc_03_AddStaff extends GenericFunctions
{
@Given("Launch browser and open application")
public static void AddStaffLaunchApplication()
{
	LaunchBrowser("firefox","http://server/bank/");
	System.out.println("Launching application");
}


@When("app opened login \"([^\"]*)\" and \"([^\"]*)\" as admin credentials")
public static boolean AdminLogin(String username,String password,DataTable credentials)
{
	teststatus=true;
	try
	{
		List<List<String>> cred=credentials.raw();
		username=cred.get(0).get(0);
		password=cred.get(0).get(1);				
		HomePage pge1=PageFactory.initElements(driver, HomePage.class);
		pge1.clickAdminTab(username, password);
		System.out.println("AdminLogin Successful");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			
		}

		catch (Exception e) 
		{
			teststatus=false;	
			System.out.println("Admin login not displayed");
			System.out.println(e.getMessage());
		}
	return teststatus;

}

@Then("click add staff tab")
public static boolean clickaddstaff()
{
	teststatus=true;
	try 
	{
		AdminStaff pge1=PageFactory.initElements(driver, AdminStaff.class);
		pge1.AddStaff_AddStaffMember.click();
	} 
	catch (Exception e) 
	{
		teststatus=false;	
		System.out.println(e.getMessage());
	}
	
	return teststatus;

}

@Then("Enter credentials to Add Staff")
public static boolean AddStaffMem(String sname, String Gen, String DOB, String relation, String dept, String DOJ, String Address, String Mobile, String Emailid, String pwd,DataTable credentials)
{
	teststatus=true;
	try 
	{
		AdminStaff pge1=PageFactory.initElements(driver, AdminStaff.class);
		
		
		
		
		
	} 
	catch (Exception e) 
	{
		teststatus=false;	
		System.out.println(e.getMessage());
	}
	
	return teststatus;


}








}
