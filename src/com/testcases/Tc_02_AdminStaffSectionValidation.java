package com.testcases;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By.ById;

import com.genericfunctions.GenericFunctions;
import com.pages.AdminPage;
import com.pages.HomePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc_02_AdminStaffSectionValidation extends GenericFunctions
{
	@Given("Launch Firefox browser and application")
	public static void AdminaunchApplication()
	{
		LaunchBrowser("firefox","http://server/bank/");
		System.out.println("Launching application");
	}

	
	@When("^an application is opened click admin login using admin credentials \"([^\"]*)\" and \"([^\"]*)\" and verify admin home page is dispalyed$")
	public static boolean AdminLogin(String username,String password,DataTable credentials)
	{
		teststatus=true;
		try
		{
			List<List<String>> cred=credentials.raw();
			
			System.out.println(cred.size());
			for (int i = 1; i < cred.size(); i++) 
			{
				username=cred.get(i).get(0);
				password=cred.get(i).get(1);				
				HomePage pge=PageFactory.initElements(driver, HomePage.class);
				pge.clickAdminTab(username, password);
				System.out.println("Successfully Excecuted");
				driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
				pge.admin_logout();
				System.out.println("successsfully Logged Out");
				if(i<cred.size()-1)
				{
					pge.HomeTab.click();
				}

				
			}
		}
		catch (Exception e) 
			{
				teststatus=false;	
				System.out.println("Admin login not displayed");
				System.out.println(e.getMessage());
			}
		return teststatus;
	}
		
	@Then("verify tabs order under staff section")
	public static boolean VerifyTabsOrder()
	{
		teststatus=true;
		driver.findElement(By.xpath("//a[text()='Add staff member']")).click();
		try 
		{
			if(driver.findElement(By.xpath("(//*[text()='Add Staff'])[last()]")).isDisplayed())
			{
				System.out.println("Enter Add Staff fields");
			}
			else
			{
				System.out.println("Add staff not visible");
			}
		
			String[] tabs ={"Staff's name","gender","DOB","Relationship","Department","DOJ",
					"Address:","Mobile","Email id","Password"};
			List<WebElement> li=driver.findElements(By.xpath("(//*[text()='Add Staff'])[2]"
					+ "/ancestor::tr/following-sibling::tr/td[1]"));
			for (int i = 0; i < li.size(); i++) 
			{
				String lielements=li.get(i).getText();
				System.out.println(lielements);
				if (tabs[i].contains(lielements)) 
				{
					System.out.println(lielements+ "is verified");
				} 
				else 
				{
					System.out.println("Elements not verified");
					
				}
			}
		} 
		catch (Exception e) 
		{
			teststatus=false;
			System.out.println(e.getMessage());
		}
		return teststatus;
			
		
	}
	
@Then("verify all invalid inputs in Add staff section")
public static boolean VerifyInvalidInputs()
{
	teststatus=true;
	try 
		{
		List<WebElement> li=driver.findElements(By.xpath("(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr/td[1]"));
		} 
	catch (Exception e) 
		{
		teststatus=false;
		System.out.println(e.getMessage());
		}
	return teststatus;


}





















	
	
}
