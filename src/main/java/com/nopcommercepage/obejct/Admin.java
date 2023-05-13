package com.nopcommercepage.obejct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;

public class Admin {
	
	public WebDriver ldriver;
	 
	public Admin (WebDriver rdriver) {
		ldriver=rdriver;
		//PageFactory.initElements(rdriver,this );
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy (xpath = "//input[@id='Email']")
	WebElement txtemail;
	
	@FindBy (xpath = "//input[@id='Password']")
	WebElement txtpass;
  
	@FindBy (xpath = "/button[@type='submit']")
	WebElement Logbtn;
	
	public void setUsername (String uname) {
		
		txtemail.clear();
		txtemail.sendKeys(uname);
	}
	
	public void setpassword (String pass)  {
		txtpass.clear();
		txtpass.sendKeys(pass);
	}
	
	public void clicklogin ()  {
		Logbtn.click();
	}
}
