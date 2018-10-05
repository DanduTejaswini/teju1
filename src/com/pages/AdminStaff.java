package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.genericfunctions.GenericFunctions;

public class AdminStaff extends GenericFunctions
{
	@FindBy(how = How.XPATH,using = "//a[text()='Add staff member']")
	public static WebElement Admin_AddStaffMember;
	
	@FindBy(how = How.XPATH,using = "//a[text()='Edit staff member']")
	public static WebElement Admin_EditStaffMember;
	
	@FindBy(how = How.XPATH,using = "//a[text()='Delete staff']")
	public static WebElement Admin_DeleteStaff;
	
	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[1]/td[2]")
	public static WebElement AddStaff_StaffName;
	
	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[2]/td[2]/input")
	public static WebElement AddStaff_gender;

	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[3]/td[2]/input")
	public static WebElement AddStaff_DOB;

	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[4]/td[2]/select")
	public static WebElement AddStaff_Relationship;

	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[5]/td[2]/select")
	public static WebElement AddStaff_Department;

	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[6]/td[2]/input")
	public static WebElement AddStaff_DOJ;

	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[7]/td[2]")
	public static WebElement AddStaff_Address;

	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[8]/td[2]")
	public static WebElement AddStaff_Mobile;

	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[9]/td[2]")
	public static WebElement AddStaff_Emailid;

	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[10]/td[2]")
	public static WebElement AddStaff_Password;

	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[11]/td/input")
	public static WebElement AddStaff_AddStaffMember;

	
	public static boolean AddStaffMem(String sname, String Gen, String DOB, String relation, String dept, String DOJ, String Address, String Mobile, String Emailid, String pwd )
	{
		teststatus=true;
		try 
		{
		Admin_AddStaffMember.click();
		System.out.println("Successfully clicked on Add Staff");
		AddStaff_StaffName.sendKeys(sname);
		AddStaff_gender.sendKeys(Gen);
		AddStaff_DOB.sendKeys(DOB);
		AddStaff_Relationship.sendKeys(relation);
		AddStaff_Department.sendKeys(dept);
		AddStaff_DOJ.sendKeys(DOJ);
		AddStaff_Address.sendKeys(Address);
		AddStaff_Mobile.sendKeys(Mobile);
		AddStaff_Emailid.sendKeys(Emailid);
		AddStaff_Password.sendKeys(pwd);

		
		} 
		catch (Exception e) 
			{
			teststatus=false;
			System.out.println(e.getMessage());
			}
		return teststatus;
	}
	
	



	public static boolean clickEditStaff()
	{
		teststatus=true;
		try 
		{
			Admin_EditStaffMember.click();
			System.out.println("Successfully clicked on Edit Staff Member");
		} 
			catch (Exception e) 
			{
				teststatus=false;
				System.out.println(e.getMessage());
			}
		return teststatus;
	}
	
	
	public static boolean clickDeleteStaff()
	{
		teststatus=true;
		try 
		{
			Admin_DeleteStaff.click();
			System.out.println("Successfully clicked on Delete Staff");
		} 
			catch (Exception e) 
			{
				teststatus=true;
				System.out.println(e.getMessage());
			}
		return teststatus;
	
	}
	
}
