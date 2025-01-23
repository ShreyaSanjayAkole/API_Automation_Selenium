package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Home extends Base {
	

	@FindBy(xpath="//img[@class='js lazyautosizes lazyloaded']")
	WebElement Siteicon;
	
	@FindBy(xpath="//img[@class='site-header__icon site-header__cart']")
	WebElement cart;
	
	@FindBy(xpath="//a[text()='RINGS']")
	WebElement rings;
	

	@FindBy(xpath="//a[text()='About']")
	WebElement About;
	

	@FindBy(xpath="//a[text()='Contact us']")
	WebElement Contactus;
	

	@FindBy(xpath="//a[text()='Shipping & Delivery']")
	WebElement ShippingDelivery;
	
	
	public Home() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifySiteLogo(){
		return Siteicon.isDisplayed();
	}
	
	public Ring clickOnRingLink(){
		rings.click();
		return new Ring();
	}
	
	public Cart clickOnCartLink(){
		rings.click();
		return new Cart();
	}
	
	public About clickOnAboutLink(){
		About.click();
		return new About();
	}
	
	
	

}
