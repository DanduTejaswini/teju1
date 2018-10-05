package com.genericfunctions;

import java.net.HttpURLConnection;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericFunctions 
{
	public static WebDriver driver;
	public static boolean teststatus;
	public static boolean LaunchBrowser(String browser,String url)
	{
		boolean status=true;
		try {
			switch (browser.toLowerCase()) 
				{
					case "firefox":
							driver=new FirefoxDriver();
							break;
				
					case "chrome":
				
						break;
	 
					default:
			
						break;
				}
			
				driver.navigate().to(url);
				driver.manage().window().maximize();
			} 
		catch (Exception e) 
		{
			status=false;
			System.out.println(e.getMessage());
		}
		return status;
	}
	
	public static boolean VerifyHomepage()
	{
		teststatus=true;
		try 
		{
			driver.findElement(By.linkText("Home")).isDisplayed();
			System.out.println("Home page is verified");
			
		} 
		catch (Exception e) 
		{
			teststatus=false;
			System.out.println("Home page is not displayed");
		}
		return teststatus;
		
		
	}
	
	public static boolean HTTPurlConnectioncheck(String Turl) 
	{
		teststatus=true;
		try
		{
			URL url=new URL(Turl);
			HttpURLConnection con=(HttpURLConnection) url.openConnection();
			con.connect();
			int responsecode=con.getResponseCode();
			System.out.println(responsecode);
			if(responsecode==200)
			{
				System.out.println("Link is active");
				
			}
			else 
			{
				System.out.println("Link is not active");
			}
		}	
		catch (Exception e) 
		{
			teststatus=false;
			System.out.println(e.getMessage());
		}
		return teststatus;
		
	}
}	
	
	
	
	

