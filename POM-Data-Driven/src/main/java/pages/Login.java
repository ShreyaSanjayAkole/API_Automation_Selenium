package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Login extends Base {
	@FindBy(xpath = "//a[@class='site-header__icon site-header__account']")
	WebElement Loginicon;
	
	@FindBy(id = "CustomerEmail")
	WebElement email;
	
	@FindBy(id = "CustomerPassword")
	WebElement password;
	
	@FindBy(xpath = "//input[@value='Sign In']")
	WebElement login;
	
	@FindBy(xpath="//h1[text()='Create Account']")
	WebElement title;
	
	public Login(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public Home login(String un, String pwd) throws InterruptedException{
		Loginicon.click();
		Thread.sleep(2000);
		email.sendKeys(un);
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		login.click();
		    	
		return new Home();
	}


}
