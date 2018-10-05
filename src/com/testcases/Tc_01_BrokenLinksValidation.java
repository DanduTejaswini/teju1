package com.testcases;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.genericfunctions.GenericFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc_01_BrokenLinksValidation extends GenericFunctions
{
	@Given("as an user i want to launch Firefox browser")
	public static void LaunchApplication()
	{
		LaunchBrowser("firefox","http://server/bank/");
		System.out.println("Launching application");
	}

	@When("a browser is launched verify Homepage is displayed")
	public static void HomepageVerification()
	{
		VerifyHomepage();
		System.out.println("a browser is launched verify Homepage is displayed");
	}
	
	@Then("verify Tabs order")
	public static boolean VerifyTabsOrder()
	{
		teststatus=true;
		String[] tabs ={"Home","Admin","Staff","Features","Contact Us"};
		try {
			List<WebElement> li=driver.findElements(By.xpath("//a[normalize-space(text())='Home']/ancestor::ul/li/a"));
			for (int i = 0; i < li.size(); i++) 
			{
			String str=li.get(i).getText();
			System.out.println(str);
			if(tabs[i].contentEquals(str))
			{
				System.out.println(str+" Tab is displayed");
			}
			}
		} 
		catch (Exception e) 
		{
			teststatus=false;
			System.out.println("Tab is not displayed");	
		}
		return teststatus;
		
	}
	

	@Then("verify Broken links of the tabs")
	public static boolean VerifyBrokenLinks()
	{
		teststatus=true;
		String[] tabs ={"Home","Admin","Staff","Features","Contact Us"};
		try 
		{
			List<WebElement> li=driver.findElements(By.xpath("//a[normalize-space(text())='Home']/ancestor::ul/li/a"));
			for (int i = 0; i < li.size(); i++) 
			{
				String Turl=li.get(i).getAttribute("href");
				System.out.println(Turl);
				HTTPurlConnectioncheck(Turl);
			}
		} 
			catch (Exception e) 
		{
		teststatus=false;	
		System.out.println("Broken Links not verified");
		System.out.println(e.getMessage());
		}
		return teststatus;

	}
	
}
