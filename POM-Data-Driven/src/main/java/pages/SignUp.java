package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class SignUp extends Base {
	
	@FindBy(id = "FirstName")
	WebElement FirstName;
	
	@FindBy(id = "LastName")
	WebElement LastName;
	
	@FindBy(id = "Email")
	WebElement Email;
	
	@FindBy(id = "CreatePassword")
	WebElement CreatePassword;
	
	@FindBy(xpath = "//input[@value='Create']")
	WebElement create;
	
	
	public SignUp(){
		PageFactory.initElements(driver, this);
		
	}
	
	
	public Login Signup(String first, String last,String email,String pass) throws InterruptedException{
		FirstName.sendKeys(first);
		Thread.sleep(2000);
		LastName.sendKeys(last);
		Thread.sleep(2000);
		Email.sendKeys(email);
		Thread.sleep(2000);
		CreatePassword.sendKeys(pass);
		Thread.sleep(2000);
		create.click();
		    	
		return new Login();
	}

}
