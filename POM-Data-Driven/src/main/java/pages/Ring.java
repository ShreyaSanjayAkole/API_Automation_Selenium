package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Ring extends Base{
	
	@FindBy(xpath="//a[@href='/collections/rings/products/copy-of-linear-band-ring']")
	WebElement Forest;
	
	public Ring() {
	    PageFactory.initElements(driver, this);
	}
	
	public Forestring SelectRing() throws InterruptedException{
		Forest.click();
		Thread.sleep(2000);
		    	
		return new Forestring();
	}

}
