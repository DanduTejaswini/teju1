package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.genericfunctions.GenericFunctions;

public class HomePage extends GenericFunctions
{
	
	
	//***********************************  Test Objects ********************************
	@FindBy(how = How.XPATH, using = "(//a)[1]")
	public static WebElement HomeTab;
	
	@FindBy(how = How.XPATH, using = "(//a)[2]")
	public static WebElement adminTab;
	
	@FindBy(how = How.XPATH, using = "(//a)[3]")
	public static WebElement staffTab;
	
	@FindBy(how = How.XPATH, using = "(//a)[4]")
	public static WebElement featuresTab;
	
	@FindBy(how = How.XPATH, using = "(//a)[5]")
	public static WebElement contactusTab; 
	
	@FindBy(how = How.XPATH, using = "")
	public static WebElement Secure_Login;
	
	@FindBy(how = How.XPATH, using ="//input[@name='uname']")
	public static WebElement admin_Login_username;
	
	@FindBy(how = How.XPATH, using ="//input[@name='pwd']")
	public static WebElement admin_Login_password;
	
	@FindBy(how = How.XPATH, using ="//input[@name='submitBtn']")
	public static WebElement admin_Login_button_click;

	public static WebElement Username;
	public static WebElement Password;
	
	@FindBy(how = How.XPATH,using = "//a[text()='Logout']")
	public static WebElement Admin_logout;
	
	@FindBy(how = How.XPATH, using = "(//a/h3)[1]")
	public static WebElement Secure_Login_Tips;
	
	@FindBy(how = How.XPATH, using = "(//a/h3)[2]")
	public static WebElement Terms_And_Conditions;
	
	@FindBy(how = How.XPATH, using = "(//a/h3)[3]")
	public static WebElement FAQ; 

	
	
	
	
	//Click on admin tab
	
	public static boolean clickAdminTab(String username,String password) 
	{
		teststatus=true;
		try
		{
			adminTab.click();
			admin_Login_username.clear();
			admin_Login_username.sendKeys(username);
			admin_Login_password.clear();
			admin_Login_password.sendKeys(password);
			admin_Login_button_click.click();
			

		}
		catch(Exception e)
		{
			teststatus=false;
			System.out.println(e.getMessage());
		}
		return teststatus;
	}
	
	//Admin Logout
	
	public static boolean admin_logout()
	{
		teststatus=true;
		try 
		{
		Admin_logout.click();
		System.out.println("Admin Logout");
		}
		catch (Exception e) 
		{
		teststatus=false;
		System.out.println(e.getMessage());
		}
		return teststatus;
		
		
	}
	
	
	//Click on staff tab
	
		public static boolean clickStaffTab() 
		{
			teststatus=true;
			try 
			{
				staffTab.click();
				System.out.println("Successfully clicked on Staff Tab");
				
			}
			catch(Exception e)
			{
				teststatus=false;
				System.out.println(e.getMessage());
			}
			return teststatus;
		}
		
		
		
		//Click on Features tab
		  	
		
		public static boolean clickFeaturesTab() 
		{
			teststatus=true;
			try
			{
				featuresTab.click();
				System.out.println("Successfully clicked on Features Tab");
				
			}
			catch(Exception e)
			{
				teststatus=false;
				System.out.println(e.getMessage());
			}
			return teststatus;
		}

		//Click on contact us tab
		
		
		public static boolean clickContactUsTab() 
		{
			teststatus=true;
			try 
			{
				contactusTab.click();
				System.out.println("Successfully clicked on ContactUs Tab");
			}
			catch(Exception e)
			{
				teststatus=false;
				System.out.println(e.getMessage());
			}
			return teststatus;
		}
		
		//Secure log in
		
		
		
		
		public static boolean HomeSecureLogin()
		{
			teststatus=true;
			try 
			{
				Username.sendKeys("user02");
				Password.sendKeys("pass1234");
				Secure_Login.click();
				System.out.println("Login Successful");
			}
			catch(Exception e)
			{
				teststatus=false;
				System.out.println(e.getMessage());
			}
			return teststatus;
		}

		
		
		
		
				
		public static boolean HomeSecureLoginTips() 
		{
			teststatus=true;
			try 
			{
				
				Secure_Login_Tips.click();
				System.out.println("Secure login tips link clicked Successfully");
			}
			catch(Exception e)
			{
				teststatus=false;
				System.out.println(e.getMessage());
			}
			return teststatus;
		}
		
		
		
		
				
		public static boolean HomeTermsAndConditions() 
		{
			teststatus=true;
			try 
			{
				
				Secure_Login_Tips.click();
				System.out.println("Terms and Conditions link clicked Successfully");
			}
			catch(Exception e)
			{
				teststatus=false;
				System.out.println(e.getMessage());
			}
			return teststatus;
		}
		
		
		
		
				
		public static boolean HomeFAQ()
		{
			teststatus=true;
			try 
			{
				FAQ.click();
				System.out.println("FAQ's link clicked Successfully");
			}
			catch(Exception e)
			{
				teststatus=false;
				System.out.println(e.getMessage());
			}
			return teststatus;
		}

		

}
